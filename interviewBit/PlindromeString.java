public class Solution {
    public int isPalindrome(String A) {
        int ans = 1;
        int j = A.length()-1;
        // System.out.println((int) 'A');
        // System.out.println((int) 'a');
        // System.out.println((int) 'Z');
        // System.out.println((int) 'z');
        // System.out.println((int) '0');
        // System.out.println((int) '9');
        int diff = (int)('a' - 'A');
        // System.out.println(diff);
        for(int i = 0;i < A.length() && j >= 0;){
            if((A.charAt(i) >= 'A' && A.charAt(i) <= 'Z')
             || A.charAt(i) >= 'a' && A.charAt(i) <= 'z'
             || A.charAt(i) >= '0' && A.charAt(i) <= '9'){
                if((A.charAt(j) >= 'A' && A.charAt(j) <= 'Z')
             || A.charAt(j) >= 'a' && A.charAt(j) <= 'z'
             || A.charAt(j) >= '0' && A.charAt(j) <= '9'){
                int acai = (int) A.charAt(i);
                int acaj = (int) A.charAt(j);
                if(A.charAt(i) == A.charAt(j)){
                    i++;
                    j--;
                    continue;
                }
                if(A.charAt(i) >= 'A' && A.charAt(i) <= 'Z'){
                    if(acai + diff == acaj){
                        i++;
                        j--;
                        continue;
                    }
                }
                if(A.charAt(i) >= 'a' && A.charAt(i) <= 'a'){
                    if(acai - diff == acaj){
                        i++;
                        j--;
                        continue;
                    }
                }
                System.out.println(acai + diff + " == " + acaj);
                System.out.println(acai - diff + " == " + acaj);
                // System.out.println("value of A.charAt(i) ==> "+A.charAt(i));
                // System.out.println("value of A.charAt(j) ==> "+A.charAt(j));
                // System.out.println("value of (int) A.charAt(i) + diff == (int) A.charAt(j) ==> "+(int) A.charAt(i)+" == "+(int) A.charAt(j));
                return 0;
                } else {
                    j--;
                }
            } else {
                i++;
            }
             
        }
        return ans;
    }
}
