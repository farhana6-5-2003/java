class Fibonacci
{
 public static void main(String args[])
 {
 if(args.length>0)
 {
  int n,first,second,third;
  first=-1;
  second=1;
  n=Integer.parseInt(args[0]);
  for(int i=0;i<n;i++)
  {
   third=first+second;
   System.out.print(third+"  ");
   first=second;
   second=third;
  }
 }
 else
 {
  System.out.println("Provide Input");
 }
 }
}
