import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    // Kadane's Algorithm
    public static long sumOfMaxSubarray(int[] B){
        long max_current = B[0],max_global = B[0];
        for(int i = 1;i < B.length;i++){
            if(B[i] > B[i] + max_current){
                max_current = B[i];
            }
            else{
                max_current = B[i] + max_current;
            }
 
            if(max_current > max_global){
                max_global = max_current;
            }
        }
        return max_global;
    }
 
    public static void main (String[] args) throws IOException {
        try{
            //Your Solve
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            while(T > 0){
                int N = s.nextInt();
                int K = s.nextInt();
                int[] A = new int[N];
                for(int i = 0;i < N;i++){
                    A[i] = s.nextInt();
                }
                int[] B = new int[N*K];
                for(int i = 0,j = 0;i < N*K && j < N;i++,j++){
                    B[i] = A[j];
                    if(j == N-1){
                        j = -1;
                    }
                }
                System.out.println(sumOfMaxSubarray(B));
                T--;
            }
        }catch(Exception e){
            return;
        }
    }
}
