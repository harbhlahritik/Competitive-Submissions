import java.util.*;

class longestSubstring {

    public static int maxSubArray(final List<Integer> A) {
        //Kadane's algorithm
        int max_so_far = A.get(0);
        int max_ending_here = A.get(0);
        for(int i = 1;i < A.size();i++){
            if(max_ending_here + A.get(i) > A.get(i)){
                max_ending_here = max_ending_here + A.get(i);
            } else {
                max_ending_here = A.get(i);
            }
            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }
        }
        return max_so_far;
    }

    public static void main(String [] args){
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(-2);
        arr.add(1);
        arr.add(-3);
        arr.add(4);
        arr.add(-1);
        arr.add(2);
        arr.add(1);
        arr.add(-5);
        arr.add(4);
        System.out.println(arr);

        System.out.println(maxSubArray(arr));
    }

}