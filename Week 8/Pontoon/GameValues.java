package Pontoon;

/**
* Week 6 Challenge Exercise
* Updated Pontoon activity incorporating 
* Interfaces, Inheritance, Overloading / Overriding methods.
* 
* This class creates final instances of the first two cards and the house
* Peter Pasieka - 25/10/2020
* V1.3
*/
public interface GameValues
{
    final int card1 = House.getRandomNumber();
    final int card2 = House.getRandomNumber();
    final int house = House.houseNumber();
}
