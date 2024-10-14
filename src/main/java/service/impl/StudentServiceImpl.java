package service.impl;

import enums.ClassDetails;
import enums.CourseTaken;
import enums.Gender;
import model.ClassDetailsA;
import model.CourseToBeTaken;
import model.Student;
import service.StudentService;

import java.util.Scanner;

public class StudentServiceImpl implements StudentService {


    @Override
    public String display(Student student, CourseToBeTaken courseToBeTaken, ClassDetailsA classDetailsA) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly input your Username: ");
        String userName = scanner.next();


//        student = new Student(userName, 23, 1201721, Gender.Female);

        System.out.println("Welcome " + userName + " your current age is: " + student.getAge() + " and your school ID is: " + student.getiD());
        System.out.println("The current course to be taken is: " + CourseTaken.Java);
        System.out.println("The building used for the course is: " + ClassDetails.Technical_laboratory);

        String studentData = userName + "," + student.getAge() + "," + student.getiD() + "," + courseToBeTaken.getCourseTaken() + "," + classDetailsA.getClassDetails();

        return studentData;
    }
}
