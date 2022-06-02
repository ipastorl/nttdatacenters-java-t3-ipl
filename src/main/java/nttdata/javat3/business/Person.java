package nttdata.javat3.business;

import java.util.Objects;

/**
 * Clase abstracta que contiene DNI y nombre para las subclases
 * Employee y Student
 * Contiene el método abstracto showDetails()
 */
public abstract class Person {
    // Atributos
    /** Cadena de texto para el dni de la persona */
    private String DNI;
    /** Cadena de texto para el nombre de la persona */
    private String name;

    // Constructor
    /**
     * Instancia una nueva persona.
     *
     * @param DNI  the dni
     * @param name the name
     */
    public Person(String DNI, String name) {
        this.DNI = DNI;
        this.name = name;
    }

    /**
     * Método abstracto que muestra por pantalla la información de la persona
     */
    public abstract void showDetails();

    // Getters and Setters
    /**
     * Gets dni.
     *
     * @return the dni
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Sets dni.
     *
     * @param DNI the dni
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "DNI='" + DNI + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getDNI().equals(person.getDNI());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDNI());
    }
}
