package anurag;

public class findMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {15, 43, 23, 45, 68, 75, 12, 24};
		int min = arr[0];
		for(int ele: arr) {
			if(ele<=min) {
				min = ele;
			}
		}System.out.print(min);
		
	}

}
