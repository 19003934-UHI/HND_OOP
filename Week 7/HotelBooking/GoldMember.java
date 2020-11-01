public class GoldMember extends Customer
{
    private final double discount = 20;
    private double cost = 100;

    public GoldMember()
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
    }




    // public void goldMember()
    // {
    //     goldMember = false;

    //     System.out.println("Are you a gold member?");
    //     goldMember = Input.kboard.next() != null;

    //     if(goldMember = true)
    //     {
    //         discount = 20;
    //         status = "Gold";
    //     } else {
    //         discount = 0;
    //         status = "No membership";
    //     }
    // }



}
