package Tutorial1;

public class ElectricGuitar extends StringedInstrument
{
    public ElectricGuitar()
    {
        name = "Guitar";
        numberOfStrings = 6;
    }

    public ElectricGuitar(int gNumberOfStrings)
    {
        name = "Guitar";
        numberOfStrings = gNumberOfStrings;
    }

    public void play()
    {
        System.out.println("An electric " + numberOfStrings + "-stringed " + name + " is rocking!");
    }

}
