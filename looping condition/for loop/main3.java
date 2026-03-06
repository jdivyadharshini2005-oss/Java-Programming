package loop;
import java.util.*;
public class main3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int criticalcount=0;
        for(int i=1;i<=n;i++){
            String productName = sc.next();
            int current_stock = sc.nextInt();
            int minimum_stock = sc.nextInt();
            String stock=" ";
            if(current_stock>=minimum_stock){
                stock="Adequate";
            }
            else if(current_stock<minimum_stock && current_stock>=minimum_stock/2){
                stock="Low Stock";
            }
            else if(current_stock<minimum_stock/2){
                stock="Critical";
            }
            double quantity = 0;
            if(stock=="Adequate"){
                quantity=0;
            }
            else if(stock=="Low Stock"){
                quantity=(minimum_stock-current_stock)+ minimum_stock/2;
                count++;
            }
            else if(stock=="Critical"){
                quantity=(minimum_stock-current_stock)+ minimum_stock*1.5;
                criticalcount++;
            }
            System.out.println("Product Name: "+productName);
            System.out.println("Current Stock: "+current_stock);
            System.out.println("Minimum Stock: "+minimum_stock);
            System.out.println("Status: "+stock);
            System.out.println("Recorded  quantity: "+(int)quantity);
        }
        System.out.println("Total Product: "+n);
        System.out.println("Low Stock Items: "+count);
        System.out.println("Critical Items :"+criticalcount);
        // System.out.println("Total Recorder Quantity: "+);

    }
    
}
