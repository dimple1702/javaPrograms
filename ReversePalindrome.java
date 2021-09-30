import java.util.*;

public class ReversePalindrome{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = s.nextInt();

		int reverse = ReverseNumber(num);
		System.out.println("Reverse of number is: " + reverse);

		boolean isNumPalindrome = IsPalindrome(num, reverse);
		if(isNumPalindrome == true){
			System.out.println("Yes, the number " + num + " is Palindrome.");
		} else{
			System.out.println("No, the number " + num + " is not Palindrome.");	
		}  

		System.out.print("\nEnter a string: ");
		
		// next() method can read the input before the space is found
		// nextLine() method reads the text until the end of the line
		
		System.out.print("\nEnter a string: ");
		String str = s.next();  
		
		boolean isStringPalindrome = IsStringPalindrome(str);
		if(isStringPalindrome == true){
			System.out.println("Yes, the string " + str + " is Palindrome.");
		} else{
			System.out.println("No, the string " + str + " is not Palindrome.");	
		} 

		System.out.print("\nEnter a number: ");
		num = s.nextInt();

		System.out.println("Reverse number: " + ReverseNumRecursively(num, 0));

	}

	public static boolean IsPalindrome(int num, int reverse){
		return (num == reverse);
	}

	public static int ReverseNumber(int num){
		int ans = 0;
		while(num > 0){
			int rem = num % 10;
			ans = ans * 10 + rem;
			num /= 10;
		}
		return ans;
	}

	public static boolean IsStringPalindrome(String str){
		System.out.println(str);
		int i = 0, j = str.length()-1;
		while(i < j){
			if(str.charAt(i) == str.charAt(j)){
				i++;
				j--;
			}
			else{
				return false;
			}
		}
		return true;
	}

	public static int ReverseNumRecursively(int num, int ans){
			return num == 0 ? ans : ReverseNumRecursively(num / 10, ans * 10 + num%10);
	}
}