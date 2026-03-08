package loop;
import java.util.*;
public class main14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double count=0;
        double total=0;
        double avg=0;
        for(int i=1;i<=n;i++){
            String bookType = sc.next();
            int Late_days = sc.nextInt();
            double fine=0;
            double cap=0;
            if(bookType.equalsIgnoreCase("Regular")){
                fine=0.50;
                cap=10;
            }
            else if(bookType.equalsIgnoreCase("Reference")){
                fine=1.00;
                cap=20;
            }
            else if(bookType.equalsIgnoreCase("Magazine")){
                fine=0.25;
                cap=5;
            }
            double fine_fee = Late_days*fine;
            if(fine_fee<cap){
                cap=fine_fee;
            }
            if(Late_days>0){
                count++;
            }
            total=total+fine_fee;
            avg=total/n;
            System.out.println("Book " + i + " :" +bookType);
            System.out.println("Days Late : " +Late_days);
            System.out.println("Daily Fine : $" +fine);
            System.out.println("Calculated Fine : $" + fine_fee);
            System.out.println("Actual Fine : $" +cap);
            System.out.println("Cap Applied : "+ (Late_days>0 ? "Yes" : "No"));
        }
        System.out.println("Total Books : " +n);
        System.out.println("Total Fines Collected : $" +total);
        System.out.println("Books Overdue : " +(int)count);
        System.out.println("Average Fine: $" +avg);
    }
    
}
