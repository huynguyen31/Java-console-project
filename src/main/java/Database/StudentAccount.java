package Database;

import Repositories.Account;

import java.util.ArrayList;
import java.util.List;

public class StudentAccount {
    public List<Account> createStudentAccount(){
        List<Account> list = new ArrayList<>();
        Account studentAccount1 = new Account("StudentA", "kali1");
        Account studentAccount2 = new Account("StudentB", "kali2");
        Account studentAccount3 = new Account("StudentC", "kali3");
        list.add(studentAccount1);
        list.add(studentAccount2);
        list.add(studentAccount3);
        return list;
    }
}
