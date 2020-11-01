package Pontoon;

/**
* Week 6 Challenge Exercise
* Updated Pontoon activity incorporating 
* Interfaces, Inheritance, Overloading / Overriding methods.
* 
* This class handles the state of the Pontoon game, performing mathematical 
* tasks and correctly outputting the game's end result.
* Peter Pasieka - since 25/10/2020
* V1.3
*/

import java.util.ArrayList;

public class GameStates implements GameValues
{
    private static int count;
    private static int newCard;
    private static int total;
    private static ArrayList<Integer> cardHand = Cardhand.heldCards(card1, card2);
    public static String choice;
       
    public static void gameContinue()
    {
        total = card1 + card2;
        newCard = House.getRandomNumber();
        System.out.println(newCard);
        total = total + newCard;
        Cardhand.addToHand(cardHand, newCard);
        System.out.println("Current cards: " + cardHand);
        System.out.println("Would you like to draw another card? (Y/N) ");

        while (count > 4)
        {
            System.out.println("You cannot draw anymore cards. . ."); 
            choice = Input.kboard.nextLine();
        }
        count++;
    }

    public static void gameEnd()
    {
        if (total >= 19 && total <= 21)
        {
            if (total > house)
            {
                win();
            }
            
        } else if (total > 21)
            {
                houseLose();
            } else {
                lose();
            } // end if elseif

        System.exit(0);
    }

    public static void win()
    {
        System.out.println("------------------------------------------------------------");
        System.out.println("The total is: " + total);
        System.out.println("House total: " + house);
        System.out.println("Congratulations, you've won! ");
        System.out.println("Game over!");
        System.out.println("------------------------------------------------------------");
    }

    public static void houseLose()
    {
        System.out.println("------------------------------------------------------------");
        System.out.println("Busted! The total is: " + total + ". This is higher than 21.");
        System.out.println("House total: " + house);
        System.out.println("You lost!");
        System.out.println("Game over!");
        System.out.println("------------------------------------------------------------");
    }

    public static void lose()
    {
        System.out.println("------------------------------------------------------------");
        System.out.println("The total is: " + total);
        System.out.println("House total: " + house);
        System.out.println("You lost!");
        System.out.println("Game over!");
        System.out.println("------------------------------------------------------------");
    }




}
