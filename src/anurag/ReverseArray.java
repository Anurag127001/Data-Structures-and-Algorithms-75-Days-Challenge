package anurag;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5, 6, 4, 2, 17, 90, 7};
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.print(Arrays.toString(arr));
				
	}

}
