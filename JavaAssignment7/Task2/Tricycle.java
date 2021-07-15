package Task2;

public class Tricycle extends Cycle{
    Tricycle()
    {
        System.out.println("This is a Tricycle Class");
    }
    public void code()
    {
        cycleManufacturedFactory();
    }
    public void cycleManufacturedFactory()
    {
        System.out.println("This is a Tricycle Factory");

    }
    public void balance() {
        System.out.println("Balance method in Tricycle.");
    }
}
