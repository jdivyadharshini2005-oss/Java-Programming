package loop;
import java.util.*;
public class main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double count=0;
        double sum=0;
        double avg=0;
        for(int i=1;i<=n;i++){
            String member = sc.next();
            String memberType = sc.next();
            double days = sc.nextDouble();
            double fee=0;
            if(memberType.equalsIgnoreCase("Basic")){
                fee=50;
            }
            else if(memberType.equalsIgnoreCase("Premium")){
                fee=100;
            }
            else if(memberType.equalsIgnoreCase("VIP")){
                fee=200;
            }
            double discount=0;
            if(days>45){
                discount=20;
            }
            else if(days>30 && days<44){
                discount=15;
            }
            else if(days>15 && days<29){
                discount=10;
            }
            else if(days<15){
                discount=0;
            }
            double final_fee = fee*(1-discount/100);
            String priority="";
            if(days<10){
                priority="Urgent";
                count++;
            }
            else if(days>10 && days<300){
                priority="High";
            }
            else if(days>30){
                priority="Normal";
            }
            sum=sum+final_fee;
            avg=sum/n;
            System.out.println("Member : " +member);
            System.out.println("Membership : " +memberType);
            System.out.println("Days Until Expiry : " + (int)days);
            System.out.println("Renewal fee : $" +fee);
            System.out.println("Discount : " +(int)discount + " %");
            System.out.println("Final Fee : $" + final_fee);
            System.out.println("Priority : " +priority);
        }
        System.out.println("Total Member : " +n);
        System.out.println("Urgent Renewals : " +(int)count);
        System.out.println("Total Renewals Revenue : $" +sum);
        System.out.println("Average Renewal Fee : $" +avg);
    }
    
}
