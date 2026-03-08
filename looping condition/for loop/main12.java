package loop;
import java.util.*;
public class main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        double totalRevenue = 0;
        int peakCount = 0;
        for(int i = 1; i <= n; i++) {
            String vehicle = sc.next();
            double hours = sc.nextDouble();
            double rate = 0;
            double cap = 0;
            if(vehicle.equalsIgnoreCase("Car")) {
                rate = 3;
                cap = 30;
            }
            else if(vehicle.equalsIgnoreCase("Motorcycle")) {
                rate = 2;
                cap = 20;
            }
            else if(vehicle.equalsIgnoreCase("Truck")) {
                rate = 5;
                cap = 60;
            }
            else if(vehicle.equalsIgnoreCase("Bus")) {
                rate = 7;
                cap = 100;
            }
            double fee = hours * rate;
            if(fee > cap) {
                fee = cap;
            }
            if(hours > 8) {
                peakCount++;
            }
            totalRevenue += fee;
            System.out.println("Vehicle " + i + ": " + vehicle);
            System.out.println("Hours Parked: " + hours);
            System.out.println("Hourly Rate: $" + rate);
            System.out.println("Parking Fee: $" + fee);
            System.out.println();
        }
        double avg = totalRevenue / n;
        System.out.println("Total Vehicles: " + n);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Average Fee: $" + avg);
        System.out.println("Peak Hour Vehicles (>8 hours): " + peakCount);
    }
}