package service;

import model.ClassDetailsA;
import model.CourseToBeTaken;
import model.Student;

public interface StudentService {

    public String display(Student student, CourseToBeTaken courseToBeTaken, ClassDetailsA classDetailsA);
}
