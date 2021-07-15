public class Main {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter signup date:");
        String[] signUpDateString=scanner.nextLine().split("-");
        System.out.println("Enter current date");
        String[] currentDateString=scanner.nextLine().split("-");
        ArrayList<Integer> signupDate=new ArrayList<Integer>();
        ArrayList<Integer> currentDate=new ArrayList<Integer>();
        for(String valueInSignUpDateString:signup){
            signupDate.add(Integer.parseInt(valueInSignUpDateString));
        }
        for(String valueInCurrentDateString:current){
            currentDate.add(Integer.parseInt(valueInCurrentDateString));
        }
        LocalDate localDate=LocalDate.of(currentDate.get(2), signupDate.get(1),signupDate.get(0));
        LocalDate startDateInterval=localDate.minusDays(30);
        LocalDate endDateInterval=localDate.plusDays(30);
        LocalDate dateWhileVerifying=LocalDate.of(currentDate.get(2),currentDate.get(1),currentDate.get(0));

        FindRangeOfGivenDate findRangeOfDate = new FindRangeOfGivenDate();
        findRangeOfDate.findRangeOfGivenDate(startDateInterval,startDateInterval,dateWhileVerifying);
    }
}
