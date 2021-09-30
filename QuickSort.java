public class QuickSort{
	public static void main(String args[]){
		int arr[] = new int[]{13, 19, 9, 5, 12, 8, 7, 4, 21, 2, 6, 11};

		sort(arr, 0, arr.length-1);
	}

	public static void sort(int arr[], int start, int end){
		if(start < end){
			int pivot = partition(arr, 0, end);
			sort(arr, start, pivot-1);
			sort(arr, pivot+1, end);
		}
		print(arr, end);
	}

	public static int partition(int arr[], int start, int end){
		int pivot = arr[end];
		int i = start - 1;

		for(int j = 0; j < end-1; j++){
			if(arr[j] < pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = temp;
		return i+1;
	}

	public static void print(int arr[], int n){
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}