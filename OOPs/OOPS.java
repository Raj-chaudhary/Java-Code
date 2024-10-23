package OOPs;

public class OOPS {
    public static void main(String args[]) {
        // BankAccount
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Raj";
        // myAcc.password = "abcdefghijkl" /*this will give an error that the password
        // is not visible in class */
        myAcc.setPassword("ABcdEFgh");

        // Student
        Student s1 = new Student();
        Student s2 = new Student("Raj");
        Student s3 = new Student(16100);

        // Pen
        Pen p1 = new Pen(); // created a pen called object p1
        p1.setColor("blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        // p1.setColour("Yellow");
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Student {
    String name;
    int rollno;

    // Non parametorized constructor
    Student() {
        System.out.println("Constructor is called...");
    }

    // Parameterized Constructor
    Student(String name) {
        this.name = name;
    }

    Student(int rollno) {
        this.rollno = rollno;
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}
