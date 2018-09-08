package com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaEightTest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> afterNumbers = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
		for(Integer i : afterNumbers) {
			System.out.println(i);
		}
		
		
		System.out.println("=================");
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		int icount = (int) strings.stream().filter(i -> i.isEmpty()).count();
		System.out.println(icount);
		
		Integer a = 2;
		Optional  opt =  Optional.of(a);
		
		
		opt.isPresent();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}	
