package Task3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public class GenerateListBasedOnGender {
    public void generateListBasedOnGender(ArrayList<StudentClass> studentClassArrayLst){
        studentClassArrayLst.stream()
                .filter(department -> department.engineeringDepartment.equalsIgnoreCase("Computer Science"))
                .filter(person -> person.gender.equalsIgnoreCase("male"))
                .forEach(person -> System.out.println(person.name));
    }
}
