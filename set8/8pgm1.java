class Mark
{

 int rollno;
 String name;
 int eng_mark,maths_mark,total_mark;
 
 Mark(int r,String n,int e,int m)
 {
  rollno=r;
  name=n;
  eng_mark=e;
  maths_mark=m;
  total_mark=e+m;
 }
 
 void display()
 {
  System.out.println("-----Marks----");
  System.out.println("RollNo:"+rollno);
  System.out.println("Name:"+name);
  System.out.println("English:"+eng_mark);
  System.out.println("Maths:"+maths_mark);
  System.out.println("Total Marks:"+total_mark);
 }
}



class Student
{
 public static void main(String args[])
 {
  if(args.length>0)
  {
   int r=Integer.parseInt(args[0]);
   String n=args[1];
   int e=Integer.parseInt(args[2]);
   int m=Integer.parseInt(args[3]);
   Mark ob=new Mark(r,n,e,m);
   ob.display();
  }
  else
  {
   System.out.println("Provide Input");
  }
 }
}
