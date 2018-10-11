/**
 * Created by nazar on 11.10.18.
 */
public class CountPathOrigin {

    static  int countPaths(int n, int m){
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;

        }
        for(int i=0;i<=m;i++){
            dp[0][i]=1;
        }
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        for(int i=n;i>=0;i--){
            for(int j=0;j<=m;j++){
                System.out.print(dp[i][j]+" ");

            }
            System.out.println();
        }
        return dp[n][m];

    }
    public static void main (String[] args) {
        int n = 4, m = 3;
        System.out.println(" Number of Paths "
                + countPaths(n, m));

    }
}
