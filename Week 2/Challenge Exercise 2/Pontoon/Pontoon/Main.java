// Week 2 Challenge Exercise
// Pontoon activity using Objects and Classes
// Peter Pasieka - 18/09/2020
// V1.0

package Pontoon;

import java.util.Scanner;
import java.util.ArrayList;

public class Main // class start
{
    static Scanner kboard = new Scanner(System.in);

    public static void main(String[] args) // main start
    {
        // initalisation start
        String choice = "";
        int count = 0;
        int card1 = House.getRandomNumber();
        int card2 = House.getRandomNumber();
        int newCard = 0;
        int total = card1 + card2;
        int house = House.houseNumber();
        ArrayList<Integer> cardHand = Cardhand.heldCards(card1, card2);
        // initalisation end
        
        System.out.println("----------------------------");
        System.out.println("     Welcome to Pontoon!    ");
        System.out.println("----------------------------");

        System.out.println("Card 1: " + card1 + "   Card 2: " + card2);
        
        System.out.println("Would you like to draw another card?  (Y/N) ");
        do
        {
            choice = kboard.next();
            switch (choice) // switch case start
            {
                case "Y": // case Y & y start
                 case "y":
                    newCard = (int) (Math.random() * 10);
                    System.out.println(newCard);
                    total = total + newCard;
                    Cardhand.heldCards(card1, card2);
                    Cardhand.addToHand(cardHand, newCard);
                    System.out.println("Current cards: " + cardHand);
                    System.out.println("Would you like to draw another card? (Y/N) ");

                    while (count > 4)
                    {
                        System.out.println("You cannot draw anymore cards. . ."); // NEEDS FIXED ASAP, THROWN INTO LOOP PLZ FIX
                        choice = kboard.nextLine();
                    }
                    count++;

                break; // end case "Y"

                case "N": // case N & n start
                 case "n":
                    if (total >= 19 && total <= 21)
                    {
                        if (total > house)
                        {
                            System.out.println("----------------------------");
                            System.out.println("The total is: " + total);
                            System.out.println("House total: " + house);
                            System.out.println("Congratulations, you've won! ");
                            System.out.println("Game over!");
                            System.out.println("----------------------------");
                        }
                        
                    } else if (total > 21){
                        System.out.println("------------------------------------------------------------");
                        System.out.println("Busted! The total is: " + total + ". This is higher than 21.");
                        System.out.println("House total: " + house);
                        System.out.println("You lost!");
                        System.out.println("Game over!");
                        System.out.println("------------------------------------------------------------");

                    } else {
                        System.out.println("------------------------");
                        System.out.println("The total is: " + total);
                        System.out.println("House total: " + house);
                        System.out.println("You lost!");
                        System.out.println("Game over!");
                        System.out.println("------------------------");
                    } // end if elseif

                    System.exit(0);

                break; // end case "N"


                default:
                {
                    System.out.println("Invalid selection");
                    System.out.println("-----------------");
                }
            }
        }
        while(choice !=  "Y" || choice != "N");
        {
            choice = kboard.nextLine();
        }
        
        
    } // end main

} // end class