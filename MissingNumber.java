/**
 *	Input: [9,6,4,2,3,5,7,0,1] 
 	Output: 8
 	Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 
 		8 is the missing number in the range since it does not appear in nums.
*/

class MissingNumber{
	public static void main(String args[]){
		int arr[] = new int[]{9,6,4,2,3,5,7,0,1};
		int n = arr.length;

		System.out.println("Missing number is: " + MissingNumber2(arr, n));
	}

	public static int MissingNumber1(int[] arr, int n) {		// Time: O(n), Space: O(n)
		boolean map[] = new boolean[n+1];

		for(int i = 0; i < n; i++){
			map[arr[i]] = true;
		}

		for(int i = 0; i < n+1; i++){
			if(map[i] == false){
				return i;
			}
		}
		return -1;
    }

    public static int MissingNumber2(int[] arr, int n) {		// Time: O(n), Space: O(1)
		int count = 0;
		for(int i = 1; i <= n; i++){
			count += i;
		}

		for(int i = 0; i < n; i++){
			count -= arr[i];
		}
		return count;
    }

    public static int MissingNumber3(int arr[], int n){		// using XOR

    }
}