package ac.za.cput;

import java.util.Objects;

public class Person {

    private String personId;
    private String name;


    private Person() {
    }

    private Person(Builder builder) {
        this.personId = builder.personId;
        this.name = builder.name;
    }

    public String getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public static class Builder{

        private String personId;
        private String name;

        public Builder personId(String personId) {
            this.personId = personId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(Person person){
            this.personId = person.personId;
            this.name = person.name;

            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "personId='" + personId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personId.equals(person.personId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId);
    }
}
