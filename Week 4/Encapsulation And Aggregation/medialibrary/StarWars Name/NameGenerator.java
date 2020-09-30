
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class NameGenerator {
    static Scanner kboard = new Scanner(System.in);

    public static String firstName;
    public static String lastName;
    public static String motherName;
    public static String placeOfBirth;

    public static void main(String[] args) {

        generateStarWarsName();
        DisplayStarWarsName(null);

    }

    public static ArrayList<String> generateStarWarsName() {
        ArrayList<String> details = new ArrayList<String>();

        System.out.println("Please enter your first name: ");
        firstName = kboard.next();
        kboard.nextLine();

        System.out.println("Please enter your last name: ");
        lastName = kboard.next();
        kboard.nextLine();

        System.out.println("Please enter your Mother's maiden name: ");
        motherName = kboard.next();
        kboard.nextLine();

        System.out.println("Please enter your place of birth: ");
        placeOfBirth = kboard.next();
        kboard.nextLine();

        details.add(firstName);
        details.add(lastName);
        details.add(motherName);
        details.add(placeOfBirth);

        return (details);

    }

    public static void DisplayStarWarsName(ArrayList<String> details) 
    {
       
        System.out.println(details);
        
        String forename = "";
        String surname = "";

        String deconFirstName = "";
        String deconLastName = "";
        String deconMotherName = "";
        String deconPlaceOfBirth = "";

        deconFirstName = details.get(0);
        deconFirstName = details.length(0, 1);


        deconFirstName = details[0].substring(0, 1);
        deconLastName = details[1].substring(0, 2);

        forename = deconFirstName + deconLastName;

        deconMotherName = details[3].substring(0, 1);
        deconPlaceOfBirth = details[4].substring(0, 2);

        surname = deconPlaceOfBirth + deconMotherName;

        System.out.println("Congratulations! ");
        System.out.println("Your generated Star Wars name is: ");
        System.out.println(forename + " " + surname);
    }

}