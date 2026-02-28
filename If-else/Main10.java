import java.util.*;
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String timeOfDay = sc.nextLine();
        double power = sc.nextDouble();
        double renewablePercentage = sc.nextDouble();
        sc.nextLine();
        String rateTier = sc.nextLine();
        double baseRate = 0;
        double multiplier = 0;
        if (rateTier.equalsIgnoreCase("Basic")){
            baseRate = 0.18;
        }
        else if (rateTier.equalsIgnoreCase("Time-of-Use")){
            baseRate = 0.15;
        }
        else if (rateTier.equalsIgnoreCase("Premium-Green")){
            baseRate = 0.12;
        }
        if (timeOfDay.equalsIgnoreCase("Peak")){
            multiplier = 1.5;
        }
        else if (timeOfDay.equalsIgnoreCase("Off-Peak")){
            multiplier = 0.8;
        }
        else if (timeOfDay.equalsIgnoreCase("Super-Off-Peak")){
            multiplier = 0.5;
        }
        double renewableCredit = (power * renewablePercentage / 100) * baseRate;
        double cost = (power * baseRate * multiplier) - renewableCredit;
        sc.nextLine();
        String recommendation = sc.nextLine();
        if (renewablePercentage >= 50) {
            recommendation = "Excellent! Continue";
        }
        else if (timeOfDay.equalsIgnoreCase("Peak")) {
            recommendation = "Shift to Off-Peak";
        }
        else if (timeOfDay.equalsIgnoreCase("Off-Peak")) {
            recommendation = "Good timing! Consider increasing renewable capacity";
        }
        System.out.println("Time of Day: " + timeOfDay);
        System.out.println("Power Consumption: " + power + " kWh");
        System.out.println("Renewable Energy: " + renewablePercentage + "%");
        System.out.println("Rate Tier: " + rateTier);
        System.out.printf("Base Rate: $%.2f/kWh%n", baseRate);
        System.out.printf("Rate Multiplier: %.1fx%n", multiplier);
        System.out.printf("Renewable Credit: $%.1f%n", renewableCredit);
        System.out.printf("Total Cost: $%.1f%n", cost);
        System.out.println("Optimization Recommendation: " + recommendation);

    }
}