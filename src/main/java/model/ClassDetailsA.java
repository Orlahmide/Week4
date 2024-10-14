package model;

import enums.ClassDetails;

public class ClassDetailsA {

    private ClassDetails classDetails;

    public ClassDetailsA(ClassDetails classDetails) {
        this.classDetails = classDetails;
    }

    public ClassDetails getClassDetails() {
        return classDetails;
    }

    @Override
    public String toString() {
        return "ClassDetailsA{" +
                "classDetails=" + classDetails +
                '}';
    }
}
