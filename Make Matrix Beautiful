class Solution {
    public static int findMinOperation(int N, int[][] mat) {
        // code here'
        int n =mat.length, m = mat[0].length;
        int r[] = new int[n]; int c[] = new int[n];
        int max=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                r[i] += mat[i][j];
                max = Math.max(max, r[i]);
                
                c[j] += mat[i][j];
                  max = Math.max(max, c[j]);
            }
        }
        int res=0;
        for(int i=0; i<n; i++)
        {
            // r[i] =  max - r[i];
            // res += r[i];
            //
             c[i] =  max - c[i];
            res += c[i];
        }
        return res;
    }
}
        
