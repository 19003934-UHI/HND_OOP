import java.util.ArrayList;

public class StudentDetails 
{
    public static String student;
    public static String studentInfo;
    public static String forename;
    public static String surname;
    public static String email;
    public static String studentNo;
    public static String phoneNo;
    public static String unitResult;
    public static ArrayList<String> newStudent = new ArrayList<String>();
    public static ArrayList<String> classList = new ArrayList<String>(); 
    public static ArrayList<String> studentNames = new ArrayList<String>();

    private static int classCount;

    public static void newStudentDetails() 
    {
        System.out.println("Please enter your forename: ");
        forename = Input.kboard.next();

        System.out.println("Please enter your surname: ");
        surname = Input.kboard.next();

        System.out.println("Please enter your email: ");
        email = Input.kboard.next();

        System.out.println("Please enter your Student Number: ");
        studentNo = Input.kboard.next();

        System.out.println("Please enter your Phone Number: ");
        phoneNo = Input.kboard.next();

        System.out.println("Has this student passed? (P or F)");
        unitResult = Input.kboard.next();

        studentInfo = forename + " " + surname + " " + email + " " + studentNo + " " + phoneNo + " " + unitResult;
        student = forename + " " + surname;
        
    }

    public static void addStudent() 
    {
        classList.add(studentInfo);
        System.out.println(classList);

        if (classCount > 10)
        {
            System.out.println("Sorry, there were no spaces left.");
        } else {
            System.out.println("The student has been added.");
            classCount++;
        }
    }

    public static void existingStudent()
    {
        forename = "John";
        surname = "Doe";
        email = "joedohn@gmail.com";
        studentNo = "IN18039342";
        phoneNo = "078392650072";
        unitResult = "F";

        //studentInfo = forename + " " + surname + " " + email + " " + studentNo + " " + phoneNo + " " + unitResult;
        //classList.add(studentInfo);

        classList.add(forename);
        classList.add(surname);
        classList.add(email);
        classList.add(studentNo);
        classList.add(phoneNo);
        classList.add(unitResult);

        forename = "Toby";
        surname = "Migure";
        email = "tmigure@hotmail.com";
        studentNo = "IN17006852";
        phoneNo = "079845114579";
        unitResult = "P";

        studentInfo = forename + " " + surname + " " + email + " " + studentNo + " " + phoneNo + " " + unitResult;
        classList.add(studentInfo);
    }

}
