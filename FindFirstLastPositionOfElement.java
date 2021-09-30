/**
 * Relevant to Binary Search
 * Params: arr[], target

 *	Input: [5,7,7,8,8,8,10], 8
   	Output: [3,5]
 
 *	Input: [5,7,7,8,8,8,10], 6
   	Output: [-1,-1] 
*/


class FindFirstLastPositionOfElement{
	public static void main(String args[]){
		int arr[] = new int[]{5,7,7,8,8,8,10};
		int target = 8;

		FindFirstLastPositionOfElement(arr, target);
	}

	public static void FindFirstLastPositionOfElement(int arr[], int target){
		int n = arr.length;
		int result[] = new int[2]; // size = 2 as only first and last index is needed to return

		result[0] = FindFirstIndex(arr, target);
		result[1] = FindLastIndex(arr, target);

		System.out.print(result[0] + " " + result[1]);
	}

	public static int FindFirstIndex(int arr[], int target){
		int index = -1;
		int start = 0, end = arr.length-1;

		while(start <= end){
			int mid = (start + end)/2;
			if(arr[mid] >= target){
				end = mid - 1;
			}else{
				start = mid + 1;	
			}
			if(arr[mid] == target)
				index = mid;
		}
		return index;
	}
	
	public static int FindLastIndex(int arr[], int target){
		int index = -1;
		int start = 0, end = arr.length-1;

		while(start <= end){
			int mid = (start + end)/2;
			if(arr[mid] <= target){
				start = mid + 1;	
			}else{
				end = mid - 1;
			}
			if(arr[mid] == target)
				index = mid;
		}
		return index;
	}
}