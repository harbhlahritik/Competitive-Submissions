public class Solution {
    public int colorful(int A) {
      int count = 0;
      int num = A;
      while(num != 0){
        num = num/10;
        count++;
      }
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i = 1;i <= count;i++){
          int n = A;
          while(n!=0){
            int val = n % (int) Math.pow(10,i);
            // System.out.println("val for i = "+i+" is ==> "+val);
            int mul = productOfDigits(val);
            // System.out.println("corresponding mul for val "+val+" is ==> "+mul);
            if(!map.containsKey(mul)){
                map.put(mul,1);
            } else {
                return 0;
            }
            n = n/10;
            int j = i-1;
            if(n < (int) Math.pow(10,j)){
                n = 0;
            }
        }
      }
      return 1;
    }

    public int productOfDigits(int n){
      int product = 1;
      int num = n;
      while(num != 0){
        product = product*(num%10);
        num = num/10;
      }
      return product;
    }
}
