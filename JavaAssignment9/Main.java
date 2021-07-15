import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringToBeSearched = scanner.nextLine();
        PatternToBefoundInAString objectForPatternToBefoundInAString = new PatternToBefoundInAString();
        objectForPatternToBefoundInAString.patternToBefoundInAString(stringToBeSearched);
    }
}
