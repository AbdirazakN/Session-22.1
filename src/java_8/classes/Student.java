package java_8.classes;

import java_8.enums.Gender;
import java_8.exception.MyException;

import java.time.LocalDate;

public class Student {
    private String name;
    private int age;
    private Gender gender;
    private LocalDate dataOfBirth;

    public Student(String name, int age, Gender gender, LocalDate dataOfBirth) throws MyException {
        if (name.matches("[A-Za-zА-Яа-я]*")){
            this.name = name;
        }else {
            throw new MyException("Name can't be with numbers!");
        }
        if (age > 0) {
            this.age = age;
        }else {
            throw new MyException("Age cant be negative!");
        }
        this.gender = gender;
        if (dataOfBirth.isBefore(LocalDate.now())) {
            this.dataOfBirth = dataOfBirth;
        }else {
            throw new MyException("Date of birth written wrong!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dataOfBirth=" + dataOfBirth +
                '}';
    }
}
