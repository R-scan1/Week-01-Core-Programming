import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter a date(yyyy-MM-dd): ");
        String inputDate = input.nextLine();

        LocalDate date = LocalDate.parse(inputDate, formatter);
        System.out.println("Input Date: " + date);

        LocalDate after7Days = date.plusDays(7);
        System.out.println("After adding 7 days: " + after7Days);

        LocalDate after1Month = after7Days.plusMonths(1);
        System.out.println("After adding 1 month: " + after1Month);

        LocalDate after2Years = after1Month.plusYears(2);
        System.out.println("After adding 2 years: " + after2Years);

        LocalDate finalDate = after2Years.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate);

        input.close();
    }
}
