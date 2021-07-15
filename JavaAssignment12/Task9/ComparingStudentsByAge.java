package Task9;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ComparingStudentsByAge {
    public String compareStudentsByTheirAge(ArrayList<StudentClass> studentClassArrayList){
        return studentClassArrayList.stream()
                .filter(person -> person.gender.equals("Male"))
                .filter(person -> person.engineeringDepartment.equalsIgnoreCase("Electronic"))
                .collect(Collectors.minBy(Comparator.comparingInt(StudentClass::getAge))).toString();
    }
}
