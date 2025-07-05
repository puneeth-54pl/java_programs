import java.util.Scanner;

interface College {
   String collegeName="BMSCE";
}

class Teacher {
    String teacherName;
    String qualification;

    void setTeacherDetails(String name, String qualification) {
        this.teacherName = name;
        this.qualification = qualification;
    }
}

class Department extends Teacher implements College {
    int deptNo;
    String deptName;

    void setDepartmentDetails(int deptNo, String deptName) {
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    void display() {
        System.out.println("\n--- Teacher Details ---");
        System.out.println("College Name: " + collegeName);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Department No: " + deptNo);
        System.out.println("Department Name: " + deptName);
    }
}


public class CollegeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Department d = new Department();

        System.out.print("Enter Teacher Name: ");
        String tname = sc.nextLine();
        System.out.print("Enter Qualification: ");
        String qual = sc.nextLine();
        d.setTeacherDetails(tname, qual);

        System.out.print("Enter Department Number: ");
        int dno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department Name: ");
        String dname = sc.nextLine();
        d.setDepartmentDetails(dno, dname);

        
        d.display();

        sc.close();
    }
}
