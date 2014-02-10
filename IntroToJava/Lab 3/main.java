import java.util.Scanner;

/**
 * This class contains the problems from lab 3.
 * name : Fisher Evans
 */

public class main
{
    public static void Num1()
    {
            // ASSIGN VARIABLES
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first integer: ");
        int int1 = in.nextInt();
        System.out.print("Please enter the second integer: ");
        int int2 = in.nextInt();
        
            // PRINT SEPERATOR
        System.out.println("========================");
        
            // PRINT COMPARISONS
        System.out.println(" - The Sum of the two integers is: " + (int1 + int2));
        System.out.println(" - The Difference of the two integers is: " + (int1 - int2));
        System.out.println(" - The Product of the two integers is: " + (int1 * int2));
        System.out.println(" - The Average of the two integers is: " + ((int1 + int2)/2));
        System.out.println(" - The Distance of the two integers is: " + Math.abs(int1 - int2));
        System.out.println(" - The Maximum of the two integers is: " + Math.max(int1, int2));
        System.out.println(" - The Minimum of the two integers is: " + Math.min(int1, int2));
        
            // PRINT SEPERATOR
        System.out.println("========================\n");
        
    }
    
    public static void Num2()
    {
            // ASSIGN VARIABLES
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter price ($X.XX): ");
        double start = in.nextDouble();
        
        int dollars = (int)start; // FLOOR PRICE FOR $$$
        int cents = (int)((100*(start - dollars)) + 0.05); // MULT DIFFERNCE BY 100 TO GET CENTS
        
            // PRINT OUT THE RESULTS
        System.out.println("------------------");
        System.out.println("  Dollars: " + dollars);
        System.out.println("    Cents: " + cents);
        System.out.println("------------------\n");
        
        
        
    }
    
    public static void Num3()
    {
        /**
         * In the source pad, 

         * 3 * 1000 * 1000 * 1000 = -1294967296 (int)

         * 3.0 * 1000 * 1000 * 1000 = 3.0E9 (double)

         * when you don't declare a ".", Java assumes Integer.
         * Including the ".0" forces Java to calculate the
         * value as a double.

         * The reason is that an "int" variable can only become
         * so large, before it defaults to the lowest possible
         * value. The double allows for much higher numbers.
           */
    }
    
    public static void Num4()
    {
            // ASSIGN VARIABLES
        Scanner in = new Scanner(System.in);
        System.out.print("How many gallons of gas are in the tank?: ");
        double gallons = in.nextDouble();
        System.out.print("What is the car's fuel effeincy (mpg)?: ");
        double mpg = in.nextDouble();
        System.out.print("What is the price of gass per gallon?: ");
        double cost = in.nextDouble();
        
            // CALCUALTE RESULTS
        double hundredcost = ( 100 / mpg ) * cost; // GALLONS / 100 MILES TIMES THE GAS COST
        double distance = mpg * gallons; // MILES OVER GALLONS TIMES GALLONS = DISTANCE
        
            // PRINT SEPERATOR
        System.out.println("------------------");
        
            // PRINT COST WITH 2 DECIMAL DIGITS
        System.out.println("Cost/100 Miles: (In dollars)");
            System.out.printf("%8.2f\n",hundredcost);
            
            // PRINT DISTANCE WITH 2 DECIMAL DIGITS
        System.out.println("Without refuling, you can travel: (In miles)");
            System.out.printf("%8.2f\n",distance);
            
            // PRINT SEPERATOR
        System.out.println("------------------\n");
    }
}