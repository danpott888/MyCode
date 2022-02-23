
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validation {

    public final String ID_PATTERN = "^\\d{4}$";
    public final String PHONE_PATTERN = "^\\d{10}$";
    public final String NAME_PATTERN = "^[a-zA-Z]+$";
    public final String EMAIL_PATTERN = "^[a-zA-Z][\\w]+@[a-z]+((\\.[\\w]+){1,2})$";

    Scanner sc = new Scanner(System.in);
    
    public String checkID() {
        String id = "";
        while (true) {
            id = sc.nextLine().trim();
            if (id.matches(ID_PATTERN)) {
                break;

            }
            System.out.print("Wrong format ID!!! Re-enter: ");
        }
        return id;
    }

    public String checkName() {
        String input = "";
        while (true) {
            input = sc.nextLine().trim();
            if (input.matches(NAME_PATTERN)) {
                input = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
                break;

            }
            System.out.print("Wrong format name!!! Re-enter: ");
        }
        return input;
    }

    public String checkPhone() {
        String phone = "";
        while (true) {
            phone = sc.nextLine().trim();
            if (phone.matches(PHONE_PATTERN)) {
                break;

            }
            System.out.print("Wrong format phone!!! Re-enter: ");
        }
        return phone;
    }

    public String checkEmail() {
        String email = "";
        while (true) {
            email = sc.nextLine().trim();
            if (email.matches(EMAIL_PATTERN)) {
                break;

            }
            System.out.print("Wrong format email!!! Re-enter: ");
        }
        return email;
    }

    public String checkDOB() {
        String dob = "";
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        df.setLenient(false); //set false để check tính hợp lệ (tháng 2 phải có 28 - 29 ngày ...)
        while (true) {
            try {
                dob = sc.nextLine().trim();
                Date date1 = df.parse(dob); //parse thành format
                if (date1.compareTo(date) > 0) {
                    throw new Exception();
                }
                break;
            } catch (ParseException ex) {
                System.out.print("Invalid date!!! Re-enter: ");
            } catch (Exception ex) {
                System.out.print("Invalid date!!! Re-enter: ");
            }
        }
        return dob;
    }

    public String checkSex() {
        String sex = "";
        while (true) {
            sex = sc.nextLine().trim();
            if (sex.equalsIgnoreCase("Male") || sex.equalsIgnoreCase("Female")) {
                sex = sex.substring(0, 1).toUpperCase() + sex.substring(1).toLowerCase();
                break;
            } else {
                System.out.print("Sex must be Male or Female: ");
            }
        }
        return sex;
    }

    public String checkEgency() {
        String egency = "";
        while (true) {
            egency = sc.nextLine().trim();
            if (egency.equalsIgnoreCase("High") || egency.equalsIgnoreCase("Medium") || egency.equalsIgnoreCase("Low")) {
                egency = egency.substring(0, 1).toUpperCase() + egency.substring(1).toLowerCase();
                break;
            } else {
                System.out.print("Egency must be (High, Medium, Low): ");
            }

        }
        return egency;
    }

    public double checkSalary() {
        double salary = 0;
        while (true) {
            try {
                salary = Double.parseDouble(sc.nextLine().trim());
                if (salary < 0 || salary > Double.MAX_VALUE) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid value!!! Re-enter: ");
            }
        }
        return salary;
    }

}
