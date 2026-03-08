package loop;
import java.util.*;
public class main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double sum=0;
        double avg=0;
        double highest=0;
        double high=0;
        double low=0;
        double lowest=0;
        int hot=0;
        int cold=0;
        for(int i=1;i<=n;i++){
            double hour = sc.nextDouble();
            double temp = sc.nextDouble();
            String status="";
            if(temp<0){
                status="Extreme";
            }
            else if(temp>32 && temp<40){
                status="Hot";
                hot++;
            }
            else if(temp>0 && temp<=10){
                status="Cold";
                cold++;
            }
            else if(temp>10 && temp<32){
                status="Normal";
            }
            sum=sum+temp;
            avg=sum/n;
            if(temp>highest){
                highest=temp;
                high=hour;
            }
            else if(temp<lowest){
                lowest=temp;
                low=hour;
            }
            System.out.println("Hour " + hour  +" :" + temp + " C");
            System.out.println("Status : " +status);
        }
        System.out.println("Total Reading : " +n);
        System.out.printf("Average Temperature :%.2f C \n" ,avg );
        System.out.println("Highest Temperature : " +highest +" C at Hour" +(int)high);
        System.out.println("Lowest Temperature : " +lowest + " C at Hour " + (int)low);
        System.out.println("Hot Hours : " +hot);
        System.out.println("Cold Hours : " +cold);
    }
    
}
