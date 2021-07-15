package Task1;

public class NumberOfDigits {
    public static int numberOfDigitsInANumber(long digitsToBeFound){
        return Long.toString(Math.abs(digitsToBeFound)).length();
    }
}
