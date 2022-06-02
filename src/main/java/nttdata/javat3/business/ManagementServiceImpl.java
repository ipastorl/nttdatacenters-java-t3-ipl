package nttdata.javat3.business;


import java.util.Map;
import java.util.Set;

/**
 * The type Management service añade personas a un Mapa, los muestra por pantalla y/o realiza búsquedas por modalidad
 */
public class ManagementServiceImpl implements ManagmentServiceI {


    public void searchStudentByModality(Modality modality, Map<Person,School> students){
        // iterar el mapa
        Set<Map.Entry<Person,School>> set = students.entrySet(); // crear un conjunto
        String salida = "\n========= ESTUDIANTES DE LA MODALIDAD "
                .concat(modality.toString())
                        .concat(" ==========");
        System.out.println(salida);
        for (Map.Entry<Person,School> item:set // recorrer el conjunto
             ) {
            if ( ( (Student) item.getKey()).getModality().equals(modality) ) { // si el estudiante coincide con la modalidad
                // salida por pantalla
                System.out.println(item.getKey());
            }
        }
    }

    /**
     * Add person boolean. Si los campos necesarios son nulos o están vacíos, lanza excepción
     *
     * @param typePerson the type person
     * @param name       the name
     * @param dni        the dni
     * @param school     the school
     * @param modality   the modality
     * @param project    the project
     * @param categorie  the categorie
     * @return the boolean
     */
    @Override
    public boolean addPerson(TypePerson typePerson, String name, String dni
            , School school, Modality modality
            , String project, Categorie categorie) {

        // valor de retorno como false
        boolean added = false;
        // Crear variable persona
        Person person;

        // nombre y dni no pueden ser nulos
        if(!(name.isEmpty() || dni.isEmpty())) {
            switch (typePerson){ // si son empleados o estudiantes

                case EMPLOYEE:
                    if (!(categorie==null || project.isEmpty())){ // si los parámetros no son nulos
                        person = new Employee(dni,name); // crea un empleado

                        // añadir los parámetros categoría y proyecto
                        ((Employee) person).setCategorie(categorie);
                        ((Employee) person).setProject(project);

                        // añadir al Mapa<Person,Categorie> empleados
                        employees.put(person,categorie);

                        // valor de retorno añadido a true
                        added = true;

                    } else {
                        // los parámetros son nulos, por lo que no se añade, lanza excepción y muestra mensaje
                        System.out.println("¡¡¡¡ No se pudo insertar al empleado !!!!");
                        throw new IllegalArgumentException("Para añadir un empleado, los campos categoría y proyecto no pueden ser nulos");
                    }
                    break;

                case STUDENT:
                    if(!(modality==null || school==null)){ // si los parámetros no son nulos
                        person = new Student(dni,name); // crea un estudiante

                        // añadir los parámetros modalidad e instituto
                        ((Student) person).setModality(modality);
                        ((Student) person).setSchool(school);

                        // añadir al Mapa<Person,School> estudiantes
                        students.put(person,school);

                        // valor de retorno añadido a true
                        added = true;

                    } else {
                        // los parámetros son nulos, por lo que no se añade, lanza excepción y muestra mensaje
                        System.out.println("¡¡¡¡ No se pudo insertar al estudiante !!!!");
                        throw new IllegalArgumentException("Para añadir un estudiante, los campos modalidad e instituto no pueden ser nulos");
                    }
                    break;

                default:
                    // si no son estudiantes, ni empleados, pueden ser nulos
                    System.out.println("¡¡¡¡ No se pudo insertar a la persona !!!!");
                    throw new IllegalArgumentException("Se debe de introducir como parámetro el tipo de persona (Empleado o Estudiante), no puede ser nulo");
            }

        } else { // si dni o nombre son nulos
            System.out.println("¡¡¡¡ No se pudo insertar a la persona !!!!");
            throw new IllegalArgumentException("Los campos dni y nombre de la persona no pueden estar vacíos");
        }


            // se ha confirmado la insercción
        return added;
    }

    @Override
    public void showPeople() {
        Set<Map.Entry<Person, Categorie>> emp = employees.entrySet(); // conjunto de entradas de empleados
        Set<Map.Entry<Person, School>> stu = students.entrySet(); // conjunto de entradas de estudiantes

        System.out.println("\n========= EMPLEADOS =========");
        // iterar empleados
        for (Map.Entry<Person, Categorie> e : emp) {
            System.out.println(e);
        }

        System.out.println("\n========= ESTUDIANTES ========");
        // iterar estudiantes
        for (Map.Entry<Person, School> e : stu) {
            System.out.println(e);
        }
    }
}
