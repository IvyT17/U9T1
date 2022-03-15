public class Bicycle extends Vehicle
{
    private int gearCount;

    public Bicycle(String name, int wheels, int gearCount)
    {
        super(name, wheels);
        this.gearCount = gearCount;
    }

    // getter methods for instance variables

    public int getGearCount()
    {
        return gearCount;
    }

    public void ringBell()
    {
        System.out.println("Ring Ring Ring! Get out of my way -_-");
    }
}
