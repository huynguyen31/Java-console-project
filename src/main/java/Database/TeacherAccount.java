package Database;

import Repositories.Account;

import java.util.ArrayList;
import java.util.List;

public class TeacherAccount {
    public List<Account> createTeacherAccount(){
        List<Account> list = new ArrayList<>();
        Account accountTeacher1 = new Account("TeacherA", "root1");
        Account accountTeacher2 = new Account("TeacherB", "root2");
        Account accountTeacher3 = new Account("TeacherC", "root3");
        list.add(accountTeacher1);
        list.add(accountTeacher2);
        list.add(accountTeacher3);
        return list;
    }
}
