package java_8.service.impl;

import java_8.classes.Student;
import java_8.enums.Gender;
import java_8.exception.MyException;
import java_8.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> findByName(String name, List<Student> students) throws MyException {
        List<Student>students1=new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equals(name)){
                students1.add(student);
            }
        }
        return students1;
    }

    @Override
    public List<Student> getAllMale(List<Student> students) {
       List<Student>males=new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().equals(Gender.MALE)){
                males.add(student);
            }
        }
        return males;
    }

    @Override
    public List<Student> getAllFemale(List<Student> students) {
        List<Student>feMales=new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().equals(Gender.FEMALE)){
                feMales.add(student);
            }
        }
        return feMales;
    }
}
