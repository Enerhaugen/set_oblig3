public class Main {
    public static void main(String[] args) {
    LeapYear leapYear = new LeapYear();

        System.out.println("Should be true:");
        System.out.println(leapYear.isLeapYear(1600));
        System.out.println(leapYear.isLeapYear(2000));
        System.out.println(leapYear.isLeapYear(2400));
        System.out.println(leapYear.isLeapYear(2800));

        System.out.println("\n");

        System.out.println("Should be false:");

        System.out.println(leapYear.isLeapYear(1700));
        System.out.println(leapYear.isLeapYear(1800));
        System.out.println(leapYear.isLeapYear(1900));
        System.out.println(leapYear.isLeapYear(2100));
        //testing oblig3 that the CI runs with a new commit
    }

}
