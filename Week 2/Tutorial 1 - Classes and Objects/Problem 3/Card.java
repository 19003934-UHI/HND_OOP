import java.util.Random;

public class Card // start class
{

    public Card(String[] suites, int[] values, String[] namedValues)
    {
        // build a random card set

        Random suiteR = new Random();
        int Suite = suiteR.nextInt(suites.length);
        System.out.println(Suite);
        



    }

  

    public void cardTypes() // holds card data
    {
        String[] suites = { "Hearts", "Diamonds", "Spades", "Clubs" };
        int[] values = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String[] namedValues = { "Ace", "Jack", "Queen", "King" };
    }

    public void displayCard()
    {


    }

    public void returnDrawn()
    {

    }

    public void isDrawn()
    {

    }

    public static void main(String[] args) // start main
    {
            // if loop running until i = 52
            // hopefully creates every possible card combo

            Card Card1 = new Card(args, null, args);



    } // end main


} // end class
