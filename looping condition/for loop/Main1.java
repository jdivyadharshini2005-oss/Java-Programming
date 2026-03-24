import java.util.*;
public class Main1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double annualRevenue = sc.nextDouble();
        sc.nextLine();
        String business = sc.nextLine();
        double deductibleExpenses = sc.nextDouble();
        double taxCredits = sc.nextDouble();
        double taxableIncome = annualRevenue - deductibleExpenses;
        double taxRate = 0;
        if (business.equalsIgnoreCase("C-Corp")) {
            if (taxableIncome < 500000) {
                taxRate = 21;
            } 
            else if (taxableIncome >= 500000 && taxableIncome < 1000000) {
                taxRate = 24;
            } 
            else if (taxableIncome >= 1000000 && taxableIncome < 2000000) {
                taxRate = 28;
            } 
            else {
                taxRate = 30;
            }

        } 
        else if (business.equalsIgnoreCase("S-Corp")) {
            if (taxableIncome < 500000) {
                taxRate = 20;
            } 
            else if (taxableIncome >= 500000 && taxableIncome < 1000000) {
                taxRate = 25;
            } 
            else {
                taxRate = 28;
            }

        } 
        else if (business.equalsIgnoreCase("LLC")) {
            if (taxableIncome < 200000) {
                taxRate = 15;
            } 
            else if (taxableIncome >= 200000 && taxableIncome < 500000) {
                taxRate = 18;
            } 
            else {
                taxRate = 22;
            }

        } 
        else if (business.equalsIgnoreCase("Partnership")) {
            if (taxableIncome < 300000) {
                taxRate = 18;
            } 
            else if (taxableIncome >= 300000 && taxableIncome < 800000) {
                taxRate = 22;
            } 
            else {
                taxRate = 26;
            }

        } 
        double grossTax = taxableIncome * taxRate / 100;
        double netTax = grossTax - taxCredits;
        double effectiveRate = (netTax / annualRevenue) * 100;
        System.out.printf("Annual Revenue:$" + annualRevenue + "\n");
        System.out.printf("Business Type:"+business +"\n");
        System.out.printf("Deductible Expenses:$" +deductibleExpenses +"\n");
        System.out.printf("Tax Credits:$"+ taxCredits +"\n");
        System.out.printf("Taxable Income:$"+ taxableIncome +"\n");
        System.out.printf("Tax Rate: "+ taxRate +"\n");
        System.out.printf("Gross Tax:$"+ grossTax +"\n");
        System.out.printf("Net Tax After Credits:$"+ netTax +"\n");
        System.out.printf("Effective Tax Rate: "+ effectiveRate +"%\n");
    }
}
