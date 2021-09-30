/** Find the index of first Unique Character:
 *  String consists of small case alphabets only
 * 
 *  Input: s = "leetcode"
	Output: 0

 *  Input: s = "aabb"
	Output: -1
	
 *  Input: s = "loveleetcode"
	Output: 2

*/
import java.util.*;
public class UniqueChar{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String str = s.next();

		if(IsUnique(str)){
			System.out.println("String '" + str + "' consists of unique characters");
		}else{
			System.out.println("String '" + str + "' doesn't consist of unique characters");
		}
		System.out.println("String '" + str + "' has its first unique character at index: " + FindFirstUniqueChar(str));
	}

	public static boolean IsUnique(String str){
		int len = str.length();

		boolean arr[] = new boolean[26];

		for(int i = 0; i < len; i++){
			int val = str.charAt(i) - 97;
			if(arr[val]){
				return false;
			}
			arr[val] =  true;
		}
		return true;
	}

	public static int FindFirstUniqueChar(String str){
		int arr[] = new int[26];
        int ascii = 0;
        for(int i = 0; i < str.length(); i++){
            ascii = str.charAt(i) - 'a';
            arr[ascii]++;
        }

        for(int i = 0; i < str.length(); i++){
            int min = str.charAt(i) - 'a';
            if(arr[min] == 1){
                return i;
            }
        }
        return -1;
	}
}
