class Largest{
    public static void main(String args[]) {
        if (args.length > 0) {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int n3 = Integer.parseInt(args[2]);
            if(n1>n2&&n1>n3)
            {
                System.out.println(n1 + " is the largest");
            } 
            else if(n2>n3)
            {
                System.out.println(n2+ " is the largest");
            }
             else 
            {
                System.out.println(n3+ " is the largest");
            }
        } else {
            System.out.println("Provide Input");
        }
    }
}

