import java.util.*;
public class main24 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
        double order_value = sc.nextDouble();
        sc.nextLine();
        String timeslot =sc.nextLine();
        String weather = sc.nextLine();
        double base_delivery = 3.0;
        double distance_surcharge = distance;
        double time_surcharge = 0;
        if(timeslot.equalsIgnoreCase("Breakfast")){
            time_surcharge = 0;
        }
        else if(timeslot.equalsIgnoreCase("Lunch")){
            time_surcharge = 2.50;
        }
        else if(timeslot.equalsIgnoreCase("Dinner")){
            time_surcharge = 2.0;
        }
        else if(timeslot.equalsIgnoreCase("Late-Night")){
            time_surcharge = 1.50;
        }
        double weather_surcharge = 0;
        if(weather.equalsIgnoreCase("Clear")){
            weather_surcharge = 0;
        }
        else if(weather.equalsIgnoreCase("Rain")){
            weather_surcharge = 2;
        }
        else if(weather.equalsIgnoreCase("Snow")){
            weather_surcharge =3;
        }
        else if(weather.equalsIgnoreCase("Strom")){
            weather_surcharge = 5;
        }
        double discount = 0;
        if(order_value>30 && order_value<49.9){
            discount=1;
        }
        else if(order_value>50 && order_value<74.99){
            discount=3;
        }
        else if(order_value>75){
            discount=5;
        }
        double final_fee = base_delivery+distance_surcharge+time_surcharge+weather_surcharge-discount;
        double base_time = distance_surcharge*8;
        if(timeslot.equals("lunch") || timeslot.equals("dinner")){
            base_time+=10;
        }
        if(weather.equalsIgnoreCase("Rain")){
            base_time+=15;
        }
        else if(weather.equalsIgnoreCase("Snow")){
            base_time+=10;
        }
        else if(weather.equalsIgnoreCase("Storm")){
            base_time+=15;
        }
        String priority;

        if (order_value > 60) {
            priority = "Express";
        } else {
            if (timeslot.equals("Lunch") || timeslot.equals("Dinner")) {
                priority = "High";
            } else {
                priority = "Standard";
            }
        }

        System.out.println("Deliver Distance: "+ distance  +  "miles");
        System.out.println("Order Value: $ "+ order_value);
        System.out.println("Time slot :"+timeslot);
        System.out.println("Weather Condition: "+weather);
        System.out.println("Base Delivery Fee: $"+ base_delivery);
        System.out.println("Distance Surcharge : $"+distance_surcharge);
        System.out.println("Peak Time Surcharge : $"+time_surcharge);
        System.out.println("Weather Surcharge : $"+weather_surcharge);
        System.out.println("Order Value Discount :$"+discount);
        System.out.println("Final Delivery : $"+ final_fee);
        System.out.println("Estimated Delivery Time :"+base_time +"minutes");
        System.out.println("Service Priority :"+priority);

    }
}

