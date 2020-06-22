package ac.za.cput;

public class PersonFactory {

    public static Person buildPerson(String name) {
        return new Person.Builder().personId(Amr.generateId())
                .name(name)
                .build();
    }
}
