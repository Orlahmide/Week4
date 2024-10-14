package model;

import baseClass.NonStaff;
import enums.Gender;

public class Student extends NonStaff {
    public Student(String NSname, int age, int iD, Gender gender) {
        super(NSname, age, iD, gender);
    }
}
