package JavaLibrariesExercise;

import java.util.ArrayList;
import java.util.Arrays;

/* 
    Author: Peter Pasieka
    Date built: 30/03/2020
    Class Purpose(s): To compare different strings and to see if they are the same
                      To take a string and seperate them into smaller strings
*/

public class JavaLib1Strings // class start
{

    public static void main(String[] args) 
    {
        System.out.println("------------------------------------------------------");
        System.out.println("String Compare: ");
        StringCompare();
        System.out.println("------------------------------------------------------");
        System.out.println("List Splitter: ");
        ListSplitter();
        System.out.println("------------------------------------------------------");
    }

    public static void StringCompare() /* Compares premade statements and compares them to check if they are the same. */
    {
        String thing1 = "I am a thing";
        System.out.println("Statement 1: " + thing1);
        String thing2 = "No, I am a thing!";
        System.out.println("Statement 2: " + thing2);
        String thing3 = "That thing is a spy!";
        System.out.println("Statement 3: " + thing3);
        String thing4 = "I am a thing";
        System.out.println("Statement 4: " + thing4);

        System.out.println("------------------------------------------------------");
        System.out.println("The system will now compare some prebuilt comments: ");

        System.out.println("Are Statement 1 and Statement 2 equal? ");
        System.out.println(thing1.equals(thing2));
        System.out.println("Are Statement 3 and Statement 4 equal? ");
        System.out.println(thing3.equals(thing4));
        System.out.println("Are Statement 1 and Statement 4 equal? ");
        System.out.println(thing1.equals(thing4));

    }

    /* This method was adapted from stackoverflow.com querying, "How to convert comma-seperated String to list?" */

    public static void ListSplitter() /* Takes a premade list and splits into seperate strings */
    {
        String commaList = ("I,Think,This,Is,Right?");
        ArrayList<String> seperatedList = new ArrayList<String>(Arrays.asList(commaList.split(",")));

        for(int i = 0; i < seperatedList.size(); i++)
        {
            System.out.println("---> " + seperatedList.get(i));
        }
        /*

            String str="string,with,comma";
            ArrayList aList= new ArrayList(Arrays.asList(str.split(",")));
            for(int i=0;i<aList.size();i++)
            {
                System.out.println(" -->"+aList.get(i));
            }

        */

    }

} // class end
