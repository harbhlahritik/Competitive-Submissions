import java.util.Scanner;
 
public class Main {
	//O(N)
	/*public static int sx(int x){
		int rem = 0;
		int sum = 0;
		while(x != 0){
			rem = x%10;
			sum += rem;
			x = x/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
 
		int N = s.nextInt();
		int x = 0;
		int count = 0;
		while(x <= N){
			if(x + sx(x) + sx(sx(x)) == N){
				count++;
			}
			x++;
		}
		System.out.println(count);
	}*/
 
 
	//O(97)
	public static int sx(int x){
		int rem = 0;
		int sum = 0;
		while(x != 0){
			rem = x%10;
			sum += rem;
			x = x/10;
		}
		return sum;
	}
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
 
		int N = s.nextInt();
		int count = 0;
		if(N >= 97){
			int x = N - 97;
			while(x <= N && x >= N-97){
				if(x + sx(x) + sx(sx(x)) == N){
					count++;
				}
				x++;
			}
		}
		else{
			int x = 0;
			while(x <= N){
				if(x + sx(x) + sx(sx(x)) == N){
					count++;
				}
				x++;
			}
		}
		System.out.println(count);
	}
} 

