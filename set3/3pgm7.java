class Armstrong {
    public static void main(String args[]) {
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            double c = 0.0;
            double s = 0.0;
            int num = n;
            
            int temp = num;
            while (temp != 0)
             {
                temp = temp / 10;
                c++;
             }
           
            temp = num;  
            while(temp!=0) 
            {
                double t = temp % 10;
                s += Math.pow(t, c);
                temp = temp / 10;
            }
            if (s == n) {
                System.out.println(n + " is an Armstrong number");
            } else {
                System.out.println(n + " is not an Armstrong number");
            }
        } else {
            System.out.println("Provide Input");
        }
    }
}

