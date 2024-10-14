package model;

import baseClass.StaffDetails;
import enums.Gender;

public class NonTeachingStaff extends StaffDetails {
    public NonTeachingStaff(String userName, int age, int salary, Gender gender) {
        super(userName, age, salary, gender);
    }
}
