import Task1.GenerateListBasedOnDepartment;
import Task10.FilterByDepartment;
import Task2.GenerateListBasedOnYearOfEnrollment;
import Task3.GenerateListBasedOnGender;
import Task4.CollectStudentsBasedOnGender;
import Task5.CollectStudentsBasedOnGenderAverage;
import Task6.ComparingMarks;
import Task7.CollectBasedOnDepartment;
import Task8.CollectBasedOnMarks;
import Task9.ComparingStudentsByAge;

public class Main {
    public static void main(String[] args) {
        ArrayList<StudentClass> studentArrayList = new ArrayList<>();
        studentArrayList.add(new StudentClass(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentArrayList.add(new StudentClass(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentArrayList.add(new StudentClass(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentArrayList.add(new StudentClass(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentArrayList.add(new StudentClass(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentArrayList.add(new StudentClass(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentArrayList.add(new StudentClass(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentArrayList.add(new StudentClass(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentArrayList.add(new StudentClass(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentArrayList.add(new StudentClass(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentArrayList.add(new StudentClass(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentArrayList.add(new StudentClass(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentArrayList.add(new StudentClass(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentArrayList.add(new StudentClass(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentArrayList.add(new StudentClass(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentArrayList.add(new StudentClass(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentArrayList.add(new StudentClass(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        System.out.println();

        //Task1
        GenerateListBasedOnDepartment generateBasedOnDepartment = new GenerateListBasedOnDepartment();
        generateBasedOnDepartment.generateListBasedOnDepartment(studentArrayList);
        System.out.println();

        //Task2
        GenerateListBasedOnYearOfEnrollment generateBasedOnYearOfEnrollment = new GenerateListBasedOnYearOfEnrollment();
        generateBasedOnYearOfEnrollment.generateListBasedOnDepartment(studentArrayList);
        System.out.println();

        //Task 3
        GenerateListBasedOnGender generateBasedOnGender = new GenerateListBasedOnGender();
        generateBasedOnGender.generateListBasedOnGender(studentArrayList);
        System.out.println();

        //Task 4
        CollectStudentsBasedOnGender collectStudentsListBasedOnGender = new CollectStudentsBasedOnGender();
        collectStudentsListBasedOnGender.collectStudentsBasedOnGender(studentArrayList);
        System.out.println();

        //Task 5
        CollectStudentsBasedOnGenderAverage collectStudentsListBasedOnGenderAverage = new CollectStudentsBasedOnGenderAverage();
        collectStudentsListBasedOnGenderAverage.collectStudentsBasedOnGenderAverage(studentArrayList);
        System.out.println();

        //Task 6
        ComparingMarks comparingMarks = new ComparingMarks();
        comparingMarks.compareStudentsBasedOnMarks(studentArrayList);
        System.out.println();

        //Task 7
        CollectBasedOnDepartment collectBasedOnDepartment = new CollectBasedOnDepartment();
        collectBasedOnDepartment.collectStudentsBasedOnDepartment(studentArrayList);
        System.out.println();

        //Task 8
        CollectBasedOnMarks collectBasedOnMarks = new CollectBasedOnMarks();
        collectBasedOnMarks.collectStudentsBasedOnMarks(studentArrayList);
        System.out.println();

        //Task 9
        ComparingStudentsByAge comparingStudentsByAge = new ComparingStudentsByAge();
        comparingStudentsByAge.compareStudentsByTheirAge(studentArrayList);
        System.out.println();

        //Task 10
        FilterByDepartment filterByDepartment = new FilterByDepartment();
        filterByDepartment.filterStudentsByDepartment(studentArrayList);
        System.out.println();
    }
}
