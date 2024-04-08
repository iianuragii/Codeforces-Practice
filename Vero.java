import java.util.*;
public class Vero{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = 0,s = 0,a = 0,b = 0,n = 0;
        t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            if(a*2 < b)
                s = n * a;
            else{
                s = (n/2) * b + (n % 2) * a;
            }
            System.out.println(s);
        }
    }
}