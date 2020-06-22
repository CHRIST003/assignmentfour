package ac.za.cput;

public class StudentFactory {
    public static Student buildStudent(String studentFirstName, String studentLastName) {
        return new Student.Builder().studentId(Amr.generateId())
                .studentFirstName(studentFirstName)
                .studentLastName(studentLastName)
                .build();
    }
}
