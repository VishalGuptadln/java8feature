package com.np.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	
	public static void main(String[] args) {
		
		//Supplier<String> sup= () -> "Hi vishal gupta";
		 
		List<String> list= Arrays.asList("a","b");
		System.out.println(list.stream().findAny().orElseGet(() -> "Hi vishal gupta"));
	}
}
