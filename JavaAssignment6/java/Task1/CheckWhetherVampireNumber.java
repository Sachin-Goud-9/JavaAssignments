package Task1;

public class CheckWhetherVampireNumber {
    private static boolean isVampireNumber(long orginalNumber, long part1OfOriginalNumber, long part2OfOriginalNumber) {
        //If there are trailing zeroes in both the parts then return false.
        if (Long.toString(part1OfOriginalNumber).endsWith("0") && Long.toString(part2OfOriginalNumber).endsWith("0")) {
            return false;
        }

        NumberOfDigits numberOfDigits = new NumberOfDigits();

        int originalNumberLength = numberOfDigits.numberOfDigitsInANumber(orginalNumber);
        // If length of any part not equal to total length/2 then return false
        if (numberOfDigits.numberOfDigitsInANumber(part1OfOriginalNumber) != originalNumberLength / 2 || numberOfDigits.numberOfDigitsInANumber(part2OfOriginalNumber) != originalNumberLength / 2) {
            return false;
        }
        // Compare the bytes of Original Given Number and the bytes of the parts. If they are not equal then return false.
        // else return true.
        byte[] originalNumberBytes = Long.toString(orginalNumber).getBytes();
        byte[] bytesAfterModification = (Long.toString(part1OfOriginalNumber) + Long.toString(part2OfOriginalNumber)).getBytes();
        Arrays.sort(originalNumberBytes);
        Arrays.sort(bytesAfterModification);
        return Arrays.equals(originalNumberBytes, bytesAfterModification);
    }
}
