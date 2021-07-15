package Task2;

public class Unicycle extends Cycle{
    Unicycle()
    {
        System.out.println("This is a Unicycle Class");
    }
    public void code()
    {
        cycleManufacturedFactory();
    }
    public void cycleManufacturedFactory()
    {
        System.out.println("This is a Unicycle Factory");

    }
    public void balance() {
        System.out.println("Balance method in Unicycle.");
    }
}
