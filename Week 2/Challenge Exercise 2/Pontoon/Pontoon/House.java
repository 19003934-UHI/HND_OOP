// Week 2 Challenge Exercise
// Pontoon activity using Objects and Classes
// Peter Pasieka - 18/09/2020
// V1.0

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
