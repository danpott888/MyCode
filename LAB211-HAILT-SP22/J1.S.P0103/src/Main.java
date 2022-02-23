
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static Date inputDate(String string, String format) {
        System.out.print(string);
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat(format);
        df.setLenient(false); 
        while (true) {
            try {
                date = df.parse(sc.nextLine().trim());
                break;

            } catch (ParseException e) {
                System.out.println("Invalid date!!!");
            }
        }
        return date;
    }

    public static void main(String[] args) {
        Date date1 = inputDate("Please enter the first date: ", "MMM/dd/yyyy");
        Date date2 = inputDate("Please enter the second date: ", "dd/MM/yyyy");
        if (date1.compareTo(date2) > 0) {
            System.out.println("Date1 is after Date2");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date1 is before Date2");
        } else {
            System.out.println("Date1 is Date2");
        }

    }

}
