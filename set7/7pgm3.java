import java.util.*;
class Student
{
 int rollno;
 String name;
 Student(int r,String n)
 {
  rollno=r;
  name=n;
 }
 void display()
 {
  System.out.println("Student Details");
  System.out.println("----------------");
  System.out.println("RollNo:"+rollno);
  System.out.println("Name:"+name);
 }
}

class StudentInfo
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter Rollno:");
 int r=sc.nextInt();
 System.out.print("Enter Student's Name:");
 sc.nextLine();
 String n=sc.nextLine();
 Student s=new Student(r,n);
 s.display();
}
}
