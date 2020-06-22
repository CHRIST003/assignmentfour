package ac.za.cput;

import java.util.HashSet;
import java.util.Set;

public class PersonRepositoryImpl implements PersonRepository {

    private static PersonRepositoryImpl repository = null;
    private Set<Person> persons;

    private PersonRepositoryImpl(){
        this.persons = new HashSet<>();
    }

    private Person findPerson(final String personId) {
        return this.persons.stream()
                .filter(person -> person.getPersonId().trim().equals(personId))
                .findAny()
                .orElse(null);
    }

    public static PersonRepositoryImpl getRepository(){
        if (repository == null) repository = new PersonRepositoryImpl();
        return repository;
    }

    @Override
    public Person create(Person person) {
        this.persons.add(person);
        return person;
    }

    @Override
    public Person update(Person person) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Person read(String s) {
        return null;
    }

    @Override
    public Set<Person> getAll() {
        return this.persons;
    }
}
