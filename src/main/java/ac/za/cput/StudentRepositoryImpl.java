package ac.za.cput;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentRepositoryImpl implements StudentRepository {

    private static StudentRepositoryImpl repository = null;
    private Map<String, Student> students;

    private StudentRepositoryImpl() {
        this.students = new HashMap<>();
    }

    public static StudentRepository getRepository(){
        if(repository == null) repository = new StudentRepositoryImpl();
        return repository;
    }


    @Override
    public Student create(Student student) {
        this.students.put(student.getStudentId(),student);
        return student;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Student read(String s) {
        return null;
    }

    @Override
    public Set<Person> getAll() {
        return null;
    }
}
