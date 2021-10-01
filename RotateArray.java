/* 
 * 	Input:  {1, 2, 3, 4, 5, 6, 7, 8}
	Output: {5, 6, 7, 8, 1, 2, 3, 4}
*/


public class RotateArray{
	public static void main(String args[]){
		int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
		int n = arr.length;
		int target = 4;
		
		System.out.print("\nOriginal Array: ");
		print(arr, n);
		RotateArray1(arr, n, target);

		arr = new int[]{7, 5, 2, 11, 2, 43, 1, 1};
		System.out.print("\nOriginal Array: ");
		print(arr, n);

		RotateArray2(arr, n, 3);
	}

	public static void RotateArray1(int arr[], int n, int target){
		for(int i = 0; i < target; i++){
			int temp = arr[0];
			int j = 1;
			while(j < n){
				arr[j-1] = arr[j];
				j++;
			}
			arr[j-1] = temp;

		}
		System.out.print("Rotated Array: ");
		print(arr, n);
	}

	static void RotateArray2(int arr[], int n, int k) {

        int temp[] = new int[k];	// storing 1st k elements in temporary array

        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
    
        for (int i = k; i < n; i++) {	// shifting remaining elements of the array
            arr[i - k] = arr[i];
        }
    
        for (int i = 0; i < k; i++) {	//storing back the k elements to the orignal array
            arr[n - k + i] = temp[i];
        }

		System.out.print("Rotated Array: ");
        print(arr, n);
    }

	public static void print(int arr[], int n){
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
}