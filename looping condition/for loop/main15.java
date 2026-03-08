package loop;
import java.util.*;
public class main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc .nextInt();
        double sum=0;
        double sum1=0;
        double avg=0;
        for(int i=1;i<=n;i++){
            double distance=sc.nextDouble();
            String timeOfDay = sc.next();
            double ride = 3.0;
            double dis=1.0;
            double time=0;
            if(timeOfDay.equalsIgnoreCase("Morning")){
                time=0;
            }
            else if(timeOfDay.equalsIgnoreCase("Afternoon")){
                time=0;
            }
            else if(timeOfDay.equalsIgnoreCase("Evening")){
                time=3;
            }
            else if(timeOfDay.equalsIgnoreCase("Night")){
                time=5;
            }
            double charge=dis*distance;
            double total = ride+charge+time;
            sum=sum+charge;
            sum1=sum1+total;
            avg=sum1/n;
            System.out.println("Ride " +i);
            System.out.println("Distance : " +distance + " Km");
            System.out.println("Time : " +timeOfDay);
            System.out.println("Base Fare : $" +ride);
            System.out.println("Distance Charge : $ " +charge);
            System.out.println("Time Surcharge : $" +time);
            System.out.println("Total Fare : $" +total);
        }
        System.out.println("Total Rides : " +n);
        System.out.println("Total Distance : "+sum + " Km");
        System.out.println("Total Revenue : $" +sum1);
        System.out.println("Average Fare : $" +avg);
    }
    
}
