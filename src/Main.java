import java_8.classes.Student;
import java_8.enums.Gender;
import java_8.exception.MyException;
import java_8.service.impl.StudentServiceImpl;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {

        Student[] students = {
                new Student("Azak",-20, Gender.MALE, LocalDate.of(2022,11,30)),
                new Student("Amir",15, Gender.MALE, LocalDate.of(2007,10,10)),
                new Student("Bakai",23, Gender.MALE, LocalDate.of(1999,11,21)),
                new Student("Aisha",12, Gender.FEMALE, LocalDate.of(2010,1,31)),
                new Student("Aftan",18, Gender.MALE, LocalDate.of(2004,5,16)),
                new Student("Gulnara",25, Gender.FEMALE, LocalDate.of(1997,7,23)),
                new Student("Kushtar",30, Gender.MALE, LocalDate.of(1991,9,28)),
        };

        Scanner scanner = new Scanner(System.in);
        StudentServiceImpl studentServiceImpl = new StudentServiceImpl();

        findByName(students, scanner, studentServiceImpl);

        getAllGirls(students, studentServiceImpl);

        getAllBoys(students, studentServiceImpl);

    }

    private static void getAllGirls(Student[] students, StudentServiceImpl studentServiceImpl) {
        try {
            System.out.println("All Girls:  ");
            System.out.println(studentServiceImpl.getAllFemale(List.of(students)));
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }

    private static void getAllBoys(Student[] students, StudentServiceImpl studentServiceImpl) {
        try {
            System.out.println("All Boys:  ");
            System.out.println(studentServiceImpl.getAllMale(List.of(students)));
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }

    private static void findByName(Student[] students, Scanner scanner, StudentServiceImpl studentServiceImpl) {
        try {
            System.out.println("Enter name to search:  ");
            System.out.println(studentServiceImpl.findByName(scanner.nextLine(), List.of(students)));
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}