/**
 * Created by nazar on 11.10.18.
 */

import java.util.Arrays;
public class CoinChange {
    static long CountWays(int S[],int m, int n){
        long[] table = new long[n+1];
        Arrays.fill(table,0);
        table[0]=1;
        for (int i =0;i<m;i++){
            System.out.println("i:"+i);
            for(int j=S[i];j<=n;j++){
                System.out.println("S["+i+"]:"+S[i]);
                table[j]+=table[j-S[i]];
                System.out.println("Table["+j+"]:"+table[j]);

            }
        }return table[n];
    }

    public static void main(String[]args){
        int arr[] = {3,1,2,4};
        int m = arr.length;
        int n=4;
        System.out.println(CoinChange.CountWays(arr,m,n));

    }
}
