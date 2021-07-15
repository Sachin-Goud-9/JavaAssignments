package Task4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public class CollectStudentsBasedOnGender {
    public void collectStudentsBasedOnGender(ArrayList<StudentClass> studentClassArrayLst){
        studentClassArrayLst.stream()
                .collect(groupingBy(StudentClass::getGender))
                .forEach((gender, genderValues) -> System.out.println("Count of " + gender + " is " + genderValues.size()));
    }
}
