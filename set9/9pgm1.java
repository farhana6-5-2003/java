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
  if(amount>0)
  {
  balance=balance+amount;
  System.out.println("Amount "+amount+" deposited successfully");
  }
  else
  {
    System.out.println("Invalid Amount");
  }
 }
 void withdraw(int amount)
 {
if(amount<=balance)
{
 balance=balance-amount;
 System.out.println("Amount "+amount+" withdrawed successfully");
}
else
  {
    System.out.println("Insufficient balance");
  }

 }
 void display()
 {
  System.out.println("\nAccount No. :"+accNo);
  System.out.println("Account Name :"+accName);
  System.out.println("Account Type :"+type);
  System.out.println("Account Balance :"+balance+"\n");
 }
}


class MainAcc
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  Account acc[]=new Account[5];

  int ano,b,da,wa;
  String n,t;
  for(int i=0;i<2;i++)
  {
      System.out.print("\nEnter Account No.:");
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
   
  
  int ch=0;
  do
  {
   System.out.println("\n1.Deposit amount");
   System.out.println("2.Withdraw amount");
   System.out.println("3.Display details");
   System.out.println("4.Exit");
   System.out.print("Enter your choice:");
   ch=sc.nextInt();
   switch(ch)
   {  
      
     case 1:
      System.out.print("Enter Account number:");
      ano=sc.nextInt();
      System.out.print("Enter amount to deposit:");
      da=sc.nextInt();
      for(int i=0;i<2;i++)
      {
       if(acc[i].accNo==ano)
       {
        acc[i].deposit(da);
       }

      }
      break;
    
      case 2:
      System.out.print("Enter Account number:");
      ano=sc.nextInt();
      System.out.print("Enter amount to withdraw:");
      wa=sc.nextInt();
      for(int i=0;i<2;i++)
      {
       if(acc[i].accNo==ano)
       {
        acc[i].withdraw(wa);
       }

      }
      break;

     case 3:
        System.out.print("Enter account number:");
        ano=sc.nextInt();
        for(int i=0;i<2;i++)
        {
         if(acc[i].accNo==ano)
         {
            acc[i].display();
         }
        }
        break;
     case 4:
         System.out.println("Exiting....");
         System.exit(0);
   }
  }while(ch!=4);
 sc.close(); 
}
}
