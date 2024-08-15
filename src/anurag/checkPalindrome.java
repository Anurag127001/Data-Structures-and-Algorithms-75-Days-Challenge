package anurag;

public class checkPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MADAM";
		int s = 0;
		int e = str.length()-1;
		boolean isPalin = true;
		while(s<=e) {
			if(str.charAt(s)!= str.charAt(e)) isPalin = false ;
			s++;
			e--;
		}
		if(isPalin) System.out.print("Is Palindrome");
		else System.out.print("Not Palindrome");
		
		
	}

}
