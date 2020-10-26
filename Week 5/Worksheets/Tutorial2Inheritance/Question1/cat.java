package Worksheets.Tutorial2Inheritance.Question1;

/*
 * Author: Peter Pasieka
 * Class Purpose: Construct different instances of cat
 * Date Built: 07/10/2020
 * Version: V0.1
 */
import java.io.*;

public class cat // class start 
{

    public String catName;
    public String catBreed;
    public int catAge;

    /*
     *  cat constructors
     */
    public cat(String a, String b, int c)
    {
        getCatDetails(a,b,c);
    }

    public cat()
    {
        getName();
        getBreed();
        getAge();
    }    
    
    public void getCatDetails(String gCatName, String gBreed, int gAge)
    {
        catName = gCatName;
        catBreed = gBreed;
        catAge = gAge;
    }

    /*
     *  Cat detail getters
     */

    public String getName()
    {
        catName = "Mindy";
        return catName; 
    }

    public String getBreed()
    {
        catBreed = "Huge Gray Striped";
        return catBreed;
    }

    public int getAge()
    {
        catAge = 10;
        return catAge;
    }

    /*
     * displays the details of the cat
     */

    public void displayDetails() throws IOException
    {
        System.out.println("Cat's name is : " + catName);
        System.out.println("Cat's breed is : " + catBreed);
        System.out.println("Cat's age is : " + catAge);
    }

      /*
      * Main method, also creates two cats c1: Hamish and c2: Tango    
      */      
      
    public static void main(String[] args) throws IOException 
    {
        cat c1 = new cat("Hamish", "Fat White", 3);
        cat c2 = new cat("Tango", "Striped Orange", 10);
        cat c3 = new cat();
        
        System.out.println("-------------------------------------");
        c1.displayDetails();
        System.out.println("-------------------------------------");
        c2.displayDetails();
        System.out.println("-------------------------------------");
        c3.displayDetails();
        System.out.println("-------------------------------------");


    } 

} // class end

class kitten extends cat // class start, an extention of cat
{

    /* variable initialisation */
    private String eyeColour;
    private long catLength;

    /*
     *  Kitten constructor, inherits qualities of the "cat" class
     */
    public kitten(String gCatName, String gBreed, int gAge, String getEyeColour, long getCatLength) 
    {
        catName = gCatName;
        catBreed = gBreed;
        catAge = gAge;
        eyeColour = getEyeColour;
        catLength = getCatLength;

    }

    /*
     *  Kitten getters and setters
     */
    public String getEyeColour()
    {
        return eyeColour;
    }

    public long getCatLength()
    {
        return catLength;
    }

    /*
     *  Kitten main
     */
    public static void main(String[] args) throws IOException
    {
        cat c1 = new cat("Hamish", "Fat White", 21);
        kitten k1 = new kitten("Hamish 2", "Fat Grey", 1, "Green", 25);
        kitten k2 = new kitten("Mindy", "Striped Grey", 2, "Blue", 40);

        System.out.println("-------------------------------------");
        c1.displayDetails();
        System.out.println("-------------------------------------");
        k1.displayKittenDetails();
        System.out.println("-------------------------------------");
        k2.displayKittenDetails();
        System.out.println("-------------------------------------");

    }

    public void displayKittenDetails() throws IOException
    {
        System.out.println("Kitten's name is : " + catName);
        System.out.println("Kitten's breed is : " + catBreed);
        System.out.println("Kitten's age is : " + catAge);
        System.out.println("Kitten's eye colour is : " + eyeColour);
        System.out.println("Kitten's length is : " + catLength + "cm");
    }




} // class end
