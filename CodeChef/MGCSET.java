import java.util.Scanner;

class MGCSET {

    public static int sum(int n){
        return (int) (Math.pow(2,n) - 1);
    }

    public static int goodSubsequences(int n,int m,int [] seq){
        int ans = 0;
        int count = 0;
        for(int i = 0;i < n;i++){
            if(seq[i] % m == 0){
                count++;
            }
        }
        ans = sum(count);
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while(T > 0){
            int n = s.nextInt();
            int m = s.nextInt();
            int [] seq = new int [n];
            for(int i = 0;i < n;i++){
                seq[i] = s.nextInt();
            }
            System.out.println(goodSubsequences(n,m,seq));
            T--;
        }
    }
}
