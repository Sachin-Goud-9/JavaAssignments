public class FindRangeOfGivenDate {
    public void findRangeOfGivenDate(LocalDate startDate,LocalDate endDate,LocalDate currentDate) {
        int s,t;
        startDateInterval = startDate.compareTo(currentDate);
        endDateInterval = endDate.compareTo(currentDate);
        if(startDateInterval<0 && endDateInterval>0){
            System.out.println(startDate+" "+currentDate);
        }

        else if(startDateInterval<0 && endDateInterval<0){
            System.out.println(startDate+" "+endDate);


        }
        else{
            System.out.println("NO RANGE");


        }

    }
}
