package Tutorial1;

public class ElectricBassGuitar extends StringedInstrument 
{
    public ElectricBassGuitar()
    {
        name = "Bass Guitar";
        numberOfStrings = 4;
    }

    public ElectricBassGuitar(int numberOfStrings)
    {
        name = "Bass Guitar";
        this.numberOfStrings = numberOfStrings;
    }

    public void play()
    {
        System.out.println("An electric " + numberOfStrings + "-string " + name + " is booming!");
    }
}
