package ac.za.cput;

import java.util.Set;

public interface StudentRepository extends IRepository<Student, String> {
    Set<Person> getAll();
}
