import java.util.*;

class longestPalindrome {
    
    public static String longestPalindrome(String A) {
        int startIndex = 0;
        int lastIndex = A.length()-1;
        String ans = "";
        int ansLength = 0;
        for(int i = startIndex;i < A.length();i++){
            while(startIndex <= lastIndex){
                if(A.charAt(startIndex) == A.charAt(lastIndex)){
                    String str = isPalindrome( A, startIndex, lastIndex);
                    if(ansLength < str.length()){
                        ansLength = str.length();
                        ans = str;
                    }
                } else {
                    lastIndex--;
                }
            }
        }
        return ans;
    }
    
    public static String isPalindrome(String A,int startIndex,int lastIndex){
        String ans = "";
        int j = lastIndex;
        boolean isPal = true;
        for(int i = startIndex;i <= lastIndex;i++,j--){
            if(A.charAt(i) != A.charAt(j)){
                isPal = false;
            }
        }
        if(isPal == false){
            return ans;
        }
        ans = A.substring(startIndex,lastIndex+1);
        return ans;
    }

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(longestPalindrome(str));
    }
}
