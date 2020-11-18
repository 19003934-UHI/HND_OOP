/*
 *  This class was adopted from a tutorial on creating BlackJack in JavaFX.
 *  Elements of this game has been changed to fit the requirements of the Pontoon game.
 *  Tutorial can be found here:
 *  https://www.youtube.com/watch?v=I2EVF50V-84&list=WL&index=1&t=7s
 *  Author: Peter Pasieka
 *  Since: 05/11/2020
 */

public class Deck 
{
    private Card[] cards = new Card[52];

    public Deck()
    {
        refill();
    }

    public final void refill()
    {
        int i = 0;

        for (Card.Suit suit : Card.Suit.values())
        {
            for(Card.CardNo cardNo : Card.CardNo.values())
            {
                cards[i++] = new Card(suit, cardNo);
            }
        }
    }
    
    // grab a random card from the deck
    public Card drawCard()
    {
         Card card = null;
         while (card == null)
         {
             int index = (int)(Math.random() * cards.length);
             card = cards[index];
             cards[index] = null; // after taking a card from the deck, renders that particular card as empty, ensuring this card doesn't get redrawn
         }

         return card;
    }


}
