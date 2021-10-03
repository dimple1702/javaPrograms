public class CompactString{
	public static void main(String args[]){
		String expandedStr = "aaaaaaaaaaaaaaa";
		CompactString(expandedStr);

		String compactStr = "ac10b4";
		ExpandStringAdvance(compactStr);
	}

	public static void CompactString(String str){
		String output = "";
		int i = 0, j = 0, count = 0;
		while(j < str.length()){
			if(str.charAt(j) == str.charAt(i)){
				count++;
				j++;
			}else{
				output += str.charAt(i);
				output += count;
				count = 0;
				i = j;
			}
		}
		output += str.charAt(i);
		output += count;
		
		System.out.println("Compact string: " + output);
	}

	public static void ExpandStringAdvance(String str){
		StringBuilder output = new StringBuilder();
		StringBuilder nonDigit = new StringBuilder();
		int number = 0;

		boolean isDigit = false;
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);

			if(IsDigit(c)){
				number = number * 10 + (c - '0');
				isDigit = true;
			} else{
				if(isDigit){
					for(int l = 0; l < number; l++){
						output.append(nonDigit);
					}
					nonDigit = new StringBuilder();
					number = 0;
					isDigit = false;
				}
				nonDigit.append(c);
			}
		}
		for(int l = 0; l < number; l++){
			output.append(nonDigit);
		}
		System.out.println("Expanded string: " + output.toString());
	}

	public static void ExpandString2(String str){		// doesn't work for input like a15
		String output = "";

		int i = 1;

		while(i < str.length()){
			char j = str.charAt(i);
			while(j > '0'){
				output += str.charAt(i-1);
				j--;
			}
			i += 2;
		}

		System.out.println("Expand string: " + output);
	}

	public static void ExpandString3(String s){		// doesn't work for input like a15
		String output = "";
		for(int i =0; i < s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))){
				System.out.print(s.charAt(i));
			} else {
				int a = Character.getNumericValue(s.charAt(i));
				for(int j =1; j <a; j++) {
					System.out.print(s.charAt(i-1));
				}
			}
		}
		System.out.println("\nExpand string: " + output);
	}

	public static boolean IsDigit(char c){
		return (c >= '0' && c <= '9');
	}
}