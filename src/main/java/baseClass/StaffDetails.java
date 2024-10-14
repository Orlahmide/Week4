package baseClass;

import enums.Gender;

public abstract class StaffDetails {

    private String userName;
    private int age;
    private int salary;
    private Gender gender;

    public StaffDetails(String userName, int age, int salary, Gender gender) {
        this.userName = userName;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Gender getGender() {
        return gender;
    }

}
