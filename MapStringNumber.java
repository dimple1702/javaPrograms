/**
 * 	Input: a15b20ccc100
 	Output: map[(a,15), (b, 20), (ccc,100)] 
*/

import java.util.*;
public class MapStringNumber{
	public static void main(String args[]){
		String str = "a15b20ccc100";

		Map<String, Integer> map = Map(str);
		
		System.out.println("\nWay1 of printing map: ");
		map.forEach((k,v) -> System.out.println(k + " -> " + v));

		System.out.println("\nWay2 of printing map: ");
		map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

		System.out.println("\nWay3 of printing map: ");
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

	}

	public static Map<String,Integer> Map(String str){
		Map<String, Integer> map =  new HashMap();		// interface and concrete implemetation,  Map - types
		
		StringBuilder letter = new StringBuilder();
		int number = 0;
		boolean isDigits =  false;

		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(IsDigit(c)){
				number = number * 10 + (c - '0');
				isDigits = true;
			}else{
				if(isDigits){
					map.put(letter.toString(), number);
					letter = new StringBuilder();
					number = 0;
					isDigits = false;
				}
				letter.append(c);
			}
		}
		map.put(letter.toString(), number);
		return map;
	}

	public static boolean IsDigit(char c) {
		return c >= '0' && c <= '9';
	}

}