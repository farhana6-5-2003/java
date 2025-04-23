class OddEven
{
 public static void main(String args[])
 {
 if(args.length>0)
 {
  int num=Integer.parseInt(args[0]);
  if(num%2==0)
  {
  System.out.println(num+" is Even");
  }
  else
  {
    System.out.println(num+" is Odd");
  }
 }
 else
 {
 System.out.println("Provide Input");
 }
 }
}
