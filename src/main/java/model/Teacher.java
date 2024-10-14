package model;


import baseClass.StaffDetails;
import enums.Gender;

public class Teacher extends StaffDetails {

    public Teacher(String userName, int age, int salary, Gender gender) {
        super(userName, age, salary, gender);
    }
}
