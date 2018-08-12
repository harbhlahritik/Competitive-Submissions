public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() == 1 || B.size() == 1){
            return 0;
        }
        int ans = 0;
        for(int i = 1;i < A.size();i++){
            int diff_x = A.get(i) - A.get(i-1);
            int diff_y = B.get(i) - B.get(i-1);
            if(diff_x < 0){
                diff_x = -1*diff_x;
            }
            if(diff_y < 0){
                diff_y = -1*diff_y;
            }
            int smaller = 0;
            int remaining = 0;
            if(diff_x > diff_y){
                smaller = diff_y;
                remaining = diff_x - diff_y;
            } else {
                smaller = diff_x;
                remaining = diff_y - diff_x;
            }
            ans+=smaller+remaining;
        }
        return ans;
    }
}
