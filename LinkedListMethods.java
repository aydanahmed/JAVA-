package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LinkedListMethods {

	
	public static void main(String[] args) {
		
		//create an array and convert to lsit
		Character[] ray = {'p','w','n'};
		List<Character> l = Arrays.asList(ray);
		System.out.println("List is : ");
		output(l);
		
		
		//reverse and print out the lsit
		Collections.reverse(l);
		System.out.println("After reverse : ");
		output(l);
		
		//create a new array and a new lsit
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);
		
		//copy contents of list into lsitcopy
		Collections.copy(listCopy, l);
		System.out.println("Copy of list : ");
		output(listCopy);
		
		//fill collection with crap
		Collections.fill(l,'X');
		System.out.println("After filling  the list : ");
		output(l);
		
		System.out.println(Collections.frequency(l, 'X'));
		
		
	}

	private static void output(List<Character> l) {
		for(Character ch : l) {
			System.out.printf("%s ",ch);
		}
		System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
