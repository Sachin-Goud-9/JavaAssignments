
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter two numbers to add");
            int firstNumber = Integer.parseInt(bufferedReader.readLine());
            int secondNumber = Integer.parseInt(bufferedReader.readLine());
            int resultAfterDividing = firstNumber / secondNumber;  // cannot divide by zero
            int arrayOfNumbers[] = new int[]{firstNumber, secondNumber};
            System.out.print("Enter the index of the element you need in the array : ");
            int indexOfElement = Integer.parseInt(bufferedReader.readLine());
            System.out.println(arrayOfNumbers[indexOfElement]);
            String valueAssignedToString = null;
            System.out.println("enter the character index you need in the string " + valueAssignedToString);
            int indexOfCharacterToBeFound = Integer.parseInt(bufferedReader.readLine());
            System.out.println(valueAssignedToString.charAt(indexOfCharacterToBeFound));
            System.out.println("Result = " + resultAfterDividing);

        } catch (ArithmeticException | IOException | ArrayIndexOutOfBoundsException | NullPointerException exceptionOccured) {
            System.out.println("Exception caught is : " + exceptionOccured.getMessage());
        } finally {
            System.out.println("This block gets executed whatever may be the circumstances.");
        }
    }
}
