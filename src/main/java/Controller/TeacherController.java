package Controller;

import Repositories.Student;
import Repositories.Teacher;
import Services.TeacherService;

import java.util.List;

public class TeacherController {

    public Teacher teacherById(int id){
        TeacherService teacherService = new TeacherService();
        return teacherService.searchTeacher(id);
    }

    public List<Teacher> listAllTeacher(){
        TeacherService teacherService = new TeacherService();
        return teacherService.listOfTeacher();
    }

    public List<Student> listAllStudent(){
        TeacherService teacherService = new TeacherService();
        return teacherService.listOfStudent();
    }
}
