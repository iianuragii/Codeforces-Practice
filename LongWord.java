import java.util.*;
public class LongWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        String s = "";
        while(n--> 0){
            s = sc.next();
            if(s.length() <= 10)
                System.out.println(s);
            else{
                System.out.println(s.charAt(0) + Integer.toString(s.length()-2)+s.charAt(s.length()-1));
            }
        }
    }
}