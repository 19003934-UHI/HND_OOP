/*
 *  Author: Peter Pasieka
 *  Date Created: 27/10/2020
 *  Class Purpose: 
 *  File Version: V1.0 Final
 */

public class HotelDriver 
{
    private static String choice;
    public static void main(String[] args)
    {
        // Customer occupiers[] = new Customer[10];
        // occupiers[0] = new OrdinaryCustomer();
        // occupiers[1] = new GoldMember();

        // occupiers[0].display();
        // occupiers[0].calcCost();

        // occupiers[1].display();
        // occupiers[1].calcCost();

        Hotel H1 = new Hotel(101, "The Grand");    
        
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Welcome to " + H1.hotelName + " hotel");
              
        System.out.println("What would you like to do?");
        System.out.println("View a floor? (1)");
        System.out.println("Book a room? (2)");
        System.out.println("Or cancel a booking? (3)");
    
        do
        {
            choice = Input.kboard.next();
            switch (choice)
            {
                case "1":
                    H1.chooseFloor();
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("View another floor (1), book a room (2) or cancel a booking (3)?");
                    System.out.println("----------------------------------------------------------------------");
                break;

                case "2":
                    H1.bookARoom();
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("View another floor (1), book a room (2) or cancel a booking (3)?");
                    System.out.println("----------------------------------------------------------------------");
                break;

                case "3":
                    H1.cancelARoom();
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("View another floor (1), book a room (2) or cancel a booking (3)?");
                    System.out.println("----------------------------------------------------------------------");

                break;

                case "exit":
                    System.exit(0);
                break;

                default:
                {
                    System.out.println("Sorry, you can't do that.");
                }
            }
        }
        while(choice != "exit");
        {
            System.out.println("What would you like to do?");
            choice = Input.kboard.next();
        }
        
    }
}


 