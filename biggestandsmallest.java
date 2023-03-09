import java.util.Scanner;

class biggestandsmallest
{
    private static double a, b;
    private static double biggest;
    private static Scanner input = new Scanner(System.in);
    
    public static void main()
    {
        System.out.println("Insert the first number!");
        a = input.nextDouble();

        System.out.println("Insert the second number!");
        b = input.nextDouble();

        if(a > b)
        {
            biggest = a;
        }
        else
        {
            biggest = b;
        }

        System.out.println(biggest);

        /**
            For the smallest you will change this(>) for this(<), and
            create a new double called smallest, and
            change the println for smallest!
            
                if(a < b)
                {
                    smallest = a;
                }
                else
                {
                    smallest = b;
                }
        */
    }
}