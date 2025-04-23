import java.util.*;
class limit
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the limit:");
 int n=sc.nextInt();
 for(int i=2;i<=n/2;i++)
 {
  if(n%i==0)
  {
   System.out.print("not ");
  }
 }
 }
 }
