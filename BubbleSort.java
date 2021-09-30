import java.util.*;

public class BubbleSort{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = scanner.nextInt();

		int arr[] = new int[n];
		System.out.print("Enter the elements of array: ");
		for(int i = 0; i < n; i++){
			arr[i] = scanner.nextInt();
		}
		bubbleSort(arr, n);
	}

	public static void bubbleSort(int arr[], int n){
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            print(arr, n);
        }
	}

	public static void print(int arr[], int n){
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}