/**
 * Created by nazar on 11.10.18.
 */
import java.lang.Math;


public class UglyNumbers {

    /* get ugly numbers */

    int getUglyNum(int n ){
        int ugly[] = new int[n];
        int i2=0;int i3=0;int i5=0;
        int nxtmult2= 2;
        int nxtmult3= 3;
        int nxtmult5=5;
        int nxtuglynum=1;
        ugly[0]=1;
        for (int i =1;i<n;i++){
            nxtuglynum=Math.min(nxtmult2,Math.min(nxtmult3,nxtmult5));
            ugly[i]= nxtuglynum;
            if(nxtuglynum==nxtmult2){
                i2=i2+1;
                nxtmult2=ugly[i2]*2;
            }
            if(nxtuglynum==nxtmult3){
                i3=i3+1;
                nxtmult3=ugly[i3]*3;
            }
            if(nxtuglynum==nxtmult5){
                i5=i5+1;
                nxtmult5=ugly[i5]*5;
            }
        }
        return nxtuglynum;
    }
    public static void main(String[] args){
        int n =150;
        UglyNumbers un= new UglyNumbers();
        System.out.println(un.getUglyNum(n));

    }

}



