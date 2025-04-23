class Prime
{
 public static void main(String args[])
 {
  if(args.length>0)
  {
  int n=Integer.parseInt(args[0]);
  int f=1,i;
  for(i=2;i<n;i++)
  {
   if(i!=2 && n%i==0)
   {
    f=0;
    break;
   }
  }
  if(f!=0)
  {
   System.out.println(n+" is a prime number");
  }
  else
  {
   System.out.println(n+" is not a prime number");
  }
  }
  else
  {
   System.out.println("Provide Input");
  }
 }
}
