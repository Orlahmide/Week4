package service.impl;

import model.ClassDetailsA;
import model.CourseToBeTaken;
import model.Teacher;
import service.TeacherService;

import java.util.Scanner;

public class TeacherServiceImpl implements TeacherService {


    @Override
    public String display(Teacher teacher, CourseToBeTaken courseToBeTaken, ClassDetailsA classDetailsA) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sign in using your Username please: ");
        String UserName = scanner.nextLine();

//        teacher = new Teacher(UserName, 23, 205000, Gender.Male);

        System.out.println("Welcome! " + UserName +"\n"
                + "Current age is: " + teacher.getAge()+ "\n"+
                "Current salary expectation is: " + teacher.getSalary() + "\n"+
                "Gender: " + teacher.getGender() + "\n"+
                "The course to be taught now is: " + courseToBeTaken.getCourseTaken() + " at" + " " + classDetailsA.getClassDetails());

        String teacherData = UserName + "," + teacher.getAge() + "," + teacher.getSalary() + "," + teacher.getGender() + "," + courseToBeTaken.getCourseTaken() + "," + classDetailsA.getClassDetails();

        return teacherData;
    }
}

