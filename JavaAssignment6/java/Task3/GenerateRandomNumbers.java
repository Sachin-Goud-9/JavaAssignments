package Task3;

public class GenerateRandomNumbers {
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public String generateRandomAlphaNumericNumbers(int counter){
        StringBuilder stringFormed = new StringBuilder();
        while (counter-- != 0) {
            int characterOfAlphaNumericString = (int)(Math.random()*ALPHA_NUMERIC_STRING.length())%36;
            stringFormed.append(ALPHA_NUMERIC_STRING.charAt(characterOfAlphaNumericString));
        }
        return stringFormed.toString();
    }
}
