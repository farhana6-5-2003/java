import java.util.*;
class Symmetric
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int flag=0;
 System.out.print("Enter Number of rows:");
 int r=sc.nextInt();
  System.out.print("Enter Number of columns:");
 int c=sc.nextInt();
 int [][]m=new int[r][c];
 System.out.print("Enter Elements:");
 for(int i=0;i<r;i++)
 {
  for(int j=0;j<c;j++)
  {
   m[i][j]=sc.nextInt();
  }
 }
 for(int i=0;i<r;i++)
 {
  for(int j=0;j<c;j++)
  {
   if(m[i][j]!=m[j][i])
   {
    flag=0;
    break;
   }
   else
   {
    flag=1;
   }
  }
 }
 if(flag==1)
 {
  System.out.println("Matrix is Symmetric");
 }
 else
 {
  System.out.println("Matrix is not Symmetric");
 }
}
}
