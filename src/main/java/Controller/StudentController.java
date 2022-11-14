package Controller;

import Repositories.Student;
import Services.StudentService;

public class StudentController {
    public Student searchStudent(int id){
        StudentService studentService = new StudentService();
        return studentService.searchStudent(id);
    }
}
