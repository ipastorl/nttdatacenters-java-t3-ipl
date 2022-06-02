package nttdata.javat3;

import nttdata.javat3.business.ManagementServiceImpl;
import nttdata.javat3.business.ManagmentServiceI;

/**
 * The type T 3 main ipl. Añade unas personas, las muestra y realiza una búsqueda de estudiantes de DAM
 */
public class T3MainIPL {
    // crear interfaz
    private static final ManagmentServiceI MANAGEMENT_SERVICE = new ManagementServiceImpl();

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        // Añadir personas
        addPeople();

        // mostrar todas las personas del sistema añadidas
        MANAGEMENT_SERVICE.showPeople();

        // mostrar sólo los estudiantes de DAM
        MANAGEMENT_SERVICE.searchStudentByModality(ManagmentServiceI.Modality.DAM, ManagmentServiceI.students);
    }

    /**
     * Método extraído del main, que inserta unas personas específicas
     */
    private static void addPeople() {
        // Insertar Estudiantes
        MANAGEMENT_SERVICE.addPerson(ManagmentServiceI.TypePerson.STUDENT
                ,"Pedro Rico"
                , "16555562M"
                , ManagmentServiceI.School.IESCAMPANILLA
                , ManagmentServiceI.Modality.DAM
                , null
                , null);
        MANAGEMENT_SERVICE.addPerson(ManagmentServiceI.TypePerson.STUDENT
                ,"Marco Maestre"
                , "43667567X"
                , ManagmentServiceI.School.IESALIXAR
                , ManagmentServiceI.Modality.DAW
                , null
                , null);
        MANAGEMENT_SERVICE.addPerson(ManagmentServiceI.TypePerson.STUDENT
                ,"Pablo Garzón"
                , "38567562L"
                , ManagmentServiceI.School.IESCESUR
                , ManagmentServiceI.Modality.DAM
                , null
                , null);
        MANAGEMENT_SERVICE.addPerson(ManagmentServiceI.TypePerson.STUDENT
                ,"Ernesto Villanueva"
                , "79567567V"
                , ManagmentServiceI.School.IESSOTERO
                , ManagmentServiceI.Modality.DAM
                , null
                , null);

        // Insertar empleados
        MANAGEMENT_SERVICE.addPerson(ManagmentServiceI.TypePerson.EMPLOYEE
                , "Carlos Belmonte"
                , "18999555M"
                , null
                , null
                , "Proyecto1"
                , ManagmentServiceI.Categorie.ANALYST);
        MANAGEMENT_SERVICE.addPerson(ManagmentServiceI.TypePerson.EMPLOYEE
                , "Manuel Hernández"
                , "11111111O"
                , null
                , null
                , "Proyecto2"
                , ManagmentServiceI.Categorie.ANALYST);
        MANAGEMENT_SERVICE.addPerson(ManagmentServiceI.TypePerson.EMPLOYEE
                , "Cecilio Ortega"
                , "886666999V"
                , null
                , null
                , "Proyecto1"
                , ManagmentServiceI.Categorie.DEVELOPER);
        MANAGEMENT_SERVICE.addPerson(ManagmentServiceI.TypePerson.EMPLOYEE
                , "Vanessa Rico"
                , "16454454G"
                , null
                , null
                , "Proyecto3"
                , ManagmentServiceI.Categorie.SENIORDEVELOPER);
        MANAGEMENT_SERVICE.addPerson(ManagmentServiceI.TypePerson.EMPLOYEE
                , "Antonia Del Río"
                , "16444444L"
                , null
                , null
                , "Proyecto2"
                , ManagmentServiceI.Categorie.DEVELOPER);
        MANAGEMENT_SERVICE.addPerson(ManagmentServiceI.TypePerson.EMPLOYEE
                , "Isabel Pastor"
                , "44555666V"
                , null
                , null
                , "Proyecto3"
                , ManagmentServiceI.Categorie.JUNIORDEVELOPER);
        MANAGEMENT_SERVICE.addPerson(ManagmentServiceI.TypePerson.EMPLOYEE
                , "Alberto Núñez"
                , "66333333B"
                , null
                , null
                , "Proyecto4"
                , ManagmentServiceI.Categorie.ARCHITECT);
    }
}
