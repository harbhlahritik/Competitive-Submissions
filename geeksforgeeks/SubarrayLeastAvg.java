package com.hritik;

public class SubarrayLeastAvg {
	
	public static int subarrayWithLeastAvg(int [] array,int k) {
		if(k > array.length) {
			System.out.println("Please input k smaller than array length");
			return Integer.MIN_VALUE;
		}
		int curr_sum = 0;
		for(int i = 0;i < k;i++) {
			curr_sum += array[i];
		}
		int min_sum = curr_sum;
		int result_index = 0;
		for(int i = k;i < array.length;i++) {
			curr_sum = curr_sum - array[i-k] + array[i];
			if(min_sum > curr_sum) {
				min_sum = curr_sum;
				result_index = i-k+1;
			}
		}
		return result_index;
	}
	
	public static void main(String[] args) {
		int [] array = {2,3,90,10,20,50,30,40};
		int k = 3;
		int ans = subarrayWithLeastAvg(array, k);
		System.out.println("Subarray between index "+ans+" and "+(ans+k+1)+" has minimum average.");
	}
}
