/**
 * 	Input: s = "abbaca"
	Output: "ca"
	Explanation: For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, 
		and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, 
		so the final string is "ca".
*/

import java.util.*;
public class RemoveAdjacentDuplicates{
	public static void main(String[] args) {
		String s = "abbaca";
		System.out.println("Final String: " + RemoveDuplicates(s)); 
	
		String str = "deeedbbcccbdaa";
		System.out.println("Final String: " + RemoveDuplicates2(str, 3)); 

	}
	public static String RemoveDuplicates(String s) {
        char stack[] = new char[s.length()];
        int i = 0;

        for(int j = 0; j < s.length(); j++){
        	char c = s.charAt(j);

        	if(i > 0 && stack[i-1] == c){
        		i--;
        	} else{
        		stack[i] = c;
        		i++;
        	}
        }
        return new String(stack, 0, i);
    }

    public static String RemoveDuplicates2(String s, int k) {
        char stack[] = new char[s.length()];
        int i = 0;

        for(int j = 0; j < s.length(); j++){
        	char c = s.charAt(j);

        	if(i > k && AreSame(stack, k, i-1)){
        		i -= k;
        	} else{
        		stack[i] = c;
        		i++;
        	}
        }
        return new String(stack, 0, i);
    }

    public static boolean AreSame(char stack[], int k, int i) {
    	printStack(stack);
    	System.out.println(" K " + k + " I " + i);
		int l = 0;
		while(l < k){
			if(stack[i - l] != stack[i]){
				return false;
			}
			l++;
		}
		return true;
	}

	public static void printStack(char stack[]){
		for(char i : stack){
			System.out.print(i + " ");
		}
	}

}