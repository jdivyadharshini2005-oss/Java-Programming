import java.util.*;
public class while23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int count=0;
        int i=0;
        do{
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
            i++;
        }while(i<s.length());
        System.out.println(count);
    
    }
}