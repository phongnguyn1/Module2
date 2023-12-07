import java.util.Scanner;

public class leapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year:");
        year = scanner.nextInt();
        if (year%4==0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                }
            }
            System.out.println(year + "ís a Leap year");
        }else{
            System.out.println(year +"ís not a leap year");

            }

    }
}
