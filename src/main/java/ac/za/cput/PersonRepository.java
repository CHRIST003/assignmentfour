package ac.za.cput;

import java.util.Set;

public interface PersonRepository extends IRepository<Person, String>{
    Set<Person>getAll();
}
