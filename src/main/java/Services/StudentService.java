package Services;

import Database.ListOfStudent;
import Database.StudentAccount;
import Repositories.Account;
import Repositories.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public boolean studentLogin(String username, String password){
        List<Account> listAccount = new ArrayList<>();
        StudentAccount studentAccount = new StudentAccount();
        listAccount = studentAccount.createStudentAccount();
        for (Account account:listAccount
             ) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public Student searchStudent(int id){
        List<Student> list = new ArrayList<>();
        ListOfStudent listOfStudent = new ListOfStudent();
        list = listOfStudent.createListOfStudent();
        for (Student student:list
             ) {
            if(id == student.getId()){
                return student;
            }
        }
        return null;
    }
}
