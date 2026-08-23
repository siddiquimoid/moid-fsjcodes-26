/*
Aim: WAP to store and display student information of few students.
Information like name, UIN, CGPA.

Coder: Moid
Class: Computer Engineering:A div
UIN/ROLL NO:251P069/58
*/

public class Task1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Moid";
        s1.uin = "251P069";
        s1.cgpa = 9.5;
        s1.display();

        Student s2 = new Student();
        s2.name = "Hashim";
        s2.uin = "251P070";
        s2.cgpa = 5.2;
        s2.display();

        Student s3 = new Student();
        s3.name = "Irfan";
        s3.uin = "251P046";
        s3.cgpa = 5.0;
        s3.display();
    }
}

class Student {
    String name;
    String uin;
    double cgpa;

    void display() {
        System.out.println("Name:\t" + name);
        System.out.println("UIN:\t" + uin);
        System.out.println("CGPA:\t" + cgpa + "\n");
    }
}
