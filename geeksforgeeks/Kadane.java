package com.hritik;

public class Kadane {
	
	public static int Kadanes_algo(int [] array) {
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;
		for(int i = 0;i < array.length;i++) {
			max_ending_here = max_ending_here + array[i];
			if(max_ending_here > max_so_far) {
				max_so_far = max_ending_here;
			}
			if(max_ending_here < 0) {
				max_ending_here = 0;
			}
		}
		return max_so_far;
	}
	
	public static void main(String[] args) {
		int [] array = {2,3,-2,-1,7,-4,5};
		System.out.println(Kadanes_algo(array));
	}
}
