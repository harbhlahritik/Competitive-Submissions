import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {

	public static int FirstPosNo(int [] array){
		int length = array.length;
		int [] hashm = new int [length+1];
		for(int i = 0;i < length;i++){
			if(array[i] >= 0 && array[i] < length){
				hashm[array[i]] = -1;	
			}
		}
		for(int i = 0;i < length;i++){
			if(hashm[array[i]] > 0 && array[i] >= 0 && array[i] < length){
				return array[i];
			} else if(i == length-1 && hashm[array[i]] < 0 && array[i] >= 0 && array[i] < length){
				return length+1;
			}
		}
		return -1;
	}

	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T > 0){
			int N = s.nextInt();
			int [] array = new int [N];
			for(int i = 0;i < N;i++){
				array[i] = s.nextInt();
			}
			System.out.println(FirstPosNo(array));
			T--;
		}
	}
}
