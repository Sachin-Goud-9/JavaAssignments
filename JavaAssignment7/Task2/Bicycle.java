package Task2;

public class Bicycle extends Cycle{
    Bicycle()
    {
        System.out.println("This is a Bicycle Class");
    }
    public void code()
    {
        cycleManufacturedFactory();
    }
    public void cycleManufacturedFactory()
    {
        System.out.println("This is a Bicycle Factory");

    }
    public void balance() {
        System.out.println("Balance method in Bicycle.");
    }
}
