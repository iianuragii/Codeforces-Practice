import java.util.*;
public class Mail {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n = 0;
        n = sc.nextInt();
        int arr[] = new int[n];
        ArrayList<Integer> min = new ArrayList<>();
        ArrayList<Integer> max = new ArrayList<>();
        for(i = 0;i < n;i++)
            arr[i] = sc.nextInt();
            
        for(i = 0;i < n;i++){
            if(i == 0){
                min.add(arr[i+1] - arr[i]);
                max.add(arr[n-1] - arr[i]);
            }
            else if(i == n-1){
                min.add(arr[i] - arr[i-1]);
                max.add(arr[i] - arr[0]);
            }
            else{
                min.add(Math.abs(Math.min(arr[i] - arr[i-1],arr[i+1] - arr[i])));
                max.add(Math.max(Math.abs(arr[i] - arr[0]),Math.abs(arr[n-1] - arr[i])));
            }
        }
        for(i = 0;i < n;i++){
            System.out.print(min.get(i)+ " ");
            System.out.println(max.get(i));
        }
    }
}