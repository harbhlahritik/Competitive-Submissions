import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int i = 0;i < T;i++){
			int N = s.nextInt();
			int[] a = new int[N];
			for(int j = 0; j < N;j++){
				a[j] = s.nextInt();
			}
			boolean scholarship = true;
			boolean highscore = false;
			int sum = 0;
			for(int j = 0;j < N;j++){
				if(a[j] == 2){
					scholarship = false;
				}
				if(a[j] == 5){
					highscore = true;
				}
				sum += a[j];
			}
			if(highscore == true && scholarship == true && sum >= 4 * N){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
}
