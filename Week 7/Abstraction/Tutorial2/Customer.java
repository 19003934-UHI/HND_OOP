package Tutorial2;

public abstract class Customer 
{
    protected String customerName;
    protected String customerEmail;

    abstract public void display();
    abstract public String getName();
    abstract public String getEmail();
    abstract public void calcCost(double cost);

}
