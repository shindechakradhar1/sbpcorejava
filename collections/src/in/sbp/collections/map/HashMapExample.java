package in.sbp.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Integer,String> pincodeMap = new HashMap<>();
		
		pincodeMap.put(413106, "Indapur");
		pincodeMap.put(413101, "Akluj");
		pincodeMap.put(414403,"Karjat");
		pincodeMap.put(413133,"Baramati");
		pincodeMap.put(413130,"Khadki");
//		containsKey containsValue
		if(pincodeMap.containsKey(413137)){
			System.out.println("this pincode is present in Entry");
		}
		
		String area=pincodeMap.get(413130);
		
		System.out.println("Area for key 413130 is:" + area);
		
//		remove(key) returns value
//		remove(key, value) returns boolean result
//		System.out.println(pincodeMap.remove(413101,"Akluj"));
		
//		clear() clear all the elements from Collection object
		
//		isEmpty() returns boolean true if collection object is empty
//		or returns false
		
//		for(Integer key:pincodeMap.keySet())
//			System.out.println(key);
//		
//		for(String value:pincodeMap.values())
//			System.out.println(value);
//		
//		for(Map.Entry<Integer, String> entry: pincodeMap.entrySet())
//			System.out.println(entry.toString());
//		
//		Iterator<Integer> keyIterator = pincodeMap.keySet().iterator();
//		while(keyIterator.hasNext())
//			System.out.println(keyIterator.next());
//		
//		Iterator<String> valueIterator = pincodeMap.values().iterator();
//		while(valueIterator.hasNext())
//			System.out.println(valueIterator.next());
//		
//		Iterator<Entry<Integer, String>> keyValueIterator = pincodeMap.entrySet().iterator();
//		while(keyValueIterator.hasNext())
//			System.out.println(keyValueIterator.next());
		
//		pincodeMap.keySet().forEach(key->System.out.println(key));
		
		pincodeMap.keySet().forEach(System.out::println);
		
		pincodeMap.values().forEach(System.out::println);
		
		pincodeMap.entrySet().forEach(HashMapExample::printEntry);
		
		
		
//		System.out.println(pincodeMap);
	}
	
	public static void printEntry(Map.Entry<Integer, String> entry) {
		System.out.println(entry);
	}
}
