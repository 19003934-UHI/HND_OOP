package Problem_2;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Circle 
{
    static Scanner kboard = new Scanner(System.in);

    public static double getRadius() // gets desired radius size from the user
    {
        double radius = 0;
        System.out.println("Please enter a radius: ");
        radius = kboard.nextInt();
        kboard.nextLine();

        return(radius);
    } // method end

    public static Double calculateArea(double radius) // calculates circle are based off of user input
    {
        double area = (2 * Math.PI * radius);

        return(area);
    } // method end

    public static void circleDisplayAll() // displays all data relating to the circle option
    {
        DecimalFormat df = new DecimalFormat("#.##");

        double radius = getRadius();
        String area = df.format(calculateArea(radius));
        System.out.println("The area of the circle is: " + area + " units, with a radius of: " + radius + " units.");
    } // method end

}
