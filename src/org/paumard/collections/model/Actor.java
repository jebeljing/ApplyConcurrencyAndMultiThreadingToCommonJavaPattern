package org.paumard.collections.model;

/**
 * Created by jingshanyin on 8/21/17.
 */
public class Actor {

    private String lastName, firstName;

    public Actor(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String firstName() {
        return firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;

        if (!lastName.equals(actor.lastName)) return false;
        return firstName.equals(actor.firstName);
    }

    @Override
    public int hashCode() {
        int result = lastName.hashCode();
        result = 31 * result + firstName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
