import java.util.*;

public class InsertionSort{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
	
		System.out.print("Enter the size of array: ");
		int n = s.nextInt();

		int arr[] = new int[n];
		System.out.print("Enter the elements of array: ");
		for(int i = 0; i < n; i++){
			arr[i] = s.nextInt();
		}

		InsertionSort2(arr, n);
	}

	public static void InsertionSort1(int arr[], int n){
		int temp = arr[n-1];
		for(int j = n-2; j >= 0; j--){
			if(arr[j] < temp){
				arr[j+1] = temp;
				break;
			} else{
				arr[j+1] = arr[j];
			}
		}
		if(arr[0] == arr[1]){	// for input like 2 3 4 5 6 1
            arr[0] = temp;
        }
		System.out.print("Sorted Array: ");
		print(arr, n);
	}

	public static void InsertionSort2(int arr[], int n){
		for(int i = 0; i < n; i++){
			int temp = arr[i];
			int j = i;
			while(j > 0 && arr[j-1] > temp){
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
		System.out.print("Sorted Array: ");
		print(arr, n);
	}

	public static void print(int arr[], int n){
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}