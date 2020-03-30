package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
//		String s = "please collect me";
//		String s2 = "please collect me";
//		String s3 = new String("please collect me");
//		System.out.println(s.equals(s2)); 
//		System.out.println(s2.equals(s3));
//		System.out.println(s.equals(s3));
//		
//		String[] letters = s.split("");
//		String first = letters[0];
//		String firstChar = "" + s.charAt(0);

//		int[] ints = new int[] { 1, 2, 3, 4 };
//		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
//		
//		
//		Chair c1 = new Chair(2, "Metal", 1);
//		Chair c2 = new Chair();
//		c2.setLegs(2);
//		c2.setMaterial("Metal");
//		System.out.println(c1.equals(c2));
//
//		System.out.println(c1);
//		System.out.println(c2);

		List<Object> list = new ArrayList<>();
		list.add("Matt");
		list.add("JH");
		list.add(new Chair(6, "Obsidian", 12));
		list.add(new Integer(47));

		for (Object item : list) {
			System.out.println(item.toString());
		}

	}
}
