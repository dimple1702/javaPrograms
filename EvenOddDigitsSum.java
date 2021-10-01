/**
 * 	Input: 552245
	Output: 8 15
*/

public class EvenOddDigitsSum{
	public static void main(String args[]){
		int num = 552245;

		int[] result = sumOfEvenOdd(num, 0, 0);

		System.out.println("Number is: " + num);

		System.out.println("Sum of even digits: " + result[0]);
		System.out.println("Sum of odd digits: " + result[1]);
	}

	public static int[] sumOfEvenOdd(long num, int evenSum, int oddSum) {
		int result[] = new int[2];
        
        while(num > 0){
            int rem = (int)(num % 10);
            
            if(rem % 2 == 0)
                evenSum += rem;
            else
                oddSum += rem;
            
            num /= 10;
        }
        result[0] = evenSum;
        result[1] = oddSum;
        
        return result;
	}
}


