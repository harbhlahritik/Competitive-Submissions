import java.util.Scanner;
 
public class Main
 {
	public static void main(String[] args)
	 {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T > 0) 
		{
			int N = s.nextInt();
			int[] A = new int[N];
			for(int j = 0;j < N;j++)
			 {
				A[j] = s.nextInt();
			}
			int min = A[0];
			for(int i = 1;i < N;i++)
			 {
				if(A[i] < min)
				 {
					min = A[i];
				}
			}
			for(int i = 0;i < N;i++) 
			{
				if(A[i] == min) 
				{
					System.out.println(i+1);
					break;
				}
			}
			T--;
		}
	}
}
