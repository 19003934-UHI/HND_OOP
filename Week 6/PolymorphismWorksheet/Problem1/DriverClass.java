/*
 *  Author: Peter Pasieka
 *  Date Created: 19/10/2020
 *  Class Purpose:
 *  File Version: 
 */

public class DriverClass 
{
    private static String choice = "";

    public static void main(String[] args)
    {
         StudentDetails.existingStudent(); // provides a sample classlist, ensuring the list is never empty

         System.out.println("--------------------------------------------------");
         System.out.println("| This is the class list for the following unit: |");
         System.out.println("| Unit: Object Oriented Programming              |");
         System.out.println("| Unit Code: H123 D34                            |");
         System.out.println("--------------------------------------------------");
         System.out.println("--------------------------------------------------");
         System.out.println("| You can:                                       |");
         System.out.println("| Add students to the list                   (1) |");
         System.out.println("| Display the enrolled students              (2) |");
         System.out.println("| Search for a specific student              (3) |");
         System.out.println("| Display the students who have passed       (4) |");
         System.out.println("| Display the overall pass rate for the unit (5) |");
         System.out.println("| Remove a student from the unit             (6) |");
         System.out.println("| Or EXIT                                        |");
         System.out.println("--------------------------------------------------");
    
        do
        { 
            System.out.println("--------------------------------------------------");
            System.out.println("| What would you like to do?                     |");
            System.out.println("--------------------------------------------------");
            choice = Input.kboard.next();
            switch (choice)
            {
                case "1": // case one
                    case "One":
                        case "one":
                            StudentDetails.newStudentDetails();
                            StudentDetails.addStudent();
                break; // case one end

                case "2": // case two
                    case "Two":
                        case "two":
                            StudentSearch.displayStudents();
                break; // case two end
                
                case "3":
                    case "Three":
                        case "three":
                            StudentSearch.searchStudent();
                break;

                case "4":
                    case "Four":
                        case "four":

                break;

                case "5":
                    case "Five":
                        case "five":

                break;

                case "6":
                    case "Six":
                        case "six":

                break;

                case "exit":
                    case "Exit":
                        case "EXIT":
                            System.out.println("--------------------------------------------------");
                            System.out.println("| Program shutting down . . .                    |");
                            System.out.println("--------------------------------------------------");
                            Input.kboard.close(); 
                            System.exit(0);
                default:
                {
                    System.out.println("--------------------------------------------------");
                    System.out.println("| Invalid selection                               ");
                    System.out.println("--------------------------------------------------");
                }
            }
           
        } 
        while (choice != "exit" || choice != "EXIT" || choice != "Exit");
        {
            System.out.println("--------------------------------------------------");
            System.out.println("| What would you like to do?                     |");
            System.out.println("--------------------------------------------------");
            choice = Input.kboard.next();
        }

         
        
    }    
}
