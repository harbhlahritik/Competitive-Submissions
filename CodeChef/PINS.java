import java.math.BigInteger;
import java.util.Scanner;
 
class PINS {
 
    static int P = 0;
    static BigInteger Q = new BigInteger("1");
    static BigInteger tens = new BigInteger("10");
 
    public static void getFraction(int N){
        P = 1;
        int exponent = N/2;
        Q = tens.pow(exponent);
        return;
    }
 
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int T = s.nextInt();
	    while(T > 0){
	        int N = s.nextInt();
            getFraction(N);
            System.out.println(P + " " + Q);
	        T--;
        }
    }
} 
