package geeksforgeeks;

public class Atoi {
	// converts string to int.
	int atoi(String str)
    {
        int answer = 0;
        boolean isNegative = false;
        int i = 0;
        if(str.charAt(0) == '-'){
            isNegative = true;
            i = 1;
        }
	    for(;i < str.length();i++){
	        if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
	            answer = answer*10 + (int) (str.charAt(i)-'0');
	        } else {
	            return -1;
	        }
	    }
	    if(isNegative == true){
	        return -1*answer;
	    }
	    return answer;
    }
}
