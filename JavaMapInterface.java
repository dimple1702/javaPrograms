import java.util.*;

public class JavaMapInterface{
	public static void main(String[] args) {
		Map<Integer, String> codeCity = new HashMap<>(); // declaring a hashmap

		codeCity.put(11, "Delhi");		// adding entry in hashmap
		codeCity.put(12, "Mumbai");
		codeCity.put(13, "Kotkata");
		codeCity.put(14, "Chennai");

		PrintMap(codeCity);
		HashMap(codeCity);
		LinkedHashMap(codeCity);
		TreeMap(codeCity);
	}

	public static void HashMap(Map<Integer, String> codeCity){
		
		System.out.println("\nKey-Value Pair: " + codeCity);

		codeCity.put(1, "New Delhi");  // hashmap doesn't permit duplicate keys so, Delhi is updated to NewDelhi		

		System.out.println("\nValue of duplicate key is updated: " + codeCity);


		codeCity.put(null, "Hydrabad");
		codeCity.put(null, null);		// more than one null keys are not allowed, therefore discarded
		codeCity.put(15, null);	
		codeCity.put(16, null);		// more than one null values are allowed.	


		System.out.println("\nNull key value check: " + codeCity);
	}

	public static void LinkedHashMap(Map<Integer, String> codeCity){
	
		codeCity.put(null, "Hydrabad");
		codeCity.put(null, null);		
		codeCity.put(15, null);	
		codeCity.put(16, null);		

		System.out.println("\nEntries are displayed in the order in which they are inserted: " + codeCity);
	}

	public static void TreeMap(Map<Integer, String> codeCity){

		codeCity.put(15, null);	 // null values are allowed
		codeCity.put(16, null);	

		System.out.println("\nTreemap is displayed: " + codeCity);

		codeCity.put(null, "Hydrabad");	// throws a null pointer exception
		codeCity.put(null, null);	
	}	

	public static void PrintMap(Map<Integer, String> codeCity){		// ways to print a map
		System.out.println("\nWay1: ");
		codeCity.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

		System.out.println("\nWay2: ");
		codeCity.forEach((k,v) -> System.out.println(k + " -> " + v));

		System.out.println("\nWay3: ");
		for(Map.Entry<Integer, String> kvMap : codeCity.entrySet()){
			System.out.println(kvMap.getKey() + " -> " + kvMap.getValue());
		}

		System.out.println("\nWay4: ");
		Set map = codeCity.entrySet();
		Iterator itr = map.iterator();
		while(itr.hasNext()){
			Map.Entry<Integer, String> kvMap = (Map.Entry)itr.next();
			System.out.println(kvMap.getKey() + " -> " + kvMap.getValue());
		}

	}
}