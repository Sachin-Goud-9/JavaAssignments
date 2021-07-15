public class StudentClass {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String engineeringDepartment;
    private int yearOfEnrollment;
    private double perTillDate;

    StudentClass(int id, String name, int age, String gender, String engineeringDepartment, int yearOfEnrollment, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engineeringDepartment = engineeringDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;
    }

    public static String toString() {
        return this.name + " " + this.engineeringDepartment + " " + this.age + " " + this.gender;
    }

    public static String getGender() {
        return this.gender;
    }

    public static int getAge() {
        return this.age;
    }

    public static String getDept() {
        return this.engineeringDepartment;
    }

    public static double getMarks() {
        return this.perTillDate;
    }

}
