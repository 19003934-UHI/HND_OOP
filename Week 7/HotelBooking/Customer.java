/*
 *  Author: Peter Pasieka
 *  Date Created: 27/10/2020
 *  Class Purpose: 
 *  File Version: V1.0 Final
 */


public abstract class Customer 
{
    protected String customerName;
    protected String customerEmail;
    
    abstract public void display();
    abstract public String getName();
    abstract public String getEmail();
    abstract public void calcCost();    
}

