package loop;
import java.util.*;
public class main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count1=0;
        int count2=0;
        double max=0;
        double avg=0;
        double sum2=0;
        for(int i=1;i<=n;i++){
            String name = sc.next();
            double correct = sc.nextDouble();
            double wrong = sc.nextDouble();
            double unattempt = sc.nextDouble();
            String status = "";
            double score = (correct*4)-(wrong*3)-(unattempt*0);
            if(score>=32){
                status="Pass";
                count1++;
            }
            else{
                status="Fail";
                count2++;
            }
            if(score>max){
                max= score;
            }
            sum2=sum2+score;
            avg=sum2/n;
            System.out.println("Student : " +name);
            System.out.println("Correct :"+(int)correct);
            System.out.println("Wrong : "+(int)wrong);
            System.out.println("Unattempted : " + (int)unattempt);
            System.out.println("Score : " + (int)score);
            System.out.println("Result : " +status);
        }
        System.out.println("Total Students : " +n);
        System.out.println("Pass Count :" +count1);
        System.out.println("Fail Count : " +count2);
        System.out.println("Class Average : " +avg);
        System.out.println("Highest Score : " +(int)max);

    }
    
}
