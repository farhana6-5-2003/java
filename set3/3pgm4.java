class Factorial
{
 public static void main(String args[])
 {
 if(args.length>0)
 {
  int i,f=1;
  int n=Integer.parseInt(args[0]);
  for(i=1;i<=n;i++)
  {
   f=f*i;
  }
  System.out.println("Factorial="+f);
 }
 else
 {
  System.out.println("Provide Input");
 }
 }
}
