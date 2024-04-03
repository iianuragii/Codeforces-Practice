import java.util.*;

public class Olympiad {
    public static void main(String[] args) {
        int i,n = 0,min = 0,c1 = 0,c2 = 0,c3 = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ob1 = new ArrayList<>();
        ArrayList<Integer> ob2 = new ArrayList<>();
        ArrayList<Integer> ob3 = new ArrayList<>();
        
        n = sc.nextInt();
        int a[] = new int[n];
        for(i = 0;i < n;i++)
            a[i] = sc.nextInt();
        
        for(i = 0;i < n;i++){
            if(a[i] == 1)
                ob1.add(i+1);
            else if(a[i] == 2)
                ob2.add(i+1);
            else
                ob3.add(i+1);
        }        
        min = Math.min(Math.min(ob1.size(),ob2.size()),ob3.size());
        System.out.println(min);
        for(i = 0;i < min;i++){
            System.out.print(ob1.get(i)+" ");
            System.out.print(ob2.get(i)+" ");
            System.out.println(ob3.get(i));
        }
    }
}