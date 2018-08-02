/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static boolean check101(String str,int i){
        boolean ans = false;
        boolean oneZero = false;
        for(int j = i+1;j < str.length();j++){
            if(str.charAt(j) == '0'){
                oneZero = true;
            } else if(str.charAt(j) == '1' && oneZero == true){
                return true;
            } else {
                return false;
            }
        }
        return ans;
    }
    
    public static int count101(String str){
        int ans = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == '1'){
                if(check101(str,i) == true){
                    ans += 1;
                }
            }
        }
        return ans;
    }
    
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T > 0){
		    String str = s.next();
		    System.out.println(count101(str));
		    T--;
		}
	}
}