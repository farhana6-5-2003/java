class Table
{
 public static void main(String args[])
 {
  if(args.length>0)
  {
   int num=Integer.parseInt(args[0]);
   for(int i=1;i<=10;i++)
   {
    System.out.println(num+" x "+i+"="+(num*i));
   }
  }
  else
  {
   System.out.println("Provide Input");
  }
 }
}
