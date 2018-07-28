package geeksforgeeks;

import java.util.*;
import java.lang.*;
import java.io.*;


public class KeyPair {

	public static void keyPair(int N,int X,int [] array){
		int [] hash_map = new int [1000];
		for(int i = 0;i < N;i++){
			hash_map[array[i]] = 1;
		}
		for(int i = 0;i < N;i++){
			int find = X - array[i];
			if(find >= 0 && hash_map[find] == 1){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");


		// for(int i = 0;i < N;i++){
		//     int find = X - array[i];
		//     for(int j = 0;j < N;j++){
		//         if(j == i){
		//             continue;
		//         }
		//         if(array[j] == find){
		//             System.out.println("Yes");
		//             return;
		//         }
		//     }
		// }
		// System.out.println("No");
	}

	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T > 0){
			int N = s.nextInt();
			int X = s.nextInt();
			int [] array = new int [N];
			for(int i = 0;i < N;i++){
				array[i] = s.nextInt();
			}
			keyPair(N,X,array);
			T--;
		}
	}

}
