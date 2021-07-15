package Task7;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectBasedOnDepartment {
    public void collectStudentsBasedOnDepartment(ArrayList<StudentClass> studentClassArraylist){
        studentClassArraylist.stream()
                .collect(groupingBy(StudentClass::getDept))
                .forEach((department, departmentValues) -> System.out.println("Count of " + department + " is " + departmentValues.size()));
    }
}
