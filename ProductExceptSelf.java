class ProductExceptSelf{
	public static void main(String args[]){
		int arr[] = new int[]{-1,1,0,-3,3};
		ProductExceptSelf3(arr);
	}

	public static void ProductExceptSelf1(int arr[]){	// Time Complexity: O(n^2)
		int n = arr.length;
		int result[] = new int[n];
		for(int i = 0; i < n; i++){
			int count = 1;
			for(int j = 0; j < n; j++){
				if(j != i){
					count *= arr[j];
				}
			}
			result[i] = count;
		}
		print(result, n);
	}

	public static void ProductExceptSelf2(int arr[]){	// Time: O(n) , Space: O(n)
		int n = arr.length;

		int left_product[] = new int[n];
		int right_product[] = new int[n];

		int result[] = new int[n];

		left_product[0] = 1;
		right_product[n-1] = 1;

		for(int i = 1; i < n; i++){
			left_product[i] = arr[i-1] * left_product[i-1];
		}

		for(int i = n-2; i >= 0; i--){
			right_product[i] = arr[i+1] * right_product[i+1];
		}

		for(int i = 0; i < n; i++){
			result[i] = left_product[i] * right_product[i];
		}

		print(result, n);

	}

	public static void ProductExceptSelf3(int arr[]){	// Time: O(n) , Space: O(1)
		int n = arr.length;

		int result[] = new int[n];
		result[0] = 1;
		int temp = 1;

		for(int i = 1; i < n; i++){
			result[i] = arr[i-1] * result[i-1];
		}

		for(int i = n-1; i >= 0; i--){
			result[i] = result[i] * temp;
			temp *= arr[i];
		}
		print(result, n);

	}


	public static void print(int arr[], int n){
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}