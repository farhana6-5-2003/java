class Palindrome {
    public static void main(String args[]) {
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            int rev=0;
            int num = n; 
            while(num!=0) 
            {
               int temp=num%10;
               rev=rev*10+temp;
               num=num/10;
            }
            if (rev==n) {
                System.out.println(n + " is Palindrome");
            } else {
                System.out.println(n + " is not Palindrome");
            }
        } else {
            System.out.println("Provide Input");
        }
    }
}

