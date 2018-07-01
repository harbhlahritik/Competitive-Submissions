import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	
	public static void chefpdig(String s){
		if(s.length() == 0) {
			return;
		}
		int[] arr = new int[s.length()];
		for(int i = 0;i < s.length();i++) {
			int n = s.charAt(i);
			n = n - 48;
			arr[i] = n;
		}
		Arrays.sort(arr);
		char temp = 'a';
		for(int i = 0;i < arr.length;i++) {
			if(i>0 && arr[i] == arr[i - 1]) {
				continue;
			}
			for(int j = 0;j < arr.length;j++) {
				if(i == j) {
					continue;
				}
				if(j>0 && arr[j] == arr[j - 1] && arr[i] != arr[j]) {
					continue;
				}
				int num = (arr[i]*10 + arr[j]);
				if(num >= 65 && num <= 90) {
					char c = (char) num;
					if(temp == c) {
						continue;
					}
					System.out.print(c);
					temp = c;
				}
			}
		}
		System.out.print("");
		System.out.println();
	}
 
	public static void print(String s) {
		for(int i = 0;i < s.length();i++) {
			System.out.print(s.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		T++;
		while(T > 0) {
			String str = s.nextLine();
//			print(str);
			chefpdig(str);
//			System.out.print("");
//			System.out.println();
			T--;
		}
	}
}
