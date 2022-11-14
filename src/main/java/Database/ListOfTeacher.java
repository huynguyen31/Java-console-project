package Database;

import Repositories.Teacher;

import java.util.ArrayList;
import java.util.List;

public class ListOfTeacher {
    public List<Teacher> createListOfTeacher(){
        List<Teacher> list = new ArrayList<>();
        Teacher teacher1 = new Teacher(1, "Teacher A", "0123456789", "F St", "01/01/1980", "Teacher");
        Teacher teacher2 = new Teacher(2, "Teacher B", "1234567890", "S St", "02/01/1981", "Principal");
        Teacher teacher3 = new Teacher(3, "Teacher C", "2345678901", "P St", "03/01/1982", "Teacher");
        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);
        return list;
    }
}
