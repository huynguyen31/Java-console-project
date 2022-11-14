package Services;

import Database.ListOfStudent;
import Database.ListOfTeacher;
import Database.TeacherAccount;
import Repositories.Account;
import Repositories.Student;
import Repositories.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    public boolean teacherLogin(String username, String password){
        List<Account> listTeacherAccount = new ArrayList<>();
        TeacherAccount teacherAccount = new TeacherAccount();
        listTeacherAccount = teacherAccount.createTeacherAccount();
        for (Account account:listTeacherAccount
             ) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public List<Student> listOfStudent(){
        List<Student> list = new ArrayList<>();
        ListOfStudent listOfStudent = new ListOfStudent();
        list = listOfStudent.createListOfStudent();
        return list;
    }

    public List<Teacher> listOfTeacher(){
        List<Teacher> list = new ArrayList<>();
        ListOfTeacher listOfTeacher = new ListOfTeacher();
        list = listOfTeacher.createListOfTeacher();
        return list;
    }

    public Teacher searchTeacher(int id){
        List<Teacher> list = new ArrayList<>();
        ListOfTeacher listOfTeacher = new ListOfTeacher();
        list = listOfTeacher.createListOfTeacher();
        for (Teacher teacher:list
        ) {
            if (id == teacher.getId()) {
                return teacher;
            } else {
                System.out.println("TEACHER NOT FOUND");
            }
        }
        return null;
    }
}
