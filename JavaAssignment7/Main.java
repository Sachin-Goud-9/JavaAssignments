import Task1.Rodents;
import Task2.Bicycle;
import Task2.Cycle;
import Task2.Unicycle;
import Task3.*;

public class Main{
    public static void main(String[] args) {
        //Task1
        Rodents rodent = new Rodents[3];
        rodent[0] = new Mouse();
        rodent[0].displayObjectContent();
        rodent[1] = new Gerbil();
        rodent[1].displayObjectContent();
        rodent[2] = new Hamster();
        rodent[2].displayObjectContent();

        System.out.println();

        //Task2, Task4,
        Cycle unicycleInstance1 = new Unicycle();

        // unicycleInstance1.balance(); By Calling this method it will through an error as there is no balance method in Unicycle class.

        Cycle bicycleInstance1 = new Bicycle();

        //bicycleInstance1.balance();   By Calling this method it will through an error as there is no balance method in Bicycle class.

        Unicycle unicycleInstance2 = new Unicycle();

        unicycleInstance2.balance();

        Bicycle bicycleInstance2 = new Bicycle();

        bicycleInstance2.balance();

        //Task3
        ClassImplementingFourthInterface classImplementingFourthInterface = new ClassImplementingFourthInterface();

        MethodCallingFirstInterface methodCallingInterfaceOne = new MethodCallingFirstInterface();
        methodCallingInterfaceOne.methodCallingFirstInterface(classImplementingFourthInterface);

        MethodCallingSecondInterface methodCallingInterfaceTwo = new MethodCallingSecondInterface();
        methodCallingInterfaceTwo.methodCallingSecondInterface(classImplementingFourthInterface);

        MethodCallingThirdInterface methodCallingInterfaceThree = new MethodCallingThirdInterface();
        methodCallingInterfaceThree.methodCallingThirdInterface(classImplementingFourthInterface);

        MethodCallingFourthInterface methodCallingInterfaceFour = new MethodCallingFourthInterface();
        methodCallingInterfaceFour.methodCallingFourthInterface(classImplementingFourthInterface);
    }
}