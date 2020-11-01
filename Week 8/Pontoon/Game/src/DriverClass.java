/**
* Week 6 Challenge Exercise
* Updated Pontoon activity incorporating 
* Interfaces, Inheritance, Overloading / Overriding methods.
* 
* This class starts the game and is the only class with a main method
* Child of the GameStates Parent class
* Peter Pasieka - since 25/10/2020
* V1.3
*/

public class DriverClass extends GameStates // class start
{
    public static void main(String[] args) // main start
    {
        System.out.println("--------------------------------------------");
        System.out.println("             Welcome to Pontoon!            ");
        System.out.println("--------------------------------------------");
        System.out.println("Card 1: " + card1 + "   Card 2: " + card2);
        System.out.println("Would you like to draw another card?  (Y/N) ");
       
        do
        {
            GameStates.choice = Input.kboard.next();
            switch (GameStates.choice) // switch case start
            {
                case "Y": // case Y & y start
                 case "y":
                    GameStates.gameContinue();

                break; // end case "Y"

                case "N": // case N & n start
                 case "n":
                    GameStates.gameEnd();

                break; // end case "N"

                default:
                {
                    System.out.println("Invalid selection");
                    System.out.println("-----------------");
                }
            }
        }
        while(GameStates.choice !=  "Y" || GameStates.choice != "N");
        {
            GameStates.choice = Input.kboard.nextLine();
        }
    } // end main
} // end class