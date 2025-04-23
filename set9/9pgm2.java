import java.util.*;
class Employee1
{
 int empid;
 String empname;
 float gsalary,bsalary,HRA,DA;
 Employee1(int i,String n,float b)
 {
  empid=i;
  empname=n;
  bsalary=b;
 }
 void calculate()
 {
  HRA=(bsalary*5)/100;
  DA=(bsalary*50)/100;
  gsalary=bsalary+HRA+DA;
 }
 void display()
 {
  System.out.println("\nEmployee ID:"+empid);
  System.out.println("Employee Name:"+empname);
  System.out.println("Basic Salary:"+bsalary);
  System.out.println("Gross Salary:"+gsalary);
 }
}

class Employee
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  Employee1 emp[]=new Employee1[5];
  int id,n;
  String name;
  float b;
  System.out.print("Enter number of Employees:");
  n=sc.nextInt();
  for(int i=0;i<n;i++)
  {
   System.out.print("\nEnter Employee ID:");
   id=sc.nextInt();
   sc.nextLine();
   System.out.print("Enter Employee name:");
   name=sc.nextLine();
   System.out.print("Enter Basic Salary:");
   b=sc.nextFloat();
   emp[i]=new Employee1(id,name,b);
   emp[i].calculate();
  }
  System.out.println("\n--------Details of Employees-------");
  for(int j=0;j<n;j++)
  {
   emp[j].display();
  }  
 }
}
