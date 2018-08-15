public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        if(A.length() == 0){
            return 0;
        }
        int count = 0;
        boolean lastSpace = true;
        int index = A.length()-1;
        for(int i = A.length()-1;i >= 0;i--){
            if(A.charAt(i) == ' ' && lastSpace == true && i!=0){
                index--;
            } else if(A.charAt(i) == ' ' && lastSpace == false) {
                return index-i;
            } else if(i == 0 && lastSpace == false){
                return index+1;
            } else if(i == 0 && lastSpace == true && A.charAt(0) == ' '){
                // System.out.println("executed");
                return 0; 
            } else {
                lastSpace = false;
            }
        }
        // System.out.println("value of lastSpace : "+lastSpace);
        // System.out.println("value of i ==> "+index);
        // System.out.println("A.charAt(0) ==> "+A.charAt(0));
        return A.length();
    }
}
