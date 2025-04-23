import java.util.*;
class Account
{
 int accNo;
 String accName,type;
 int balance;
 Account(int ano,String n,String t,int b)
 {
  accNo=ano;
  accName=n;
  type=t;
  balance=b;
 }
 void deposit(int amount)
 {
  balance=balance+amount;
 }
 void withdraw(int amount)
 {
 balance=balance-amount;
 }
 void display()
 {
  System.out.print("Account No. :"+accNo);
  System.out.print("Account Name :"+accName);
  System.out.print("Account Type :"+type);
  System.out.print("Account Balance :"+balance);
 }
}


class MainAcc
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  Account acc[]=new Account[5];
  int ch=0;
  int ano,b,da,wa;
  String n,t;
  for(int i=0;i<5;i++)
  {
      System.out.print("Enter Account No.:");
      ano=sc.nextInt();
      sc.nextLine();
      System.out.print("Enter Account name:");
      n=sc.nextLine();
      System.out.print("Enter Account type:");
      t=sc.nextLine();
      System.out.print("Enter Account Balance:");
      b=sc.nextInt();
      acc[i]=new Account(ano,n,t,b);
  }
   
  
  while(ch!=4)
  {
   System.out.println("1.Deposit amount");
   System.out.println("2.Withdraw amount");
   System.out.println("3.Display details");
   System.out.println("4.Exit");
   switch(ch)
   {  
      
   /*case 2:
      System.out.print("Enter amount to deposit:");
      da=sc.nextInt();*/
     case 4:
        System.out.print("Enter account number:");
        ano=sc.nextInt();
        for(int i=0;i<5;i++)
        {
         if acc[i]==ano
        }
     
   }
  }
 }
}
