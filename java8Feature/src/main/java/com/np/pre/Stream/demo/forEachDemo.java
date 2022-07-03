package com.np.pre.Stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class forEachDemo {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("f");
		
		list.stream().forEach(t -> System.out.println(t));
		
		Map<Integer, String> map= new HashMap<Integer, String>();
		
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		
		map.entrySet().stream().forEach(obj -> System.out.println(obj));
		
	}

}
