package Task8;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectBasedOnMarks {
    public void collectStudentsBasedOnMarks(ArrayList<StudentClass> studentClassArrayList){
        studentClassArrayList.stream()
                .collect(groupingBy(StudentClass::getDept, averagingDouble(StudentClass::getMarks)))
                .forEach(marks, averageMarks) -> System.out.println("average percentage of " + marks + " is " + averageMarks));
    }
}
