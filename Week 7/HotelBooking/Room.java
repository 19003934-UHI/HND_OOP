/*
 *  Author: Peter Pasieka
 *  Date Created: 27/10/2020
 *  Class Purpose: 
 *  File Version: V1.0 Final
 */

public class Room 
{
    private int roomNos;
    private Customer occupier;
    public boolean status;
    private String memberStatus;

    public Room(int rnos)
    {
        roomNos = rnos;
        status = true; // free
    }

    public void display()
    {
        System.out.println("Room number: " + "0" + roomNos);
        if (status == true)
        {
            System.out.println("Room status: free");
        } else{
            occupier.display();
        }
    }

    // bookRoom overloaders
    public void bookRoom(OrdinaryCustomer oldCustomer)
    {
        if (status == true)
        {
            status = false; // set room availabilty to false
            occupier = oldCustomer;
        } else {
            System.out.println("Sorry, this room is booked.");
        }
    }

    public void bookRoom(GoldMember goldMember)
    {
        if (status == true)
        {
            status = false; // set room availabilty to false
            occupier = goldMember;
        } else {
            System.out.println("Sorry, this room is booked.");
        }
    }

    public void bookRoom(EmployeeCustomer freeCustomer)
    {
        if (status == true)
        {
            status = false; // set room availabilty to false
            occupier = freeCustomer;
        } else {
            System.out.println("Sorry, this room is booked.");
        }
    }

    // Main booking method, creates a customer of a variety of statuses
    public void bookRoom()
    {
        System.out.println("Room Number: " + roomNos);
        if (status == true) // asks if room is available
        {
            status = false; // sets room availability to false

            System.out.println("----------------------------------------------------------------------");
            System.out.println("Are you a: ");
            System.out.println("Ordinary customer?");
            System.out.println("Gold customer?");
            System.out.println("Employee customer?");

            memberStatus = Input.kboard.next();
       
                if (memberStatus.contains("ordinary"))
                {
                    OrdinaryCustomer oldCustomer = new OrdinaryCustomer();
                    oldCustomer.display();  
                    oldCustomer.calcCost();  
                    occupier = oldCustomer; 
                } else if (memberStatus.contains("gold"))
                {
                    GoldMember goldMember = new GoldMember();
                    goldMember.display();
                    goldMember.calcCost();
                    occupier = goldMember;
                } else if (memberStatus.contains("employee")) 
                {
                    EmployeeCustomer freeCustomer = new EmployeeCustomer();
                    freeCustomer.display();
                    freeCustomer.calcCost();
                    occupier = freeCustomer;    
                } else {
                    System.out.println("We don't do that here.");
                }
        }           
    }

    public void cancelBooking()
    {
        status = true;
        occupier = null;
        System.out.println("Your room has been cancelled.");
    }

    public int returnRoomNos()
    {
        return(roomNos);
    }

}
