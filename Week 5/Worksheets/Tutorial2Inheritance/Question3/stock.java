package Worksheets.Tutorial2Inheritance.Question3;


/*
 * Author: Peter Pasieka
 * Class Purpose:
 * Date Built: 08/10/2020
 * Version: V0.1
 */

public class stock // class start
{
    
    private long stockNumber;
    private String stockDescription;
    private int amountInStock;

    public stock(long a, String b, int c) 
    {
        stockNumber = a;
        stockDescription = b;
        amountInStock = c;
    }

    

    public int displayAmountInStock() 
    {
        System.out.println(amountInStock);
        // this method will return the amount of stock
    }

    public void displayAllDetails() 
    {
        System.out.println("The amount of stock " + stockNumber + ", " + stockDescription + ", is: " + amountInStock);
        // display all stock details
    }

    public void updateStockAmount(int amountBought) 
    {
        // deducted first total to gain new total
        int redSocksBought;
        int blueSocksBought;
        int greenSocksBought;

        redSocksBought = 90;
        blueSocksBought = 20;
        greenSocksBought = 60;

        for (int i = 0; i < 1; i++)
        {
            StockNumber100.stockDescription
        }





    }

    public static void main(String[] args) // main start
    {

        stock StockNumber100 = new stock(100, "Red Socks", 100);
        stock StockNumber101 = new stock(101, "Blue Socks", 90);
        stock StockNumber102 = new stock(102, "Green Socks", 50);

        StockNumber100.displayAllDetails();
        StockNumber101.displayAllDetails();
        StockNumber102.displayAllDetails();

    } // main end


} // class end
