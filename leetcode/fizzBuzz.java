import java.util.*;

class Solution{

    public static List<String> fizzBuzz(int n){
        List<String> ans = new ArrayList<String>();
        for(int i = 1;i <= n;i++){
            if(i % 3 == 0 && i % 5 == 0){
                ans.add("FizzBuzz");
            } else if(i % 5 == 0) {
                ans.add("Buzz");
            } else if(i % 3 == 0) {
                ans.add("Fizz");
            } else {
                String s = Integer.toString(i);
                ans.add(s);
            }
        }
        return ans;
    }

    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<String> ans = fizzBuzz(n);
        for(String str : ans) {
            System.out.println(str);
        }
    }
}