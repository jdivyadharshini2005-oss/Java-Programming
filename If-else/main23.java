import java.util.*;
public class main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stock_per = sc.nextInt();
        int invest_year = sc.nextInt();
        sc.nextLine();
        String riskTolerance = sc.nextLine();
        String market = sc.nextLine();
        double score = stock_per;   
        if (invest_year >= 1 && invest_year <= 5) {
            if (stock_per > 50) {
                score += 20;
            }
        } 
        else if (invest_year >= 6 && invest_year <= 10) {
            if (stock_per > 60) {
                score += 10;
            }
        } 
        else if (invest_year >= 11 && invest_year <= 20) {
            if (stock_per > 80) {
                score += 5;
            }
        }
        if (market.equalsIgnoreCase("Medium")) {
            score += 10;
        } 
        else if (market.equalsIgnoreCase("High")) {
            score += 20;
        }
        String category;
        if (score <= 30) {
            category = "Low";
        } 
        else if (score <= 60) {
            category = "Moderate";
        } 
        else if (score <= 80) {
            category = "High";
        } 
        else {
            category = "Very High";
        }

        String alignment="";
        if (riskTolerance.equalsIgnoreCase("Conservative")) {
            if (category.equals("Low")) {
                alignment = "Well Aligned";
            } 
            else if (category.equals("Moderate")) {
                alignment = "Acceptable";
            } 
            else {
                alignment = "Misaligned";
            }
        } 
        else if (riskTolerance.equalsIgnoreCase("Moderate")) {
            if (category.equals("Moderate")) {
                alignment = "Well Aligned";
            } 
            else if (category.equals("Low") || category.equals("High")) {
                alignment = "Acceptable";
            } 
            else {
                alignment = "Misaligned";
            }
        } 
        else if (riskTolerance.equalsIgnoreCase("Aggressive")) {
            if (category.equals("High") || category.equals("Very High")) {
                alignment = "Well Aligned";
            } 
            else if (category.equals("Moderate")) {
                alignment = "Acceptable";
            } 
            else {
                alignment = "Misaligned";
            }
        }
        String recommendation;
        String suggestion;

        if (alignment.equals("Well Aligned")) {
            recommendation = "Portfolio strategy matches risk tolerance.";
            suggestion = "Continue current allocation.";
        } 
        else if (alignment.equals("Acceptable")) {
            recommendation = "Risk level acceptable.";
            suggestion = "Monitor closely, consider slight adjustments.";
        } 
        else {
            recommendation = "Risk level does not match tolerance.";
            suggestion = "Rebalance portfolio to reduce risk.";
        }

        System.out.println("Stock Allocation: " + stock_per + "%");
        System.out.println("Bond Allocation: " + score + "%");
        System.out.println("Investment Horizon: " + invest_year + " years");
        System.out.println("Risk Tolerance: " + riskTolerance);
        System.out.println("Market Volatility: " + market);
        System.out.println("Portfolio Risk Score: " + (int)score + "/100");
        System.out.println("Risk Category: " + category);
        System.out.println("Alignment Status: " + alignment);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("Suggested Rebalancing: " + suggestion);
    }
}