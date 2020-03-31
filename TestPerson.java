package Lesson17.Lesson17Son;

import Lesson17.Person;
import Lesson17.Lesson17Son.Student;
import Lesson17.Lesson17Son.Staff;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Tan Ah Teck", "1 Happy Ave");
        System.out.println(p1);

        Student student = new Student("Tan Ah Teck", "1 Happy Ave", "Math", 2020, 500000.0);
        System.out.println(student);

        Staff staff = new Staff("Tan Ah Teck", "1 Happy Ave", "FPT", 0.0);
        System.out.println(staff);
    }
}
