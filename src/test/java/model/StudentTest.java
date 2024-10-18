package model;

import enums.Gender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    private Student student;

    @BeforeEach

    public void tomi (){

        student = new Student("love", 23, 3736373, Gender.Female);
    }

    @Test

    public void test(){

        assertEquals("love", student.getNSname());
    }

    @Test
    public void testAge(){

        assertEquals(23, student.getAge());
    }

    @Test
    public void testid(){

        assertEquals(3736373, student.getiD());
    }

    @Test
    public void testGender(){

        assertEquals(Gender.Female, student.getGender());
    }


}