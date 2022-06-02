package nttdata.javat3.business;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The interface Managment service i.
 */
public interface ManagmentServiceI{
    // atributos
    /**
     * Mapa para almacenar Personas
     */
    Map<Person, School> students = new LinkedHashMap<>();
    /**
     * The constant employees.
     */
    Map<Person, Categorie> employees = new LinkedHashMap<>();

    /**
     * Categorías de contratación
     */
    enum Categorie{
        /**
         * Juniordeveloper categories.
         */
        JUNIORDEVELOPER,
        /**
         * Developer categories.
         */
        DEVELOPER,
        /**
         * Seniordeveloper categories.
         */
        SENIORDEVELOPER,
        /**
         * Analyst categories.
         */
        ANALYST,
        /**
         * Architect categories.
         */
        ARCHITECT
    }

    /**
     * The enum School.
     */
    enum School{
        /**
         * Iesalixar school.
         */
        IESALIXAR,
        /**
         * Iessotero school.
         */
        IESSOTERO,
        /**
         * Iescampanilla school.
         */
        IESCAMPANILLA,
        /**
         * Ieshmachado school.
         */
        IESHMACHADO,
        /**
         * Iescesur school.
         */
        IESCESUR
    }

    /**
     * The enum Modality.
     */
    enum Modality {
        /**
         * Dam modality.
         */
        DAM,
        /**
         * Daw modality.
         */
        DAW
    }

    /**
     * The enum Type person.
     */
    enum TypePerson {
        /**
         * Person type person.
         */
        EMPLOYEE,
        /**
         * Student type person.
         */
        STUDENT
    }


    /**
     * Add person boolean.
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
    boolean addPerson (TypePerson typePerson, String name, String dni
            , School school, Modality modality
            , String project, Categorie categorie);

    /**
     * Show people.
     */
    void showPeople ();

    /**
     * Search student by modality.
     *
     * @param modality the modality
     * @param students the students
     */
    void searchStudentByModality(Modality modality, Map<Person,School> students);
}
