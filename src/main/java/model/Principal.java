package model;

import baseClass.StaffDetails;
import enums.Gender;

public class Principal extends StaffDetails {

    public Principal(String userName, int age, int salary, Gender gender) {
        super(userName, age, salary, gender);
    }
}
