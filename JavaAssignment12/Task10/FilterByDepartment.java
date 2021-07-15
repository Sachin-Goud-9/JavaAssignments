package Task10;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class FilterByDepartment {
    public void filterStudentsByDepartment(ArrayList<StudentClass> studentClassArrayList){
        studentClassArrayList.stream()
                .filter(person -> person.engineeringDepartment.equalsIgnoreCase("computer science"))
                .collect(Collectors.groupingBy(StudentClass::getGender))
                .forEach((people, peopleValues) -> System.out.println("No of " + people + " in Computer Science is " + peopleValues.size()));
    }
}
