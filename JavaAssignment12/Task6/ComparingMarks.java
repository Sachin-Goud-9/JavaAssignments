package Task6;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ComparingMarks {
    public String compareStudentsBasedOnMarks(ArrayList<StudentClass> studentClassArrayList){
        return studentClassArrayList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(StudentClass :: getMarks))).toString();
    }
}
