class OddEven
{
 public static void main(String args[])
 {
 if(args.length>0)
 {
  int num=Integer.parseInt(args[0]);
  if(num>0)
  {
  System.out.println("+ve");
  }
  else if(num<0)
  {
    System.out.println("-ve");
  }
  else
  {
    System.out.println("0");
  }
 }
 else
 {
 System.out.println("Provide Input");
 }
 }
}
