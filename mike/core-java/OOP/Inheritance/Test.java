class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    public String getStudentId() {
        return studentId;
    }
}

class Faculty extends Person {
    private String facultyId;

    public Faculty(String name, int age, String facultyId) {
        super(name, age);
        this.facultyId = facultyId;
    }

    public String getFacultyId() {
        return facultyId;
    }
}


class Admin extends Person {
    private String adminId;

    public Admin(String name, int age, String adminId) {
        super(name, age);
        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    }
}





public class Test {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Student student = new Student("Alice", 20, "S12345");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());
    }
}