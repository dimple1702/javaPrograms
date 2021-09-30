import java.util.*;
public class TwoSum{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = s.nextInt();

		int arr[] = new int[n];
		System.out.print("Enter the elements of array: ");
		for(int i = 0; i < n; i++){
			arr[i] = s.nextInt();
		}

		System.out.print("Enter the target: ");
		int target = s.nextInt();

		int output[] = HashMapApproachWay2(arr, n, target);
		System.out.print(target + " is the sum of values at indices: ");
		print(output);
	}

	public static int[] BruteForce(int arr[], int n, int target){
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if( i != j && arr[i] + arr[j] == target){
					return new int[]{i, j};
				}
			}	
		}
		return new int[] {-1, -1};
	}

	public static int[] HashMapApproach(int arr[], int n, int target){
		Map<Integer, Integer> map =  new HashMap<>();

		for(int i = 0; i < n; i++){
			if(map.containsKey(target - arr[i])){	//method is used to check whether a particular key is being mapped into the HashMap or not.
                return new int[] {map.get(target - arr[i]), i};
            }
            map.put(arr[i],i);
		}
		return new int[] {-1, -1};
	}

	public static int[] HashMapApproachWay2(int arr[], int n, int target){
		Map<Integer, Integer> map =  new HashMap<>();

		for(int i = 0; i < n; i++){
			map.put(arr[i], i);  // map.put(key k, value v)
		}		

		System.out.print(map); //--> method to print map

		for(int i = 0; i < n; i++){
			int rem = target - arr[i];
			if(map.containsValue(rem) && i != map.get(rem)){	//containsValue() method is used to check whether a particular value is being mapped by a single or more than one key in the HashMap.
                return new int[] {i, map.get(rem)};
            }
		}
		return new int[] {-1, -1};
	}

	public static void print(int arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}