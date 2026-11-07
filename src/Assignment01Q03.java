public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");

        ////////////////////////////////////////////////////////////////
        // TODO: Replace this code with the correct Fibonacci sequence
        ////////////////////////////////////////////////////////////////
        /// ...
        
        int numOdd = 0;
        int f1 = 0;
        int f2 = 1;
        int temp = 1;

        for (int i = 0; i < x; i++) {
            if (i < x - 1) 
                System.out.print(f2 + " ");
            else
                System.out.print(f2);
            if (f2 % 2 == 1) numOdd++ ;
            temp = f1+f2;
            f1 = f2;
            f2 = temp;

        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
