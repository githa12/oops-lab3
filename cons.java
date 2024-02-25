import java.util.Scanner;
class student {
    String name;
    int num;
    double percent;
    String cllgname;
    int code;
    student(String fullName, int rollNum, double semPercentage, String collegeName, int collegeCode) {
        name = fullName;
        num = rollNum;
        percent = semPercentage;
        cllgname = collegeName;
        code = collegeCode;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + num);
        System.out.println("Semester Percentage: " + percent);
        System.out.println("College Name: " + cllgname);
        System.out.println("College Code: " + code);
    }
    
    public static void main(String args[]) {
        student input = new student("githa", 505, 89, "mvgr", 33);
        input.display();
    }
}



