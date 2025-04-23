import java.util.*;
class Search
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the array size:");
 int n=sc.nextInt();
 int []a=new int[n];
 int p=0;
 System.out.print("Enter the elements:");
 for(int i=0;i<n;i++)
 {
  a[i]=sc.nextInt(); 
 }
 int f=0;
 System.out.print("Enter the element to search:");
 int e=sc.nextInt();
 for(int i=0;i<n;i++)
 {
  if(a[i]==e)
  {
   p=i;
   f=1;
  }
 }
 if(f==1)
 {
  System.out.print("Element Found at index "+p);
 }
 else
 {
  System.out.print("Element not found");
 }
 }
 }
