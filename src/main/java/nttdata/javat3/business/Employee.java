package nttdata.javat3.business;

/**
 * Clase empleado que hereda los atributos dni y nombre de la superclase Person
 * del que además implementa el método showDetails(),
 * contiene los atributos propios categoría y proyecto
 */
public class Employee extends Person {

    // Atributos
    /** Categoría de contratación del empleado (enum implementada de la interfaz ManagmentServiceI) */
    private ManagmentServiceI.Categorie categorie;
    /** Nombre del proyecto asignado al empleado */
    private String project;

    // Constructor
    /**
     * Instancia un nuevo Empleado.
     *
     * @param DNI       the dni
     * @param name      the name
     */
    public Employee(String DNI, String name) {
        super(DNI, name);
    }



    // Implementación
    /**
     * Método abstracto que muestra por pantalla la información del empleado
     */
    @Override
    public void showDetails() {
        String info = "DNI : "
                .concat(super.getDNI())
                .concat("\n")
                .concat("Nombre : ")
                .concat(super.getName())
                .concat("\n")
                .concat("Categoría : ")
                .concat(getCategorie().toString())
                .concat("\n")
                .concat("Proyecto : ")
                .concat(getProject());
        System.out.println(info);
    }

    // Getters and Setters
    protected ManagmentServiceI.Categorie getCategorie() {
        return categorie;
    }

    /**
     * Sets categorie.
     *
     * @param categorie the categorie
     */
    protected void setCategorie(ManagmentServiceI.Categorie categorie) {
        this.categorie = categorie;
    }

    /**
     * Gets proyecto.
     *
     * @return String
     */
    protected String getProject() {
        return project;
    }

    /**
     * Sets proyecto.
     *
     * @param project  String
     */
    protected void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "categorie=" + categorie +
                ", proyecto='" + project + '\'' +
                '}';
    }

}
