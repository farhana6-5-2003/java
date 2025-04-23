class DigitSum
{
 public static void main(String args[])
 {
  if(args.length>0)
  {
   int num,i,sum=0,temp;
   num=Integer.parseInt(args[0]);
   while(num!=0)
   {
    temp=num%10;
    sum=sum+temp;
    num=num/10;
   }
   System.out.println("Sum of digits="+sum);
  }
  else
  {
   System.out.println("Provide Input");
  }
 }
}
