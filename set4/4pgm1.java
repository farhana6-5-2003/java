
class Arraysort
{
 public static void main(String args[])
 {
  if(args.length>0)
  {
    int n=args.length;
   int a[]=new int[n];
   for(int i=0;i<n;i++)
   {
    a[i]=Integer.parseInt(args[i]);
   }
   for(int i=0;i<n-1;i++)
   {
   for(int j=0;j<n-i-1;j++)
   {
    if(a[j]>a[j+1])
    {
    int t=a[j];
    a[j]=a[j+1];
    a[j+1]=t;
   }
   }
   }
   for(int i=0;i<n;i++)
   {
    System.out.print(a[i]+" ");
   }
   System.out.println();
  }
 }
}
