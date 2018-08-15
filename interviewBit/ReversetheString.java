public class Solution {
    public String reverseWords(String a) {
        int lastIndex = a.length();
        int startIndex = 0;
        String ans = "";
        for(int i = a.length()-1;i > 0;i--){
            if(a.charAt(i) == ' '){
                startIndex = i+1;
                ans += getWord(a,startIndex,lastIndex);
                lastIndex = startIndex-1;
            }
        }
        if(ans == ""){
            return a;
        }
        ans += getWord(a,0,lastIndex);
        return ans;
    }
    
    public static String getWord(String a,int startIndex,int lastIndex){
        String ans = "";
        if(lastIndex == a.length()){
            ans = "";
        } else {
            ans = " ";
        }
        for(int i = startIndex;i < lastIndex;i++){
            ans += a.charAt(i);
        }
        return ans;
    }
}
