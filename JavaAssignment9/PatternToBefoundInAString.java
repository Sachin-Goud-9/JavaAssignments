import java.util.Scanner;

public class PatternToBefoundInAString {
    public void patternToBefoundInAString(String stringToBeSearched){
        String regularExpressionToBeSearched = "[A-Z][A-Za-z0-9_!@#\\$%\\^\\&*\\)\\(+=.\\s+]*[.]$";
        Pattern pattern = Pattern.compile(regularExpressionToBeSearched);
        Matcher matcher = pattern.matcher(stringToBeSearched);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
