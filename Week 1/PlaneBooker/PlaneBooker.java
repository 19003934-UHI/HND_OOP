import java.util.Scanner;

public class PlaneBooker 
{
    static Scanner kboard = new Scanner(System.in);

    public static int seats()
    {
        return();
    }

    public static int classPrice()
    {
        int price = 100;

        int business = price + (20/100 * 100);
        int local = price;
        int lesuire = price + (10/100 * 100);

        return()
    }

    public static void main(final String[] args)
    {
        int choice = 0;
        



        System.out.println("------------------------------------------------------");
        System.out.println("-Hello, and welcome.----------------------------------");
        System.out.println("-Choose from the list below:--------------------------");
        System.out.println("-Book a seat (1) -------------------------------------");
        System.out.println("-Display all seats, including passenger details (2) --");
        System.out.println("-Cancel a seat (3) -----------------------------------");
        System.out.println("-Display report for spare seats (4) ------------------");
        System.out.println("-Or, exit (5) ----------------------------------------");
        System.out.println("------------------------------------------------------");

        do // start do loop for menu and program
        {
            System.out.println("Please enter your choice: ");
            choice = kboard.nextInt();
            kboard.nextLine();

            switch (choice) // start choice
            {
                case 1:
                    System.out.println("---------------------");
                    System.out.println("---[] []  |  [] []--- Seats 1-4");
                    System.out.println("---[] []  |  [] []--- Seats 5-8");
                    System.out.println("---[] []  |  [] []--- Seats 9-12");
                    System.out.println("---[] []  |       --- Seats 13-14");
                    System.out.println("---------------------");
                    System.out.println("Please enter a seat number: ");
                    int seatNo = kboard.nextInt();

                break;
                

                case 5:
                    System.out.println("This program will now close.");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("--------------------  End of program ---------------------------");
                    System.out.println("----------------------------------------------------------------");
                break;
                default:
                {
                    System.out.println("Invalid selection");
                    System.out.println("------------------------");
                }
            }
        } 
        
        while(choice != 5);
            {
                choice = kboard.nextInt();
            }




    }
    


}
