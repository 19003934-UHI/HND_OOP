/**
* Week 6 Challenge Exercise
* Updated Pontoon activity incorporating 
* Interfaces, Inheritance, Overloading / Overriding methods.
* 
* This class handles the state of the House and creating the random card numbers
* Peter Pasieka - since 25/10/2020
* V1.3
*/

package Pontoon;

public class House // class start 
{
    public static int getRandomNumber()
    {
       return (int) (Math.random() * 10 + 1);
    } // end getRandomNumber

    public static boolean getResult(int total, int house) // start getResult
    {
        if (total > house && total <= 21)
        {
            return(true);
        } else {
            return(false);
        } 
    } // end getResult

    public static boolean busted(int total) // start busted
    {
        if (total > 21)
        {
            return(true);
        } else {
            return false;
        }
    } // end busted

    public static int houseNumber() // start houseNumber
    {
        int house = (int) (Math.random() * 20);

        while (house < 16)
            {
                house = (int) (Math.random() * 20);
            } 
        
        return (house);
    } // end houseNumber
} // class end
