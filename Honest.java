import java.util.*;
public class Honest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,n = 0,min = 0,i;
        t = sc.nextInt();
        
        while(t-- > 0){
            min = Integer.MAX_VALUE;
            n = sc.nextInt();
            int s[] = new int[n];
            for(i = 0;i < n;i++)
                s[i] = sc.nextInt();
            Arrays.sort(s);
            for(i = 1;i < n;i++){
                min = Math.min(min,s[i] - s[i-1]);
            }
            System.out.println(min);
        }
    }
}