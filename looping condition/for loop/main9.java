package loop;
import java.util.*;
public class main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum=0;
        double sum1=0;
        double avg = 0;
        String fit="";
        for(int i=1;i<=n;i++){
            String excercise = sc.next();
            double duration = sc.nextDouble();
            double calorie = 0;
            String status="";
            if(excercise.equalsIgnoreCase("Running")){
                calorie=10;
                status = "High";
            }
            else if(excercise.equalsIgnoreCase("Swimming")){
                calorie=12;
                status="High";
            }
            else if(excercise.equalsIgnoreCase("Cycling")){
                calorie=8;
                status="Moderate";
            }
            else if(excercise.equalsIgnoreCase("Gym")){
                calorie=7;
                status="Moderate";
            }
            else if(excercise.equalsIgnoreCase("Walking")){
                calorie=4;
                status = "Low";
            }
            double calorie_burned = calorie*duration;
            sum=sum+duration;
            sum1=sum1+calorie_burned;
            avg=sum1/n;
            if(sum1<300){
                fit="Beginner";
            }
            else if(sum1>=300 && sum1<=1000){
                fit="Intermediate";
            }
            else if(sum1>=1000){
                fit="Advanced";
            }
            System.out.println("Session "  + i +" : "+ excercise);
            System.out.println("Duration : " +  (int)duration  +  " minutes");
            System.out.println("Calories Burned : " + (int)calorie_burned);
            System.out.println("Intensity : " + status);
        }
        System.out.println("Total workout : " + n);
        System.out.println("Total Duratiom : " +(int)sum + " minutes");
        System.out.println("Calories Burned : " + (int)sum1);
        System.out.println("Average Calories per Session : " + avg);
        System.out.println("Fitness Level : " + fit);
    }
    
}
