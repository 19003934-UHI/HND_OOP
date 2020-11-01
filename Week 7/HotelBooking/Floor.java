/*
 *  Author: Peter Pasieka
 *  Date Created: 27/10/2020
 *  Class Purpose: 
 *  File Version: V1.0 Final
 */

public class Floor 
{
    private int floorNo;
    Room rooms[] = new Room[4];

    public Floor(int nos)
    {
        floorNo = nos;
       
        Room R1 = new Room(1);
        Room R2 = new Room(2);
        Room R3 = new Room(3);
        Room R4 = new Room(4);

        rooms[0] = R1;
        rooms[1] = R2;
        rooms[2] = R3;
        rooms[3] = R4;
    }

    public void displayFloor()
    {
        System.out.println("You are currently on floor: " + floorNo);

        for(int counter = 0; counter < rooms.length; counter++)
        {
            System.out.println("----------------------------------------------------------------------");
            rooms[counter].display();
        }
    }

    public void findRoomtoBook()
    {
        int nos;
        int counter = 0;
        boolean found = false;
        System.out.println("Please enter a room number: ");
        nos = Input.kboard.nextInt();

        for (counter = 0; counter < rooms.length; counter++)
        {
            if (nos == rooms[counter].returnRoomNos())
            {
                found = true;
                rooms[counter].bookRoom();
                break;
            }
        }
        if (found == false) 
        {
            System.out.println("Sorry, no such room number exists. ");
        }
    }

    public void findRoomtoCancel()
    {
        int nos;
        int counter = 0;
        boolean found = false;
        System.out.println("Please enter a room number: ");
        nos = Input.kboard.nextInt();

        for (counter = 0; counter < rooms.length; counter++)
        {
            if (nos == rooms[counter].returnRoomNos())
            {
                found = true;
                rooms[counter].cancelBooking();
                break;
            }
        }
        if (found == false) 
        {
            System.out.println("Sorry, no such room number exists. ");
        }
    }
}
