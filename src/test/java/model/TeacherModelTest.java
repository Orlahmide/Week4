package model;

import enums.Gender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherModelTest {

    private Teacher teacher;

    @BeforeEach
     public void setUp() {


        // Initialize a Teacher object before each test
        teacher = new Teacher("John Doe", 35, 50000, Gender.Male);


    }
    @Test

    public void testGetUserName() {
        assertEquals("John Doe", teacher.getUserName());
    }

    @Test
    public void testGetAge() {
        assertEquals(35, teacher.getAge());
    }

    @Test
    public void testGetSalary() {
        assertEquals(50000, teacher.getSalary());
    }

    @Test
    public void testGetGender() {
        assertEquals(Gender.Male, teacher.getGender());
    }
}
