import java.util.*;
public class main22 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int units = scan.nextInt();
        scan.nextLine();
        String customerType = scan.nextLine();
        String season = scan.nextLine();
        String payment = scan.nextLine();
        double tier1 = 0;
        double tier2=0;
        double tier3 = 0;
        double tier4=0;
        if(customerType.equalsIgnoreCase("Residential")){
            if(units>=0 && units<=100){
                tier1 =units *0.10;
            }
            else if(units>101 &&  units<=300){
                tier2=0.15;
            }
            else if(units>301 && units<=500){
                tier3=0.25;
            }
            else if(units>=500){
                tier4=0.30;
            }
        }
        else if(customerType.equalsIgnoreCase("Commerical")){
            if(units>=0 && units<=100){
                tier1 =0.12;
            }
            else if(units>101 &&  units<=300){
                tier2=0.18;
            }
            else if(units>301 && units<=500){
                tier3=0.25;
            }
            else if(units>=500){
                tier4=0.25;
            }
        }
        else if(customerType.equalsIgnoreCase("Industrial")){
            if(units>=0 && units<=100){
                tier1 =0.08;
            }
            else if(units>101 &&  units<=300){
                tier2=0.12;
            }
            else if(units>301 && units<=500){
                tier3=0.20;
            }
            else if(units>=500){
                tier4=0.20;
            }
        }
        int seasonal_adjustment = 0;
        if(season.equalsIgnoreCase("Summer")){
            seasonal_adjustment +=15;
        }
        else if(season.equalsIgnoreCase("Winter")){
            seasonal_adjustment -=10;
        }
        else if(season.equalsIgnoreCase("Regular")){
            seasonal_adjustment =0;
        }
        int payment_discount = 0;
        if(payment.equalsIgnoreCase("Auto-pay")){
            payment_discount=5;
        }
        else if(payment.equalsIgnoreCase("Online")){
            payment_discount=3;
        }
        else if(payment.equalsIgnoreCase("Manual")){
            payment_discount=0;
        }
        double tiercost=tier1+tier2+tier3+tier4;
        double unitsconsumed = tiercost+seasonal_adjustment;

        double avg = tiercost/unitsconsumed;
        System.out.println("Units consumed :" +units +"kWh");
        System.out.println("Customer Type :" +customerType);
        System.out.println("Season :" +season);
        System.out.println("Payment Method :" +payment);
        System.out.println("Tier 1 Cost (0-100) : $ "+tier1);
        System.out.println("Tier 2 Cost(101-300): $ " +tier2);
        System.out.println("Tier 3 Cost(301-500): $ " +tier3);
        System.out.println("Tier 4 Cost(501+): $ "+tier4);
        System.out.println("Seasonal Adjustment : " +seasonal_adjustment +"%");
        System.out.println("Payment Discount: " +payment_discount +"%");
        System.out.println("Total bill :$" +unitsconsumed);
        System.out.println("Average Rate : $"+avg);
        

    }
    
}
