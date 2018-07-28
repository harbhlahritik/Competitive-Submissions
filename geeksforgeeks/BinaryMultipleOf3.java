package geeksforgeeks;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class BinaryMultipleOf3 {
    
    public static int multipleOf3(String str){
        char [] array = str.toCharArray();
        int remainder = 0;
        for(int i = 0;i < array.length;i++){
            int index = array.length - i - 1;
            // System.out.println(array[i] + "--> array[" + i + "]");
            if(array[i] == '1'){
                if(index%2==0){
                    remainder += 1;
                } else {
                    remainder += 2;
                }
            }
        }
        // System.out.println(remainder+" --> remainder");
        if(remainder%3 == 0){
            return 1;
        }
        return 0;
    }
    
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T > 0){
		    String str = s.next();
		    System.out.println(multipleOf3(str));
		    T--;
		}
	}
}
