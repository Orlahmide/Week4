package model;

import enums.CourseTaken;

public class CourseToBeTaken {

    private CourseTaken courseTaken;

    public CourseToBeTaken(CourseTaken courseTaken) {
        this.courseTaken = courseTaken;
    }

    public CourseTaken getCourseTaken() {
        return courseTaken;
    }

    @Override
    public String toString() {
        return "CourseToBeTaken{" +
                "courseTaken=" + courseTaken +
                '}';
    }
}
