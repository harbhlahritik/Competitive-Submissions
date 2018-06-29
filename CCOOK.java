import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static long function(int[][] input){
        long sum = 0;
        int N = input[0].length;
        int lastbiggest = findbiggest(input[N-1]);
        sum += lastbiggest;
        for(int i = N-2;i >= 0;i--){
            int newbiggest = findbiggest(input[i]);
            while(newbiggest >= lastbiggest){
                for(int j = 0;j < N;j++){
                    if(input[i][j] == newbiggest){
                        input[i][j] = -1;
                    }
                }
                newbiggest = findbiggest(input[i]);
                if(newbiggest == -1){
                    return -1;
                }
            }
            sum += newbiggest;
            lastbiggest = newbiggest;
        }
        return sum;
    }
 
    public static int findbiggest(int[] array){
        int biggest = array[0];
        for(int i = 1;i < array.length;i++){
            if(array[i] > biggest){
                biggest = array[i];
            }
        }
        return biggest;
    }
 
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while(T > 0){
            int N = s.nextInt();
            int[][] input = new int[N][N];
            for(int i = 0;i <  N;i++){
                for(int j = 0;j < N;j++){
                    input[i][j] = s.nextInt();
                }
            }
            System.out.println(function(input));
            T--;
        }
    }
}
