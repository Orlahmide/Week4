package baseClass;

import enums.Gender;

public abstract class NonStaff {

    private String NSname;
    private int age;
    private int iD;
    private Gender gender;

    public NonStaff(String NSname, int age, int iD, Gender gender) {
        this.NSname = NSname;
        this.age = age;
        this.iD = iD;
        this.gender = gender;
    }

    public String getNSname() {
        return NSname;
    }

    public int getAge() {
        return age;
    }

    public int getiD() {
        return iD;
    }

    public Gender getGender() {
        return gender;
    }
}
