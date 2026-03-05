package loop;
import java.util.*;

public class main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double payroll = 0;

        for(int i = 1; i <= n; i++) {
            sc.nextLine();
            String employeeName = sc.nextLine();
            double salary = sc.nextDouble();
            int rating = sc.nextInt();

            double increment = 0;

            if(rating == 5){
               increment = 15;
            }
            else if(rating == 4){
                increment = 10;
            }
            else if(rating == 3){
                increment = 5;
            }
            else if(rating == 2){
                increment = 2;
            }
            else{
                increment = 0;
            }

            double final_salary = salary * (1 + increment / 100);
            payroll = payroll + final_salary;

            System.out.println("Employee: " + employeeName);
            System.out.println("Base Salary: $" + salary);
            System.out.println("Performance Rating: " + rating);
            System.out.println("Increment: " + (int)increment + "%");
            System.out.println("Final Salary: $" + final_salary);
        }

        double avg = payroll / n;

        System.out.println("Total Employees Processed: " + n);
        System.out.println("Total Payroll: $" + payroll);
        System.out.printf("Average Salary: $%.1f", avg);
    }
}