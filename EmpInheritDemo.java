 import java.util.*;

class Emp {
    int empid;
    String empname;

    Emp(int no) {
        empid = no;
    }

    Emp(int no, String name) {
        this(no);
        empname = name;
    }
}

class Salary extends Emp {
    String designation;
    double sal;

    Salary(int no, String name, String des, double salary) {
        super(no, name);
        designation = des;
        sal = salary;
    }

    void display() {
        System.out.println(empid + " , " + empname + " , " + designation + " , " + sal);
    }
}

public class EmpInheritDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Salary[] s = new Salary[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Employee details of " + (i + 1));
            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            System.out.print("Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Designation: ");
            String desg = sc.nextLine();
            System.out.print("Salary: ");
            double sal = sc.nextDouble();
            sc.nextLine(); // consume leftover newline

            s[i] = new Salary(id, name, desg, sal);
        }

        System.out.println("\nEmployees with salary > 20000:");
        for (int i = 0; i < n; i++) {
            if (s[i].sal > 20000)
                s[i].display();
        }

        System.out.println("\nEmployees sorted by salary:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].sal > s[j].sal) {
                    Salary temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        sc.close();
    }
}
