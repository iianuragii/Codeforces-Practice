class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int size = original.length, i, j;
        
        if(m * n != size) {
            return new int[0][0];
        }
        int ans[][] = new int[m][n];
        int r = 0, c = 0;
        for(i = 0; i < size; i++) {
            ans[r][c] = original[i];
            c++;
            if(c == n) {
                c = 0;
                r++;
            }
        }
        return ans;
    }
}
