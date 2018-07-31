package codenation;

import java.util.*;
import java.lang.*;
import java.io.*;

class StringWithNumber {
    
    public static int stringWithNumber(String str){
    	int lengthGiven = 0;
        int indexPointer = 0;
        if(str.length() >= 3){
            for(int i = str.length()-3;i < str.length();i++){
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                    lengthGiven = lengthGiven*10 + (int) (str.charAt(i) - '0');
                    if(indexPointer == 0){
                        indexPointer = i;
                    }
                } else {
                    continue;
                }
            }
            if(indexPointer == lengthGiven){
                return 1;
            }
        } else if(str.length() == 2 && str.charAt(1) == '1'){
            return 1;
        }
        return 0;
    }
    
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T > 0){
		    String str = s.next();
		    System.out.println(stringWithNumber(str));
		    T--;
		}
	}
}