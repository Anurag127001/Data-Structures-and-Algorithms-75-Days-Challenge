package anurag;

public class findMissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 5, 7, 6};
		int n = arr.length+1;
		int sum = n * (n+1)/2;
		int actual_sum = 0;
		for(int num: arr) {
			actual_sum+= num;
		}
		int missingNum = sum-actual_sum;
		System.out.print("Missing number is "+ missingNum);
		
	}

}
