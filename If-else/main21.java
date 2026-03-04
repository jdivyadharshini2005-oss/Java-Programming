import java.util.Scanner;
public class main21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zone = sc.nextLine();
        double hours = sc.nextDouble();
        sc.nextLine();
        String vehicle = sc.nextLine();
        String membership = sc.nextLine();
        double baseRate = 5.0;
        double premium = 0;
        double vehicleCharge = 0;
        double discount = 0;
        double dailyCap = 0;
        String category;
        boolean capApplied = false;
        if(zone.equals("Downtown")){
            premium = 50;
            dailyCap = 150;
            category = "Premium";
        }
        else if(zone.equals("Business-District")){
            premium = 30;
            dailyCap = 120;
            category = "Premium";
        }
        else if(zone.equals("Residential")){
            premium = 0;
            dailyCap = 60;
            category = "Standard";
        }
        else{
            premium = 100;
            dailyCap = 180;
            category = "Luxury";
        }
        if(vehicle.equals("Motorcycle")){
            vehicleCharge = -2;
        }
        else if(vehicle.equals("SUV")){
            vehicleCharge = 3;
        }
        else if(vehicle.equals("Oversized")){
            vehicleCharge = 5;
        }
        else{
            vehicleCharge = 0;
        }
        if(membership.equals("Monthly")){
            discount = 20;
        }
        else if(membership.equals("Annual")){
            discount = 25;
        }
        else if(membership.equals("VIP")){
            discount = 30;
        }
        else{
            discount = 0;
        }
        double ratePerHour = baseRate + (baseRate * premium / 100) + vehicleCharge;
        double total = ratePerHour * hours;
        total = total - (total * discount / 100);
        if(hours >= 24 && total > dailyCap){
            total = dailyCap;
            capApplied = true;
        }
        System.out.println("Location Zone: " + zone);
        System.out.println("Parking Duration: " + hours + " hours");
        System.out.println("Vehicle Type: " + vehicle);
        System.out.println("Membership Status: " + membership);
        System.out.println("Base Hourly Rate: $" + baseRate);
        System.out.println("Zone Premium: " + premium + "%");
        System.out.println("Vehicle Size Surcharge: $" + vehicleCharge);
        System.out.println("Membership Discount: " + discount + "%");
        System.out.println("Total Parking Fee: $" + total);
        System.out.println("Daily Cap Applied: " + (capApplied ? "Yes" : "No"));
        System.out.println("Rate Category: " + category);
    }
}