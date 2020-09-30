import java.util.Scanner;


public class Person // class start
{
    public static void main(String[] args) // main start
    {
        Person Person1 = new Person();
        Person Person2 = new Person();

        Person1.displayPerson();
        
        Person2.getForename();
        Person2.getSurname();
        Person2.getEmail();
        Person2.getPhoneNumber();
        Person2.getAge();
        Person2.displayPerson();
        
    } // main end

    static Scanner kboard = new Scanner(System.in);

    // variable initialisation
    String forename; 
    String surname;
    String email;
    int age; 
    String phoneNumber; 

        public Person() // Person constructor
        {
                forename = "Gill";
                surname = "Blue";
                email = "g.b@gmail.com";
                age = 22;
                phoneNumber = "0798783022";

        } // constructor end

        public Person(String forename, String surname) // Person constructor
        {
            this.forename = forename;
            this.surname = surname;
                
        } // constructor end
        
        public Person(String forename, String surname, int age) // Person constructor
        {
            this.forename = forename;
            this.surname = surname;
            this.age = age;
                
        } // constructor end

        public String getForename() // getForename start
        {
            System.out.println("Please enter your forename: ");
            forename = kboard.next();
            return(forename);
        } // method end

        public String getSurname() // getSurname start
        {
            System.out.println("Please enter your surname: ");
            surname = kboard.next();
            return(surname);
        } // method end

        public String getEmail()
        {
            System.out.println("Please enter your Email: ");
            email = kboard.next();
            return(email);
        }

        public String getPhoneNumber()
        {
            System.out.println("Please enter your phone number: ");
            phoneNumber = kboard.next();
            return(phoneNumber);
        }
        public int getAge() // getAge start
        {
            System.out.println("Please enter your age: ");
            age = kboard.nextInt();

            while (checkAge(age) != true)
            {
                System.out.println("Sorry! You must be over 18 to use this.");
                System.out.println("Please enter a new age: ");
                age = kboard.nextInt();
            }

            return(age);
        } // method end

        public void displayPerson() // displayPerson start
        {
            System.out.println("Name: " + forename + " " + surname);
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Age: " + age);
        } // method end

        private boolean checkAge(int age)
        {
            boolean overAge = true;

            if(age < 18)
            {
             overAge = false;
            } else{
             overAge= true;
            }

            return(overAge);
        }

        

} // class end

