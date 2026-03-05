package loop;
import java.util.*;
public class main2 {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int passcount=0;
        int failcount=0;
        int sum=0;
        int highest=0;
        for(int i=1;i<=n;i++){
            String studentName = sc.next();
            int score = sc.nextInt();
            String grade=" ";
            if(score>85 && score<100){
                grade="A";
            }
            else if(score>70 && score<84){
                grade="B";
            }
            else if(score>60 && score<69){
                grade="C";
            }
            else if(score>50 && score<59){
                grade="D";
            }
            else if(score<49){
                grade="F";
            }
            String status=" ";
            if(score>=60){
                status="Pass";
                passcount++;
            }
            else if(score<60){
                status="Fail";
                failcount++;
            }
            sum = sum+score;
            if(score>highest){
                highest=score;
            }
            System.out.println("Student :"+studentName);
            System.out.println("Score: "+score);
            System.out.println("Letter Grade: "+grade);
            System.out.println("Status: "+status);

        }
        int avg=sum/n;
        System.out.println("Total Students: "+n);
        System.out.println("Class Average :"+avg);
        System.out.println("Highest Score :"+highest);
        System.out.println("Students Passed: "+passcount);
        System.out.println("Students Failed: "+failcount);

        
    }
    
}
