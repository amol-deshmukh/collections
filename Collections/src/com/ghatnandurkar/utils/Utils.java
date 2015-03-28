package com.ghatnandurkar.utils;

import java.util.HashMap;

public class Utils {

	public void testCloneOfMap(){
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		
		map.put("Amol", 1);
		HashMap<String, Integer> map1= new HashMap<String, Integer>();
		map1=(HashMap<String, Integer>) map.clone();
		map.clear();
		System.out.println(map1);
	}
	
	

}
