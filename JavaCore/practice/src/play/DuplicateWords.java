package play;

import java.util.*;

public class DuplicateWords {

	public static void main(String[] args) {
		
		boolean x=false;
		if(x)
			throw new NullPointerException();
		
	}
	
	public  Map<String,Integer> frequency(List<String> list){
		Map<String,Integer> temp=new HashMap<String,Integer>();
		for(int i=0;i<list.size();i++){
			if(temp.containsKey(list.get(i)))
			temp.put(list.get(i),temp.get(list.get(i))+1);
			else temp.put(list.get(i),1);
			}
		return temp;
	}
	
	public void printDuplicates(Map<String,Integer> temp){
		List<String> duplicates=new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : temp.entrySet()) {
		    String key = entry.getKey();
		    Integer value = entry.getValue();
		    if (value!=1)
		    	duplicates.add(key);
		}
		System.out.println("Duplicates: "+duplicates);
	}
	
	public void printDistincts(Map<String,Integer> temp){
		List<String> distincts=new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : temp.entrySet()) {
		    String key = entry.getKey();
		    	distincts.add(key);
		}
		System.out.println("Distincts: "+distincts);
	}
	
	public void printFrequencyAlphabetical(List<String> list){
		Map<String,Integer> temp=new TreeMap<String,Integer>();
		for(int i=0;i<list.size();i++){
			if(temp.containsKey(list.get(i)))
			temp.put(list.get(i),temp.get(list.get(i))+1);
			else temp.put(list.get(i),1);
			}
		System.out.println("cerinta 4: "+temp);
	}
	
	public void frequencyTableInOrder(List<String> list){
		Map<String,Integer> temp=new LinkedHashMap<String,Integer>();
		for(int i=0;i<list.size();i++){
			if(temp.containsKey(list.get(i)))
			temp.put(list.get(i),temp.get(list.get(i))+1);
			else temp.put(list.get(i),1);
			}
		System.out.println("cerinta 5: "+temp);
	}
	
	
	

}
