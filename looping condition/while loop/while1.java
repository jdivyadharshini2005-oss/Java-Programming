import java.util.*;
public class while1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correct = "mypass";
        int attempts = 3;
        while (attempts > 0) {
            System.out.println("Enter password:");
            String pass = sc.nextLine();
            if (pass.equals(correct)) {
                System.out.println("Access granted!");
                break;
            } else {
                attempts--;
                if (attempts == 0) {
                    System.out.println("Account locked!");
                } else {
                    System.out.println("Incorrect! Attempts remaining: " + attempts);
                }
            }
        }
    }
}
