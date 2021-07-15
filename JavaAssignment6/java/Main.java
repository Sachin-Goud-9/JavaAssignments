import Task1.CheckWhetherVampireNumber;
import Task1.NumberOfDigits;
import Task2.OverloadingOfConstructors;
import Task3.ClassToCreateArrayOfStringObjects;
import Task3.GenerateRandomNumbers;

public class Main {
    public static void main(String[] args) {
        //Task1 - Vampire Numbers.
        //Driver Code to print 1st 100 Vampire Numbers.
        int counter = 0;
        int  serialNumber = 1;
        NumberOfDigits numberOfDigits = new NumberOfDigits();
        CheckWhetherVampireNumber checkWhetherVampireNumber = new CheckWhetherVampireNumber();
        for (long i = 100; counter < 100; i++) {
            //If the length of the number is odd then it can't be a Vampire Number.
            if ((numberOfDigits.numberOfDigitsInANumber(i) % 2) != 0) {
                i = i * 10 - 1;
                continue;
            }
            for (long part1OfOriginalNumber = 2; part1OfOriginalNumber <= Math.sqrt(i) + 1; part1OfOriginalNumber++) {
                if (i % part1OfOriginalNumber == 0) {
                    long part2OfOriginalNumber = i / part1OfOriginalNumber;
                    //CHeck if both the parts can form a single number.
                    if (checkWhetherVampireNumber.isVampireNumber(i, part1OfOriginalNumber, part2OfOriginalNumber) && part1OfOriginalNumber <= part2OfOriginalNumber) {
                        //vampireNumbers.add(i);
                        System.out.println(serialNumber + ")" + i);
                        serialNumber++;
                        counter++;
                    }
                }
            }
        }
        System.out.println();
        //Task 2
        System.out.println("Task - 2");
        OverloadingOfConstructors or = new OverloadingOfConstructors(10);

        System.out.println();
        //Task 3 - Array of objects creation.

        System.out.println("Task - 3");
        ClassToCreateArrayOfStringObjects stringObjectsCreated[] = new ClassToCreateArrayOfStringObjects[8];
        GenerateRandomNumbers generateRandomNumbers = new GenerateRandomNumbers();
        for(int i=0;i<8;i++) {
            stringObjectsCreated[i] = new ClassToCreateArrayOfStringObjects(generateRandomNumbers.generateRandomAlphaNumericNumbers((i+4)%10+1));
        }
    }
}
