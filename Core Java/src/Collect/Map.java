package Collect;

import java.util.HashMap;
import java.util.Set;

public class Map {
public static void main(String[] args) {
	
	HashMap<Integer,String> m=new HashMap<Integer, String>();
	m.put(10,"ish");
	m.put(20, "Mano");
	m.put(5, "puni");
	
	 Set<Integer> keys = m.keySet();
	for(Integer Key:keys) {
		System.out.println(Key +" "+m.get(Key));
	}
}
	
}
