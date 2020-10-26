/**
* Week 6 Challenge Exercise
* Updated Pontoon activity incorporating 
* Interfaces, Inheritance, Overloading / Overriding methods.
* 
* This class handles the cardhand, add the first two cards and the subsequent cards
* Peter Pasieka - since 25/10/2020
* V1.3
*/

package Pontoon;

import java.util.ArrayList;

public class Cardhand // class start
{
    public static ArrayList<Integer> heldCards(int card1, int card2) // heldCard method start
    {
        ArrayList<Integer> cardHand = new ArrayList<Integer>(); 
                                                                                    
        cardHand.add(card1);
        cardHand.add(card2);
        
        return(cardHand);

    } // method end

    public static ArrayList<Integer> addToHand(ArrayList<Integer> cardHand, int newCard) // addToHand method start
    {
        cardHand.add(newCard);
        
        return(cardHand);
    } // method end

} // class end
