import java.util.*;
public class FindUnique{
	public static void main(String args[]){
		int arr[] = new int[]{4, 1, 2, 1, 2};
		int n = arr.length;

		BruteForce(arr, n);
		UsingHashmap(arr, n);
//		UsingXOR(arr, n);
	}

	public static void BruteForce(int arr[], int n){
		for(int i = 0; i < n; i++){
			int j;
			for(j = 0; j < n; j++){
				if(i != j && arr[i] == arr[j])
					break;
			}
			if(j == n){
				System.out.println("Unique Element: " + arr[i]);
			}
		}
	}

	public static void UsingHashmap(int arr[], int n){
		Map<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < n; i++){
			int key = arr[i];
			map.put(key, map.getOrDefault(key, 0) + 1);
		}

		for(int i = 0; i < n; i++){
			int key = arr[i];
			if(map.get(key) == 1){
				System.out.println("Unique Element: " + arr[i]);
			}
		}
	}

	public static void UsingXOR(int arr[], int n){
		
	}
}