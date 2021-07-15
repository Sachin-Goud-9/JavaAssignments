package Task2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public class GenerateListBasedOnYearOfEnrollment {
    public void generateListBasedOnDepartment(ArrayList<StudentClass> studentClassArrayLst){
        studentClassArrayLst.stream()
                .filter(person -> person.yearOfEnrollment > 2018)
                .forEach(year -> System.out.println(person.name));
    }
}
