mport java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
 
public class Main {
 
    public static BigInteger factorial(BigInteger i){
        if(i == BigInteger.ONE){
            return BigInteger.ONE;
        }
        else if(i == BigInteger.ZERO){
            return BigInteger.ONE;
        }
        BigInteger j = factorial(i.subtract(BigInteger.ONE));
        BigInteger ans = j.multiply(i);
        return ans;
    }
 
 
    public static void main (String [] args) throws IOException{
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        //DecimalFormat df = new DecimalFormat("###.#");
        while (T>0) {
            System.out.println(factorial(BigInteger.valueOf(s.nextInt())));
            T--;
        }
    }
}
