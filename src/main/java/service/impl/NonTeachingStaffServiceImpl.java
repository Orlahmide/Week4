package service.impl;

import model.NonTeachingStaff;
import service.NonTeachingStaffService;

public class NonTeachingStaffServiceImpl implements NonTeachingStaffService {
    @Override
    public void display(NonTeachingStaff nonTeachingStaff) {

        System.out.println("Welcome " + nonTeachingStaff.getUserName()+ "\n" +
                "Current age is:" + nonTeachingStaff.getAge() + "\n" +
                "Gender: "+ nonTeachingStaff.getGender()+ "\n" +
                "Current salary expectation: " + nonTeachingStaff.getSalary()+ ".");
    }
}
