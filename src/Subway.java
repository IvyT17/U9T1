public class Subway extends Vehicle
{
    private int ads;

    public Subway(String name, int wheels, int ads)
    {
        super(name, wheels);
        this.ads = ads;
    }

    // getter methods

    public int getAds()
    {
        return ads;
    }

    public void train()
    {
        System.out.println("This is a Manhattan bound 4 train. The next stop is Bowling Green.");
    }

    public void closeDoors()
    {
        System.out.println("Stand clear of the closing doors please.");
    }
}
