package Tutorial2;

public class OrdinaryCustomer extends Customer
{
    private final double discount = 0;
    private static boolean goldMember;
    private static String status;
    private static double roomCost;
    private static double total;

    public OrdinaryCustomer()
    {
        customerName = this.getName();
        customerEmail = this.getEmail();
    }

    public void display()
    {
        System.out.println("Details are " + customerName + ", " + customerEmail);       
    }
    }

    public String getName()
    {
        System.out.println("Please enter your name: ");
        customerName = Input.kboard.nextLine();
        Input.kboard.nextLine();
    }
    
    public String getEmail()
    {
        System.out.println("Please enter your contact details: ");
        customerEmail = Input.kboard.nextLine();
    }
    
    public void goldMember()
    {
        goldMember = false;

        System.out.println("Are you a gold member?");
        goldMember = Input.kboard.next() != null;

        if(goldMember = true)
        {
            discount = 20;
            status = "Gold";
        } else {
            discount = 0;
            status = "No membership";
        }
    }

    public void calcCost(double cost)
    {
        if(goldMember = true)
        {
            total = Math.round(roomCost * (roomCost * discount / 100));
        } else {
            total = roomCost;
        }



        // this function will calculate the cost and display the value - must be formatted to 2dp
    }
    
}
