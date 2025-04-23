class prime{
public static void main(String[] args) 
{
if (args.length != 1) 
{
System.out.println("Invalid");
return;
}
int limit = Integer.parseInt(args[0]);
System.out.println("Prime numbers up to " + limit + ":");
for (int num = 2; num <= limit; num++) 
{
int flag=1;
for (int i = 2; i * i <= num; i++) 
{
if (num % i == 0) 
{
flag=0;
break;
}
}
if (flag==1) 
{
System.out.print(num + " ");
}
}
}
}

