/*
 *  Author: Peter Pasieka
 *  Date Created: 19/10/2020
 *  Class Purpose:
 *  File Version: 
 */

import java.io.*;

public class StudentSearch
{
       public static void displayStudents()
       {
    
            if (StudentDetails.classList.isEmpty() )
            {
                System.out.println("There are no students to display. ");
            } else {
                System.out.println("These are the students currently on the course: ");
                System.out.println("Student Name:    | Email:         |Student Number:      |Phone Number:     |Unit Result:    |");
                System.out.println("---------------------------------------------------------------------------------------------");
                arrayFormat();
            }

       } 

       /* 
        * help was found on stackoverflow on how to format the array properly
        * "Java append new line every n lines"
        */
       public static void arrayFormat()
       {
            int newLine = 3;
            int multiplicator = 1;
            for(int i = 0; i < StudentDetails.classList.size(); i++)
            {
            if( newLine == i)
            {
                // print extra line after every 3rd output        
                newLine = 3; //to reset variable to the correct delimiter on each subsequent n-th iteration
                multiplicator++;
                newLine = newLine * multiplicator;
            }
            System.out.println(StudentDetails.classList.get(i) + "\n");
            // print regular value on normal line during every iteration
        }
       }

       public static void searchStudent()
       {
           // System.out.println(StudentDetails.classList);

            System.out.println("Please enter the full name of the student you wish to find: ");
            String studentName = Input.kboard.next();

           // System.out.println(studentName);

            int namePos = StudentDetails.classList.indexOf(studentName);
           // System.out.println(namePos);
            String findStudent = StudentDetails.classList.get(namePos);
            // thought process is right, however due to how the name is stored 
            // it can't access the forename and surname at the same time
            

            System.out.println("The student you're looking for is "  + findStudent + "?" );
            String confirm = Input.kboard.next();

            if (confirm == "Yes" || confirm == "yes")
            {
                
            }

       }


}
