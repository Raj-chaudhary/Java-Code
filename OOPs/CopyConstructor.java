public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Raj";
        s1.rollno = 16100;
        s1.password = "QWERTY";
        s1.marks[0] = 90;
        s1.marks[1] = 80;
        s1.marks[2] = 70;

        Student s2 = new Student(s1);
        s2.password = "ABC";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int rollno;
    String password;
    int marks[];

    // Copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.marks = s1.marks;
    }

    Student() {
        marks = new int[3];
    }
}
