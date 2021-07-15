package Task1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public class GenerateListBasedOnDepartment {
    public void generateListBasedOnDepartment(ArrayList<StudentClass> studentClassArrayLst){
        studentClassArrayLst.stream()
                .map(department -> department.engineeringDepartment).distinct()
                .forEach(System.out::println);
    }
}
