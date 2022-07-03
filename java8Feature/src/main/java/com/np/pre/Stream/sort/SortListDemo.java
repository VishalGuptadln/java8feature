package com.np.pre.Stream.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
		list.add(8);
		list.add(12);
		list.add(3);
		list.add(4);
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t));
	}

}
