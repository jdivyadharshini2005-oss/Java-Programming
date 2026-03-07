package loop;
import java.util.*;
public class main5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        double avg=0;
        double peak = 0;
        double max=0;
        double count=0;
        for(int i=1;i<=n;i++){
            int day = sc.nextInt();
            double room_occupied = sc.nextInt();
            double  total_rooms = sc.nextInt();
            double occupied = (room_occupied/total_rooms)*100;
            String occupancy="";
            if(occupied<60){
                occupancy="Low";
            }
            else if(occupied>=60 && occupied<=79){
                occupancy="Moderate";
            }
            else if(occupied>=80 && occupied<=99){
                occupancy="High";
            }
            else if(occupied==100){
                occupancy="Full";
            }
            sum=sum+occupied;
            avg=sum/n;
            if(occupied>max){
                max=occupied;
                peak=day;
            }
            if(occupied==100){
                count++;
            }
            System.out.println("Day: "+day);
            System.out.println("Rooms Occupied: "+(int)room_occupied);
            System.out.println("Total Rooms: "+(int)total_rooms);
            System.out.println("Occupancy Rate: "+occupied+"%");
            System.out.println("Status: "+occupancy);

        }
        System.out.println("Total Days Analyzed: "+n);
        System.out.println("Average Occupancy Rate: "+avg+"%");
        System.out.println("Peak Occupancy Day:"+ "Day" + (int)peak);
        System.out.println("Days at Full Capacity: "+(int)count);
    }
    
}
