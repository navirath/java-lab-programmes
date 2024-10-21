import java.util.*;

class Student {
    Scanner sc = new Scanner(System.in);
    String name, usn;
    double marks[] = new double[3];
    double credit[] = new double[3];

    void stdinfo() {
        name = sc.next();
        usn = sc.next();
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextDouble();
            credit[i] = sc.nextDouble();
        }
    }

    void printinfo() {
        System.out.println("Name of the student is " + name);
        System.out.println("USN: " + usn);
        for (int i = 0; i < 3; i++) {
            System.out.println(i + ") Marks: " + marks[i] + " Credit: " + credit[i]);
        }
    }

    double sgpa() {
        double sum = 0;
        double cred = 0;
        for (int i = 0; i < 3; i++) {
            sum += calculateGrade(marks[i]) * credit[i];
            cred += credit[i];
        }
        return cred == 0 ? 0 : sum / cred;
    }

    int calculateGrade(double mark) {
        if (mark >= 90) return 10;
        if (mark >= 80) return 9;
        if (mark >= 70) return 8;
        if (mark >= 60) return 7;
        if (mark >= 50) return 6;
        if (mark >= 40) return 5;
        return 0;
    }
}

class Display {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.stdinfo();
        double sgh = s1.sgpa();
        System.out.println("The SGPA of the student is: " + sgh);
    }
}
