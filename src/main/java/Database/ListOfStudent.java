package Database;

import Repositories.Student;

import java.util.ArrayList;
import java.util.List;

public class ListOfStudent {
    public List<Student> createListOfStudent(){
        Student student1 = new Student(1, "A", "0123456789", "E St", "01/01/1990", "4");
        Student student2 = new Student(2, "B", "1234567890", "R St", "02/01/1991", "5");
        Student student3 = new Student(3, "C", "2345678901", "T St", "03/01/1992", "6");
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        return list;
    }

}
