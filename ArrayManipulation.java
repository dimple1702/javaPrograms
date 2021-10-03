/**
 *  Sample Input:   int n - the number of elements in the array
                    int queries[q][3] - a two dimensional array of queries where each queries[i] contains three integers, a, b, and k.
                Example:    5 3
                            1 2 100
                            2 5 100
                            3 4 100

    Sample Output:    200

    Explanation:
        - After the first update the list is    100 100 0   0   0.
        - After the second update list is       100 200 100 100 100.
        - After the third update list is        100 200 200 200 100.  // final array 
        Therefore, the maximum value is 200. (max of final array)
*/

import java.util.*;
public class ArrayManipulation{

	public static void main(String[] args) {
        int n = 10;
		int arr1[][] = new int[][]{{1,2,100}, {2,5,100},{3,4,100}}; 
		int arr[][] = new int[][]{{2,6,8},{3,5,7},{1,8,1},{5,9,15}};

		System.out.println("MAx: " + arrayManipulation(n, arr));
    }
	
	public static long arrayManipulation(int n, int[][] queries) {
        int arr[] = new int[n];
        for(int i = 0; i < queries.length; i++){

        	int start = queries[i][0];
        	int end = queries[i][1];
        	int value = queries[i][2];

            int j = start;
            while(j <= end){
            	arr[j] += value;
            	j++;
            }
            print(arr, n);
        }

        long max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = (long)arr[i];
            }
        }
        return max;
    }

    // public static void main(String[] args) { 
    //     Scanner scan = new Scanner(System.in);
    //     int N = scan.nextInt();
    //     int M = scan.nextInt();
        
    //     /* Save interval endpoint's "k" values in array */
    //     long [] array = new long[N + 1];
    //     while (M-- > 0) {
    //         int a = scan.nextInt();
    //         int b = scan.nextInt();
    //         int k = scan.nextInt();
    //         array[a-1] += k;
    //         array[b]   -= k;
    //     }
    //     scan.close();
        
    //     /* Find max value */
    //     long sum = 0;
    //     long max = 0;
    //     for (int i = 0; i < N; i++) {
    //         sum += array[i];
    //         max = Math.max(max, sum);
    //     }
        
    //     System.out.println(max);
    // } 

    public static void print(int arr[], int n){
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}