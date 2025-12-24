public class Student {

    private String name;
    private String studentId;
    private String email;
    private String phone;

    public Student(String n, String sid, String e, String p) {
        name = n;
        studentId = sid;
        email = e;
        phone = p;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}