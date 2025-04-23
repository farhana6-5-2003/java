import java.util.Scanner;

class Employee1 {
    int empNo;
    String empName;
    double empsalary;
  
    
    public Employee1(int empno, String empName, double salary) {
        this.empNo = empno; 
        this.empName = empName;
        this.empsalary = salary;
    }

    
    void display() {
        System.out.println("******EMPLOYEE DETAILS******");
        System.out.println("EMP NO: " + empNo);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empsalary);
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee no, employee name, employee salary:");
        
        int empno = sc.nextInt();
        sc.nextLine();  
        String empName = sc.nextLine();
        double salary = sc.nextDouble();


        Employee1 emp = new Employee1(empno, empName, salary);
        emp.display();
        
        sc.close(); 
    }
}


