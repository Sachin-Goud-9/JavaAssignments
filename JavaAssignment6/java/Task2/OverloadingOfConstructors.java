package Task2;

public class OverloadingOfConstructors {
    public OverloadingOfConstructors(int firstParameter){
        this(firstParameter,20);
        System.out.println("Only 1 parameter firstParameter = 10 was called while creating an object.");
    }
    public OverloadingOfConstructors(int firstParameter, int secondParameter){
        System.out.println("Constructor called with 2 arguments firstParameter = 10 and secondParameter = 20 was called in the constructor.");
        System.out.println("firstParameter + secondParameter = "+(firstParameter+secondParameter));
    }
}
