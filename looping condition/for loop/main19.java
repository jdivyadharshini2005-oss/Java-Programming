package loop;
import java.util.*;
public class main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int active=0;
        int expire=0;
        int soon=0;
        for(int i=1;i<=n;i++){
            String productID = sc.next();
            String productName=sc.next();
            double month = sc.nextDouble();
            int war=0;
            if(productName.equalsIgnoreCase("Electronics")){
                war=12;
            }
            else if(productName.equalsIgnoreCase("Appliance")){
                war=24;
            }
            else if(productName.equalsIgnoreCase("Computer")){
                war=36;
            }
            double remain = war-month;
            String status="";
            if(remain==0 || remain<=0){
                status="Expired";
                expire++;
            }
            else if(remain>=1 && remain<=3){
                status="Expiring Soon";
                soon++;
            }
            else if(remain>=3){
                status="Active";
                active++;
            }
            System.out.println("Product ID : " +productID);
            System.out.println("Type : " +productName);
            System.out.println("Warranty Period : " +war+ " months");
            System.out.println("Months Used : " +(int)month);
            System.out.println("Remaining : " +(int)remain + " months");
            System.out.println("Status : " +status);
        }
        System.out.println("Total Products : " +n);
        System.out.println("Active Warranties : " +active);
        System.out.println("Expiring Soon : " +soon);
        System.out.println("Expired Warranties : " +expire);

    }
    
}
