package Task5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public class CollectStudentsBasedOnGenderAverage {
    public void collectStudentsBasedOnGenderAverage(ArrayList<StudentClass> studentClassArrayLst){
        studentClassArrayLst.stream()
                .collect(groupingBy(StudentClass::getGender, averagingInt(StudentClass::getAge)))
                .forEach((age, averageAge) -> System.out.println("average age of " + age + " is " + averageAge));
    }
}
