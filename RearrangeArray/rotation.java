
import java.io.*;

class umair
{
    static int maxHamming(int arr[], int n){
        int hmmd = 0;
        for(int j = 1; j < n; j++){
            hmmd = 0;
            for(int i = 0 ; i < n; i++){
                if(arr[i] != arr[(i + j) % n])
                    hmmd++;
            }
            if(hmmd == n)
                return n;
        }
        return hmmd;
    }

    public static void main(String args[])
    {
        int arr[] = {2, 4, 6, 8};
        int n = arr.length;
        System.out.println(maxHamming(arr, n));
    }
}


