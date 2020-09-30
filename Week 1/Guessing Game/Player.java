import java.util.Scanner;

public class Player // manages variables for the player class
    {
        int number = 0;
        Scanner kboard = new Scanner(System.in);
            public int guess()
            {
                number = kboard.nextInt();
                System.out.println("I guess the number . . . " + number);
    
                return(number); 
            } // end guess method

    } // end of Player class