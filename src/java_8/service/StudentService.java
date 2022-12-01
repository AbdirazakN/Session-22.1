package java_8.service;

import java_8.classes.Student;
import java_8.exception.MyException;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {

    List<Student> findByName(String name, List<Student> students) throws MyException;

    List<Student> getAllFemale(List<Student> students);

    List<Student> getAllMale(List<Student> students);

}
