/**
 *	Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
 	output: "ball"

 * 	Input: paragraph = "a.", banned = []
 	Output: "a"
*/

import java.util.*;
public class MostCommonWord{
	public static void main(String args[]){
		String paragraph = "Bob hit ding a ball, the ding hit BALL flew ding far after it ding was hit.";
		String banned[] = new String[]{"ding"};

		System.out.println("Most Common Word: " + MostCommonWord(paragraph, banned));
	}

	public static String MostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedWords = new HashSet();
        HashMap<String, Integer> validWords = new HashMap();
        
        for(String bannedWord : banned){
            bannedWords.add(bannedWord);
        }
        
        String words[] = paragraph.toLowerCase().split("\\W+");
        
        for(String word : words){
        	if(!bannedWords.contains(word)){
            	validWords.put(word, validWords.getOrDefault(word, 0)+1);
        	}
        }
        
        int max = 0;
        String result = "";
        
        for(String word : validWords.keySet()){
            if(validWords.get(word) > max){
                max = validWords.get(word);
                result = word;
            }
        }
        
        return result;
        
    }
}


