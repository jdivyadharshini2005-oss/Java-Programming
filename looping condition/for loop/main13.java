package loop;
import java.util.*;
public class main13 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       double eligible =0;
       double not_eligible=0;
       double rate = 0;
       for(int i=1;i<=n;i++){
        String donorName = sc.next();
        int age = sc.nextInt();
        double weight = sc.nextDouble();
        double hemoglobin = sc.nextDouble();
        String status = " ";
        if(age>18 && age<65 && weight>=50 && hemoglobin>=12.5){
            status="Eligible";
            eligible++;
        }
        else{
            status="Not eligible";
            not_eligible++;
        }
        rate=(eligible/n)*100;
        System.out.println("Donor : " +donorName);
        System.out.println("Age : " +age +" years");
        System.out.println("Weight : "  +weight + " kg");
        System.out.println("Hemoglobin : " +hemoglobin +" g/dL");
        System.out.println("Status : " +status);
    }
    
    System.out.println("Total Donors : " +n);
    System.out.println("Eligible : " +(int)eligible);
    System.out.println("Rejected Donors : " +(int)not_eligible);
    System.out.println("Eligibility Rate : " +rate +" %");
    }
    
}
