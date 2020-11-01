public class EmployeeCustomer extends Customer
{
    public EmployeeCustomer()
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
        System.out.println("As you are an employee here, you recieve this room free of charge.");

    }
}
