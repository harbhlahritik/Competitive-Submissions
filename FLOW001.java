import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
 
		int n = s.nextInt();
 
		for(int i = 0;i < n;i++){
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(a+b);
		}
	}
	
}
