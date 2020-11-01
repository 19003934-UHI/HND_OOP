/*
 *  Author: Peter Pasieka
 *  Date Created: 27/10/2020
 *  Class Purpose: 
 *  File Version: V1.0 Final
 */

public class Hotel 
{
    private int hotelNumber;
    public String hotelName;
    private Floor floors[] = new Floor[4];

    public Hotel(int nos, String name)
    {
        hotelNumber = nos;
        hotelName = name;

        Floor F1 = new Floor(1);
        Floor F2 = new Floor(2);
        Floor F3 = new Floor(3);
        Floor F4 = new Floor(4);

        floors[0] = F1;
        floors[1] = F2;
        floors[2] = F3;
        floors[3] = F4;
    }

    public void chooseFloor()
    {
        int floorChoice;
        System.out.println("Which floor would you like to check? ");
        floorChoice = Input.kboard.nextInt();

        if (floorChoice >= 5)
        {
            System.out.println("Sorry, our hotel doesnt go that high.");
            System.out.println("Which floor would you like to check? ");
            floorChoice = Input.kboard.nextInt();
        } else {
            floors[floorChoice - 1].displayFloor();
        }
    }

    public void display()
    {
        System.out.println("Hotel Name: " + hotelName);
        for (int counter = 0; counter < floors.length; counter++)
        {
            floors[counter].displayFloor(); // uses the same method from floor    
            System.out.println("-------------------------------");
        }
    }

    public void display(int floorNos) // the floor number will be passed to the method
    {
        System.out.println("Hotel Name: " + hotelName);
        floors[floorNos].displayFloor();
    }

    public void bookARoom()
    {
        int floorChoice;
        System.out.println("Which floor would you like to stay on? ");
        floorChoice = Input.kboard.nextInt();
        floors[floorChoice - 1].findRoomtoBook();
    }

    public void cancelARoom()
    {
        int floorChoice;
        System.out.println("Which floor are you staying on? ");
        floorChoice = Input.kboard.nextInt();
        floors[floorChoice - 1].findRoomtoCancel();
    }

}
