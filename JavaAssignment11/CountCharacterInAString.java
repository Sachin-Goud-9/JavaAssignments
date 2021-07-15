public class CountCharacterInAString {
    public void countCharacterInAnInputString(HashMap<Character, Integer> characterCountMap, String inputString){
        for(char characterOfInputString : inputString.toCharArray())
        {
            characterCountMap.put(characterOfInputString,characterCountMap.getOrDefault(characterOfInputString,0)+1);
        }
    }
}
