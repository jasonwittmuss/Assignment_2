package com.ss.jn.two;

import java.util.ArrayList;
import java.util.List;

public class Assignment_2_1 {
	public static void main(String[] args) {
		// passing the arguments to the summation class
		int sum = summation(args);
		System.out.println("The sum of the number arguments is " + sum);
	}

	public static int summation(String[] args) {
		int sum = 0;
		List<String> badargs = new ArrayList<String>();
		
		if(args.length == 0) {
			return sum;
		}
		
		for(String s : args) {
			int arg;
			try {
				arg = Integer.parseInt(s);
				sum += arg;
			} catch (NumberFormatException e) {
				badargs.add(s);
			}
		}
		
		if(badargs.size() > 1) {
			System.out.println("The following arguments are not numbers");	
		}
		else if(badargs.size() == 1) {
			System.out.println("The following argument is not a number");
		}
		for(String s: badargs) {
			System.out.println(s);
		}
		
		return sum;
	}
}
