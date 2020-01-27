package testAssignments;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class AppZen {

	public static void main(String[] args) {
	
		System.out.println(compressedString("aalokkkkkkdeeghtt") );
		hashMapHashTable();

	}
	
	public static void hashMapHashTable() {
		Map<String, String> mp =new HashMap<String, String>();	
		mp.put("B", null);
		mp.put("A", null);
		mp.put(null, "Alok");
		
		System.out.println(mp.entrySet());
		System.out.println(mp.get(null));
		
		System.out.println("hashtable concept");
		Hashtable ht = new Hashtable();
		ht.put("A", "sai");
		ht.put("A", "alok");
		ht.put("A", "abhinav");
		System.out.println(ht.entrySet());
		//System.out.println(ht.get(null));
	}
	
	public  static String compressedString(String message) {
		
		char charArray [] = message.toCharArray();
		String compressedString = "";
		for (int i = 0; i< charArray.length; i++) {
			
			int co = 1;
			for (int j = i; j< charArray.length-1; j++) {
				if(charArray[i] == charArray[j+1]) {
					co++;
				} else {
					break;
				}
			}
			
			if(co == 1) {
				compressedString = 	compressedString.concat(String.valueOf(charArray[i]));
			} else {
			
				compressedString = compressedString.concat(String.valueOf(charArray[i])).concat(String.valueOf(co));
				i = i + co -1;
			}
			
		}
		
		return compressedString;
	}

}
