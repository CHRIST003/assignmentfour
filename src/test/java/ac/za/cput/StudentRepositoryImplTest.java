package ac.za.cput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class StudentRepositoryImplTest {


    private StudentRepository repository;
    private String studentId=null;


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void create() {

        Student student = StudentFactory.buildStudent("Christ"," Nganga");
        if(student == null){
        Student result = repository.create(student);
        studentId= result.getStudentId();
        Assert.assertNotNull(student);
        }else {
            System.out.println("NullPointerException thrown!");
        }
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
    }
}