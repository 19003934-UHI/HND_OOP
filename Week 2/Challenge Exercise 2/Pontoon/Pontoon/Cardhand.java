// Week 2 Challenge Exercise
// Pontoon activity using Objects and Classes
// Peter Pasieka - 18/09/2020
// V1.0

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
