public class OrdinaryCustomer extends Customer
{
    private final double discount = 0;
    private double cost = 100;

    public OrdinaryCustomer()
    {
        customerName = this.getName();
        customerEmail = this.getEmail();
    }

    public void display()
    {
        System.out.println("Details are " + customerName + ", " + customerEmail);       
    }
    

    public String getName()
    {
        System.out.println("Please enter your name: ");
        customerName = Input.kboard.nextLine();
        Input.kboard.nextLine();
        return customerName;
    }
    
    public String getEmail()
    {
        System.out.println("Please enter your contact details: ");
        customerEmail = Input.kboard.nextLine();
        return customerEmail;
    }

    public void calcCost()
    {
        cost = Math.round(cost - (cost * discount / 100));
        System.out.println("The cost of this room is: £" + cost);
        // this function will calculate the cost and display the value - must be formatted to 2dp
    }
    
}
