package nttdata.javat3.business;

/**
 * Clase estudiante que hereda los atributos dni y nombre de la superclase Person
 * del que además implementa el método showDetails(),
 * contiene los atributos propios Centro educativo y modalidad del grado que cursa
 */
public class Student extends Person {

    /** Centro al que pertenece el alumno (enum implementada de la interfaz ManagmentServiceI) */
    private ManagmentServiceI.School school;
    /** Modalidad que estudia el alumno en el grado (enum implementada de la interfaz ManagmentServiceI) */
    private ManagmentServiceI.Modality modality;

    /**
     * Instancia un nuevo Estudiante.
     *
     * @param DNI             the dni
     * @param name            the name
     */
    public Student(String DNI, String name) {
        super(DNI, name);
    }

    // Implementación
    /**
     * Método abstracto que muestra por pantalla la información del estudiante
     */
    @Override
    public void showDetails() {
        String info = "DNI : "
                .concat(super.getDNI())
                .concat("\n")
                .concat("Nombre : ")
                .concat(super.getName())
                .concat("\n")
                .concat("Centro Educativo : ")
                .concat(getSchool().toString())
                .concat("\n")
                .concat("Modalidad : ")
                .concat(getModality().toString());
        System.out.println(info);
    }

    /**
     * Gets centro educativo.
     *
     * @return school
     */
// Getters and Setters
    public ManagmentServiceI.School getSchool() {
        return school;
    }

    /**
     * Sets centro educativo.
     *
     * @param school School
     */
    public void setSchool(ManagmentServiceI.School school) {
        this.school = school;
    }

    /**
     * Gets modalidad.
     *
     * @return madality
     */
    public ManagmentServiceI.Modality getModality() {
        return modality;
    }

    /**
     * Sets modalidad.
     *
     * @param modality Modality
     */
    public void setModality(ManagmentServiceI.Modality modality) {
        this.modality = modality;
    }

}
