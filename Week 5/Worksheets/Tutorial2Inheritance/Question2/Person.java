package Worksheets.Tutorial2Inheritance.Question2;

/*
 * Author: Peter Pasieka
 * Class Purpose:
 * Date Built: 08/10/2020
 * Version: V0.1
 */

import java.util.Scanner;

public class Person // class start 
{
    
    public static Scanner kboard = new Scanner(System.in);

    private String personsName;
    private String personsAddress;
    private static int personsAge;
    
    public Person()
    {
        getPersonName(personsName);
        getPersonAddress(personsAddress);
        getPersonAge(personsAge);
    }

    void getPersonName(String gName)
    {
        System.out.println("Please enter your name: ");
        gName = kboard.nextLine();
        personsName = gName;
    }

    void getPersonAddress(String gAddress)
    { 
        System.out.println("Please enter your address: ");
        gAddress = kboard.nextLine();
        personsAddress = gAddress;
    }

    void getPersonAge(int gAge)
    {
        System.out.println("Please enter your age: ");
        gAge = kboard.nextInt();
        personsAge = gAge;
    }

    void displayDetails()
    {
        System.out.println("This person's name is : " + personsName);
        System.out.println("This person's address is : " + personsAddress);
        System.out.println("This person's age is : " + personsAge);
    }

    static int returnAge()
    {
        return returnAge();
    }

    static void changeAge(int cAge)
    {
        System.out.println("There has been an error in this person's age.");
        System.out.println("Please change it to 36. ");
        cAge = kboard.nextInt();

        if (cAge != 36)
        {
            System.out.println("There has been an error in this person's age.");
            System.out.println("Please change it to 36. ");
            cAge = kboard.nextInt();
            
        } else {
            returnAge();
        }
    }


    public static void main(String[] args)
    {
        System.out.println("-------------------------------------------");
        System.out.println("Person 1: ");
        Person P1 = new Person();
        P1.displayDetails();

        System.out.println("-------------------------------------------");
        System.out.println("Person 2: ");
        Person P2 = new Person();
    
        
        P2.displayDetails();
        System.out.println("-------------------------------------------");


    }






} // class end
