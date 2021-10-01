/**
 * 	Input: a15b20ccc100
 	Output: map[(a,15), (b, 20), (ccc,100)] 
*/

import java.util.*;
public class MapStringNumber{
	public static void main(String args[]){
		String str = "a15b20ccc100";
		int arr[] = new int[]{1,2,3};
		printInfiniteArray(arr, arr.length);
		ExtractString(str, str.length());
	}
	public static void printInfiniteArray(int arr[], int n){
		int size = Integer.MAX_VALUE;
		int infinite[] = new int[size];

		for(int i = 0; i < size; i+=n){
			for(int j = 0; j < n; j++){
				System.out.println(i+j);
				infinite[i+j] = arr[j];
			}
		}

		for(int i = 1; i < size; i++){
			System.out.print(infinite[i] + " ");
		}
	}

	public static void Map(String str, int n){
		String strArr[] = new String[n];
		String numArr[] = new String[n];

		String string = "";
		String number = "";

		int strIndex = 0, numIndex = 0;
		for(int i = 0; i < n; i++){
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				string += str.charAt(i);
			}	

		}

		for(int i = 0; i < n; i++){
			int j = 0;
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				numArr[numIndex++] = str.substring(j, i);
				j = i;
			}
		}
		
		print(strArr, strArr.length);
		print(numArr, numArr.length);
	}

	public static void print(String str[], int n){
		for(int i = 0; i < n; i++){
			System.out.print(str[i] + " ");
		}
		System.out.println();

	}
}