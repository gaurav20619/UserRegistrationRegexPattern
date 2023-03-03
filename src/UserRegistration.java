import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        // Method To Check First Name With Regex Start With Cap And 3 Min. Character
        System.out.println("Enter the first Name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter the last Name :");
        String lastName = scan.nextLine();
        System.out.println("Enter The Mail : ");
        String mail = scan.nextLine();
        System.out.println("Enter The Mobile Number With County Code : ");
        String mobileNumber = scan.nextLine();
        System.out.println("Enter the valid password having min 8 char: ");
        String password = scan.nextLine();
        System.out.println("Enter the password at least one upper case: ");
        String password1 = scan.nextLine();

        // To check first name with regex which starts with uppercase and has min 3 char.
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //  To Check Last Name With Regex Start With Cap And 3 Min. Character
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //  To check Valid Mail with Regex
        if (Pattern.matches("^[a-zA-Z0-9]+[@][a-zA-Z]{3,15}[.][a-zA-Z]{2,5}", mail)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        //  To check valid mobile number with Regex
        if (Pattern.matches("^[+]91{1}\\s[0-9]{10}", mobileNumber)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // To check password having minimum eight char
        if (Pattern.matches("^[A-Za-z1-8]{8}$", password)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // To check password having atleast one uppercase
        if (Pattern.matches("^[A-Z]+[a-z].{7}", password1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        scan.close();
	}
}
