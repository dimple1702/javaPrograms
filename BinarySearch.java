import java.util.*;

public class BinarySearch{
	public static void main(String args[]){
		int arr[] = new int[]{2, 5, 8, 12, 16, 23, 38, 56};
		int target = 21;
		System.out.println("Target " + target + " is found at index: " + search(arr, 0, arr.length, target));
	}
	public static int search(int arr[], int start, int end, int target){
		if(start > end){
			return -1;
		}

		int mid = (start + end) /2;

		if(arr[mid] == target){
			return mid;
		}
		else if(arr[mid] > target){
			return search(arr, start, mid - 1, target);
		}
		else if(arr[mid] < target){
			return search(arr, mid + 1, end, target);
		}
		else{
			return 0;
		}
	}
}