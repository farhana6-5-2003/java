import java.util.*;
class Strings
{
public static void main(String  args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter 2 strings:");
 String s1=sc.nextLine();
 String s2=sc.nextLine();
 int l=s1.length();
 System.out.println("Length of the first string is "+l);
 if(l>=4)
 {
 System.out.println("Character at second position of the first string is "+s1.charAt(1));
 System.out.println("Character at fourth position of the first string is "+s1.charAt(3));
 }
 else
 {
  System.out.println("String contains less than 4 letters");
 }
 System.out.print("Enter Starting index of substring:");
 int si=sc.nextInt();
 System.out.println("Sub string using start index :"+s1.substring(si)); 
 System.out.print("Enter Starting index and Ending index of substring:");
 int si1=sc.nextInt();
 int ei=sc.nextInt();
 System.out.println("Sub string using starting and ending index :"+s1.substring(si1,ei)); 
 int result=s1.compareTo(s2);
 if(result<0)
 {
  System.out.println("String1 "+s1+" is Lexiographically smaller than String2"+s2);
 }
 else if(result>0)
 {
  System.out.println("String1 "+s1+" is Lexiographically greater than String2 "+s2);
 }
 else
 {
 System.out.println("String1 "+s1+" and String2 "+s2+" is Lexiographically Same");
 }
 int result2=s1.compareToIgnoreCase(s2);
 if(result2<0)
 {
  System.out.println("String1 "+s1+" is Lexiographically smaller than String2"+s2);
 }
 else if(result2>0)
 {
  System.out.println("String1 "+s1+" is Lexiographically greater than String2 "+s2);
 }
 else
 {
 System.out.println("String1 "+s1+" and String2 "+s2+" is Lexiographically Same");
 }
 String concatst=s1.concat(s2);
 System.out.println("After Concatenation: "+concatst);
 
 
 System.out.print("Enter a Sentence: ");
 String sen = sc.nextLine();
 System.out.print("Enter the string to replace: ");
 String rs = sc.nextLine();
 System.out.print("Enter new string to replace: ");
 String ns = sc.nextLine();
 System.out.println("Modified String is: " + sen.replace(rs, ns));
}
}
