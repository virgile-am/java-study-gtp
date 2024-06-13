import java.io.Console;
import java.util.Scanner;
public class testinputs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter Your Last Name: ");
        String lastName = sc.nextLine();
        String fullName = lastName.concat(firstName);


        System.out.println(fullName);


    }
}
