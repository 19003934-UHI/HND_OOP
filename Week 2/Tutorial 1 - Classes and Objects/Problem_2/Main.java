package Problem_2;

import java.util.Scanner;

public class Main
{

    static Scanner kboard = new Scanner(System.in);

    public static void main(String[] args) // start of main
    {
        // initialise choice variable
        int choice = 0;

        // menu GUI
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("-------------------You have 3 choices to choose from: ---------------------");
        System.out.println("------------ Please select 1 if you want to create a rectangle ------------");
        System.out.println("------------ Please select 2 if you want to create a circle ---------------");
        System.out.println("------------ Please select 3 if you want to exit the program --------------");
        System.out.println("---------------------------------------------------------------------------");

        // start do loop
        do {
            System.out.println("Please enter your choice :");
            choice = kboard.nextInt();
            kboard.nextLine();

            // start switch case
            switch (choice) 
            {
                case 1: // case for rectangle option
                    System.out.println("You chose number 1 . . . ");
                    Rectangle.rectangleDisplayAll();
                    System.out.println("---------------------------------------------------------------------------");
                break; // case 1 end

                case 2: // case for circle option
                    System.out.println("You chose number 2 . . .");
                    Circle.circleDisplayAll();
                    System.out.println("---------------------------------------------------------------------------");
                break; // case 2 end

                case 3: // case for closing program
                System.out.println("You chose number 3 . . .");
                System.out.println("------------------------------- Goodbye -----------------------------------");
                System.out.println("---------------------------------------------------------------------------");
                break; // case 3 end

                default: // default case for an invalid choice
                {
                    System.out.println("Invalid selection");
                    System.out.println("---------------------------------------------------------------------------");
                } // default end
            }

        } while (choice != 3); // creates program end
        {
            choice = kboard.nextInt();
        }


    }



}
