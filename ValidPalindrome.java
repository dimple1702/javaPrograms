import java.util.*;

public class ValidPalindrome{
	public static void main(String args[]){
		String str = "0P";
		int n = str.length();

		System.out.println("String is Valid Palindrome: " + IsValidPalindrome2(str, n));
	}

	public static boolean IsValidPalindrome1(String str, int n){	// fails for input like= "a0", "a.", ".a"
		String left = "";
		String right = "";


		for(int i = 0; i < n; i++){
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				left += str.charAt(i);			
			}
			else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
				int temp = str.charAt(i) + 32;
				char ch = (char)temp;
				left += ch;
			}
		}

		for(int i = n-1; i >= 0; i--){
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				right += str.charAt(i);			
			}
			else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
				int temp = str.charAt(i) + 32;
				char ch = (char)temp;
				right += ch;
			}
		}
		System.out.println(left);
		System.out.println(right);

		for(int i = 0; i < n; i++){
			if(!left.equals(right))
				return false;
		}

		return true;
	}

		public static boolean IsValidPalindrome2(String str, int n){
			String helper = "";
			for(char c : str.toCharArray()){
				if(Character.isDigit(c) || Character.isLetter(c)){
					helper += c;
				}
			}

			helper = helper.toLowerCase();

			int i = 0, j = helper.length() - 1;

			while(i <= j){
				if(helper.charAt(i) != helper.charAt(j))
					return false;
				i++;
				j--;
			}
			return true;
		}

}