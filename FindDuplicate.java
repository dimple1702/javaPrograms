import java.util.*;
public class FindDuplicate{
	public static void main(String args[]){
		int arr[] = new int[]{9, 7, 2, 5, 4, 7, 1, 3, 6};
		int n = arr.length;

		BruteForce(arr, n);
		UsingHashmap(arr, n);
//		UsingXOR(arr, n);
	}

	public static void BruteForce(int arr[], int n){
		int i, j, unique = 0;
		for(i = 0; i < arr.length; i++) {  
            for(j = i + 1; j < arr.length; j++){  
                if(arr[i] == arr[j]){
                    unique = arr[j];        
                } 
            }
		}
		System.out.println("Unique Element: " + unique);
	}

	public static void UsingHashmap(int arr[], int n){
		Map<Integer, Integer> map = new HashMap<>();
		int unique = -1;
		for(int i = 0; i < n; i++){
			int key = arr[i];
			map.put(key, map.getOrDefault(key, 0) + 1);
		}

		for(int i = 0; i < n; i++){
			int key = arr[i];
			if(map.get(key) > 1){
				unique = arr[i];
			}
		}
		System.out.println("Unique Element: " + unique);
	}

	public static void UsingXOR(int arr[], int n){
		
	}
}