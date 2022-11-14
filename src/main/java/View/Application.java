package View;

import Controller.StudentController;
import Controller.TeacherController;
import Repositories.Student;
import Repositories.Teacher;
import Services.StudentService;
import Services.TeacherService;

import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();
        while (isTrue) {
            System.out.println("[+] Please select your login option");
            System.out.println("1. Student");
            System.out.println("2. Teacher");
            System.out.println("0. Exit");
            System.out.println("--------------------------");
            try {
                int option = scanner.nextInt();
                scanner.nextLine();
                switch (option) {
                    case 1:
                        System.out.println("Username: ");
                        String studentUsername = scanner.nextLine();
                        System.out.println("Password: ");
                        String studentPassword = scanner.nextLine();
                        boolean isSuccess = studentService.studentLogin(studentUsername, studentPassword);
                        if (isSuccess) {
                            System.out.println("[+] LOGIN SUCCESS!");
                            System.out.println("--------------------------");

                            boolean studentAvailable = true;
                            while (studentAvailable) {
                                System.out.println("[+] Please select your option");
                                System.out.println("1. Search student information");
                                System.out.println("0. Exit");
                                try {
                                    StudentController studentController = new StudentController();
                                    int studentOption = scanner.nextInt();
                                    scanner.nextLine();
                                    switch (studentOption) {
                                        case 1:
                                            System.out.println("[+] Please insert student id: ");
                                            int studentId = scanner.nextInt();
                                            Student student = studentController.searchStudent(studentId);
                                            if (student != null) {
                                                System.out.println("Id: " + student.getId());
                                                System.out.println("Name: " + student.getName());
                                                System.out.println("Phone: " + student.getPhoneNumber());
                                                System.out.println("Address: " + student.getAddress());
                                                System.out.println("Date Of Birth: " + student.getDateOfBirth());
                                                System.out.println("Class id: " + student.getClassId());
                                                System.out.println("--------------------------");
                                            } else {
                                                System.out.println("[-] STUDENT NOT FOUND");
                                                System.out.println("--------------------------");
                                            }
                                            studentAvailable = true;
                                            break;
                                        case 0:
                                            System.out.println("--------------------------");
                                            studentAvailable = false;
                                            break;
                                    }
                                } catch (Exception e) {
                                    System.out.println("[-] Oops! Something went wrong!");
                                    System.out.println("--------------------------");
                                    scanner.nextLine();
                                    studentAvailable = true;
                                }
                            }
                        } else {
                            System.out.println("[-] INCORRECT USERNAME OR PASSWORD");
                            break;
                        }
                        break;
                    case 2:
                        System.out.println("Username: ");
                        String teacherUsername = scanner.nextLine();
                        System.out.println("Password: ");
                        String teacherPassword = scanner.nextLine();
                        boolean isCorrect = teacherService.teacherLogin(teacherUsername, teacherPassword);

                        if (isCorrect) {
                            System.out.println("[+] LOGIN SUCCESS!");
                            System.out.println("--------------------------");

                            boolean teacherAvailable = true;
                            while (teacherAvailable) {
                                System.out.println("[+] Please select your option");
                                System.out.println("1. Search teacher information");
                                System.out.println("2. View all teacher information");
                                System.out.println("3. View all student information");
                                System.out.println("0. Exit");
                                try {
                                    TeacherController teacherController = new TeacherController();
                                    int teacherOption = scanner.nextInt();
                                    scanner.nextLine();
                                    switch (teacherOption) {
                                        case 1:
                                            System.out.println("[+] Please insert teacher id");
                                            int teacherId = scanner.nextInt();
                                            Teacher teacher = teacherController.teacherById(teacherId);
                                            if (teacher != null) {
                                                System.out.println("Id: " + teacher.getId());
                                                System.out.println("Name: " + teacher.getName());
                                                System.out.println("Phone: " + teacher.getPhoneNumber());
                                                System.out.println("Address: " + teacher.getAddress());
                                                System.out.println("Date Of Birth: " + teacher.getDateOfBirth());
                                                System.out.println("Department: " + teacher.getDepartment());
                                                System.out.println("--------------------------");
                                            } else {
                                                System.out.println("[-] TEACHER NOT FOUND");
                                                System.out.println("--------------------------");
                                            }
                                            teacherAvailable = true;
                                            break;
                                        case 2:
                                            List<Teacher> listTeacher = teacherController.listAllTeacher();
                                            for (Teacher teacher1 : listTeacher
                                            ) {
                                                System.out.println("Id: " + teacher1.getId());
                                                System.out.println("Name: " + teacher1.getName());
                                                System.out.println("Phone: " + teacher1.getPhoneNumber());
                                                System.out.println("Address: " + teacher1.getAddress());
                                                System.out.println("Date Of Birth: " + teacher1.getDateOfBirth());
                                                System.out.println("Department: " + teacher1.getDepartment());
                                                System.out.println("--------------------------");
                                            }
                                            teacherAvailable = true;
                                            break;
                                        case 3:
                                            List<Student> listStudent = teacherController.listAllStudent();
                                            for (Student student : listStudent
                                            ) {
                                                System.out.println("Id: " + student.getId());
                                                System.out.println("Name: " + student.getName());
                                                System.out.println("Phone: " + student.getPhoneNumber());
                                                System.out.println("Address: " + student.getAddress());
                                                System.out.println("Date Of Birth: " + student.getDateOfBirth());
                                                System.out.println("Class id: " + student.getClassId());
                                                System.out.println("--------------------------");
                                            }
                                            teacherAvailable = true;
                                            break;
                                        case 0:
                                            System.out.println("--------------------------");
                                            teacherAvailable = false;
                                            break;
                                    }
                                } catch (Exception e) {
                                    System.out.println("[-] Oops! Something went wrong!");
                                    System.out.println("--------------------------");
                                    scanner.nextLine();
                                    teacherAvailable = false;
                                }
                            }
                        } else {
                            System.out.println("[-] INCORRECT USERNAME OR PASSWORD");
                            System.out.println("--------------------------");
                        }
                        isTrue = true;
                        break;
                    case 0:
                        System.out.println("THANK YOU! HAVE A GOOD DAY");
                        isTrue = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println("[-] Oops! Something went wrong!");
                System.out.println("--------------------------");
                scanner.nextLine();
                isTrue = true;
            }
        }
    }
}
