class Pattern
{
 public static void main(String args[])
 {
  int i,n;
  n=Integer.parseInt(args[0]);
  for(i=n;i>0;i--)
  {
  for(int j=1;j<=i;j++)
  {
   System.out.print("* ");
  }
  System.out.println();
 }
 }
}
