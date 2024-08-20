import java.util.*;
class Bits {
    public static List<List<Integer>> subset(int arr[]) {
        int n = arr.length, i , j;
        int subsets = 1 << n;
        List<List<Integer>> ans = new ArrayList<>();
        
        for(i = 0; i < subsets; i++) {
            ArrayList<Integer> ob = new ArrayList<>();
            for(j = 0; j < n; j++) {
                if((i & (1 << j)) != 0)
                    ob.add(arr[j]);
            }
            ans.add(ob);
        }
        ans.remove(0);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(subset(arr));
    }
}
