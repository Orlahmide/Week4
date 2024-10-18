import enums.ClassDetails;
import enums.CourseTaken;
import enums.Gender;
import model.*;
import service.impl.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayButton {

    public static void main(String[] args) throws IOException {

        String a = "Teacher";
        String b = "Student";
        String c = "Non-teaching staff";
        String d = "Principal";
        String e = "Applicant";

        ArrayList<String> teacherDataList = new ArrayList<>();
        ArrayList<String> studentDataList = new ArrayList<>();

        Teacher teacher = new Teacher(null, 24, 30000, Gender.Female);
        Teacher teacher2 = new Teacher(null, 34, 35000, Gender.Male);
        ClassDetailsA location = new ClassDetailsA(ClassDetails.First_college_building);
        ClassDetailsA location2 = new ClassDetailsA(ClassDetails.Second_college_building);
        CourseToBeTaken course = new CourseToBeTaken(CourseTaken.FrontEnd);
        CourseToBeTaken course2 = new CourseToBeTaken(CourseTaken.Java);

        TeacherServiceImpl secondTeacher = new TeacherServiceImpl();
        TeacherServiceImpl firstTeacher = new TeacherServiceImpl();


        Student student1 = new Student(null, 19, 1501715, Gender.Male);
        Student student2 = new Student(null, 23, 1601215, Gender.Female);
        CourseToBeTaken courseSt1 = new CourseToBeTaken(CourseTaken.Algorithm);
        CourseToBeTaken courseSt2 = new CourseToBeTaken(CourseTaken.Technical_Project);
        ClassDetailsA locationSt1 = new ClassDetailsA(ClassDetails.Second_college_building);
        ClassDetailsA locationSt2 = new ClassDetailsA(ClassDetails.Technical_laboratory);

        StudentServiceImpl firstStudent = new StudentServiceImpl();
        StudentServiceImpl secondStudent = new StudentServiceImpl();




        Scanner scanner = new Scanner(System.in);
        String cont;

        do {

            System.out.println("Who are you logging in as? you will need to kindly type in the corresponding role: ");
            System.out.println("Teacher, Student, Non-teaching staff, Principal, Applicant");

            String role = scanner.nextLine();

            if (role.equalsIgnoreCase(a)) {
//                TeacherServiceImpl t = new TeacherServiceImpl();
//                t.display(null, null, null);
                String teacherData2 = secondTeacher.display(teacher, course, location);
                String teacherData = firstTeacher.display(teacher2, course2, location2);
                teacherDataList.add(teacherData);
                teacherDataList.add(teacherData2);

            } else if (role.equalsIgnoreCase(b)) {
                StudentServiceImpl st = new StudentServiceImpl();
//                st.display(null, null, null);
                String studentData1 =  firstStudent.display(student1, courseSt1, locationSt1);
                String studentData2 =  secondStudent.display(student2, courseSt2, locationSt2);
                studentDataList.add(studentData1);
                studentDataList.add(studentData2);

            } else if (role.equalsIgnoreCase(c)) {
                NonTeachingStaff nt = new NonTeachingStaff("Joy", 34, 20000, Gender.Female);
                NonTeachingStaffServiceImpl we = new NonTeachingStaffServiceImpl();
                we.display(nt);

            } else if (role.equalsIgnoreCase(d)) {
                PrincipalServiceImpl p = new PrincipalServiceImpl();
                p.display(null);

            } else if (role.equalsIgnoreCase(e)) {
                ApplicantServiceImpl ap = new ApplicantServiceImpl();
                ap.display();

            } else {
                System.out.println("Invalid role selected, please try again");
            }
            System.out.println();

            System.out.println("Do you want to sign in again? (Yes/No)");

            cont = scanner.nextLine();

            System.out.println();

        }  while (cont.equalsIgnoreCase("yes"));


        writeToCSV("/teacherFile.csv", teacherDataList, System.getProperty("user.home") + "/Documents");
        writeToCSV("/studentFile.csv", studentDataList, System.getProperty("user.home") + "/Documents");

        scanner.close();

        System.out.println("Exiting the program.");

    }

    public static void writeToCSV(String fileName, ArrayList<String> dataList, String filePath) throws IOException {

        Writer wr = new FileWriter(filePath + fileName);



        try(
                BufferedWriter bw = new BufferedWriter(wr)){

//            String header = "Name, Age, ID, Course Name, Location \n";
//            bw.write(header);
            for (String data : dataList) {
                bw.write(data);
                bw.newLine();
            }
            System.out.println("Data has been written successfully to " + fileName);

        } catch (Exception e) {
            throw new RuntimeException("There is an error found");
        }

        List<String> message = new ArrayList<>();

        Reader rd = new FileReader(filePath + fileName);

        BufferedReader br = new BufferedReader(rd);

        String line;
        while ((line = br.readLine()) != null ){
            message.add(line);
        }

        String [] newLine = message.toArray(new String[0]);
        for (String ms : newLine){
            System.out.println(ms);
            System.out.println();
        }
    }

}
