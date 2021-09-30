import java.util.*;

public class MergeSort{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int n = s.nextInt();

		int arr[] = new int[n];
		System.out.print("Enter the elements of array: ");
		for(int i = 0; i < n; i++){
			arr[i] = s.nextInt();
		}


		merge(arr, 0, n-1);
	}
	public static void merge(int arr[], int start, int end){
		int mid = 0;
		if(start < end){
			mid = (start + end)/2;	
			merge(arr, start, mid);
			merge(arr, mid+1, end);
			mergeSort(arr, start, mid, end);
		}
	}
	public static void mergeSort(int arr[], int start, int mid, int end){

		System.out.print("\nOriginal Array: ");
		print(arr, end+1);

		int n1 = mid - start + 1;
		int n2 = end - mid;

		int lArr[] = new int[n1];
		int rArr[] = new int[n2];

		for(int i = 0; i < n1; i++){
			lArr[i] = arr[start + i];
		}
		for(int j = 0; j < n2; j++){
			rArr[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0;
		int k = start;

		while(i < n1 && j < n2){
			if(lArr[i] < rArr[j]){
				arr[k] = lArr[i];
				i++;
			}else{
				arr[k] = rArr[j];
				j++;
			}
			k++;
		}

		while(i < n1){
			arr[k] = lArr[i];
			i++;
			k++;
		}
		while(i < n2){
			arr[k] = rArr[j];
			j++;
			k++;
		}
		System.out.print("\nSorted Array: ");
		print(arr, end+1);
	}
	public static void print(int arr[], int size){
		System.out.println();
		for(int i = 0; i < size; i++){
			System.out.print(arr[i] + " ");
		}
	}
}