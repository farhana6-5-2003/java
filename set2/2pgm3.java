class Largest
{
 public static void main(String args[])
 {
 if(args.length>0)
 {
  int a=Integer.parseInt(args[0]);
  int b=Integer.parseInt(args[1]);
  int s=(a>b)?a:b;
  System.out.println("Number1="+a+" Number2="+b);
  System.out.println("Largest is : "+s);
 }
 else
 {
 System.out.println("Provide Input");
 }
 }
}
