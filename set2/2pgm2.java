class Arithmetic2
{
 public static void main(String args[])
 {
 if(args.length>0)
 {
  int a=Integer.parseInt(args[0]);
  int b=Integer.parseInt(args[1]);
  System.out.println("Sum="+(a+b));
  System.out.println("Difference="+(a-b));
  System.out.println("Product="+(a*b));
  System.out.println("Division="+(a/b));
 }
 else
 {
  System.out.println("Enter numbers as Command line arguments");
 }
  
 }
}
