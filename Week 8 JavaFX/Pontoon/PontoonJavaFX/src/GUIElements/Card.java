/*
 *  This class was adopted from a tutorial on creating BlackJack in JavaFX.
 *  Elements of this game has been changed to fit the requirements of the Pontoon game.
 *  Tutorial can be found here:
 *  https://www.youtube.com/watch?v=I2EVF50V-84&list=WL&index=1&t=7s
 *  Author: Peter Pasieka
 *  Since: 05/11/2020
 */

import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Card extends Parent 
{
    
    enum Suit
    {
        HEARTS, DIAMONDS, CLUBS, SPADES
    };

    enum CardNo
    {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), 
        EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10), ACE(11);

        final int value;
        private CardNo(int value)
        {
            this.value = value;
        }
    };

    public final Suit suit;
    public final CardNo cardNo;
    public final int value;

    public Card(Suit suit, CardNo cardNo) // Card constructor
    {
        this.suit = suit;
        this.cardNo = cardNo;
        this.value = cardNo.value;

        // Card visuals
        Rectangle card = new Rectangle(80, 100);
        card.setArcWidth(20);
        card.setArcHeight(20);
        card.setFill(Color.WHITE);

        Text text = new Text(toString());
        text.setWrappingWidth(70);

        getChildren().add(new StackPane(card, text));
    }

    // Returns a new Card object with a random suite and card number
    @Override
    public String toString()
    {
        return cardNo.toString() + " of " + suit.toString();
    }

}
