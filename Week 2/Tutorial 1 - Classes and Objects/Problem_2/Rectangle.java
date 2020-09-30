package Problem_2;

import java.util.Scanner;

public class Rectangle 
{
    static Scanner kboard = new Scanner(System.in);

    public static int getHeight() // gets desired rectange height
    {
        int height = 0;
        System.out.println("Please enter a number for the height of the rectangle: ");
        height = kboard.nextInt();
        kboard.nextLine();

        return(height);
    } // method end
    
    public static int getWidth() // gets desired rectange width
    {
        int width = 0;
        System.out.println("Please enter a number for the width of the rectangle: ");
        width = kboard.nextInt();
        kboard.nextLine();

        return(width);
    } // method end

    public static int calculateArea(int height, int width) // calculates rectangle area based off of user input
    {
        int area = height * width;

        return(area);
    } // method end

    public static boolean isSquare(int height, int width) // compares height and width to check if a square or not
    {
        boolean square = true;

        if (height == width)
        {
             square = true;
        } else {
             square = false;
        }

        return(square);

    } // method end

    public static void rectangleDisplayAll() // displays all data relating to the rectangle option
    {
        int height = getHeight();
        int width = getWidth();
        int area = calculateArea(height, width);
        boolean isSquare = isSquare(height, width);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("The area is: " + area + " units, and is it a square? " + isSquare);
    } // method end
    

}
