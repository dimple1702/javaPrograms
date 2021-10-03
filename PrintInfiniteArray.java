/**
 * 	Input: [1,2,3]
 	Output : [1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,.....]
*/


public class PrintInfiniteArray{
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3};
		PrintInfiniteArray(arr, arr.length);		
	}
	public static void PrintInfiniteArray(int arr[], int n){
		int size = n*100;		// TODO
		int infinite[] = new int[size];

		for(int i = 0; i < size; i+=n){
			for(int j = 0; j < n; j++){
				infinite[i+j] = arr[j];
			}
		}

		for(int i = 0; i < size; i++){
			System.out.print(infinite[i] + " ");
		}
	}
}