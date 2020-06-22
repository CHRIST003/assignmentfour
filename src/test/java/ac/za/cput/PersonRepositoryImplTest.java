package ac.za.cput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class PersonRepositoryImplTest {



    private PersonRepository repository;
    private Person person;

    private Person getSavedPerson() {
        Set<Person> savedPersons = this.repository.getAll();
        return savedPersons.iterator().next();
    }


    @Before
    public void setUp() throws Exception {
        this.repository = PersonRepositoryImpl.getRepository();
        this.person = PersonFactory.buildPerson("Amour");
    }

    @Test
    public void create() {
        Person created = this.repository.create(this.person);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.person);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }

    @Test
    public void getAll() {
        Set<Person> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}