class Sum
{
 public static void main(String args[])
 {
 if(args.length>0)
 {
  int n=Integer.parseInt(args[0]);
  int i=1;
  int s1=0;
  int s2=0;
  int s3=0;
  while(i<=n)
  {
  s1=s1+i;
  i++;
  }
  i=1;
 do
  {
  s2=s2+i;
  i++;
  }while(i<=n);
  for(i=1;i<=n;i++)
  {
  s3=s3+i;
  }
  System.out.println("Using while loop : "+s1);
  System.out.println("Using do..while : "+s2);
  System.out.println("Using for loop: "+s3);
 }
}
}
