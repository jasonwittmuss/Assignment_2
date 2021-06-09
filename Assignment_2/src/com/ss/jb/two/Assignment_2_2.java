package com.ss.jb.two;

import java.util.Random;

public class Assignment_2_2 {
	public static void main(String[] args) {
		// Call to construct an array with the hard coded parameters
		int[][] arr = constructArray(10, 10, 100);

		// Print array to help with verification
		printArray(arr);

		// Find and print the max value and position
		int[] best = findMax(arr);
		int maxint = best[0];
		int posx = best[1];
		int posy = best[2];

		System.out.println("The max number is " + maxint + " and is found in position (" + posx + "," + posy + ")");
	}

	public static void printArray(int[][] arr) {
		// Loops through the array and prints it out with formatting
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				if (arr[i][j] < 10) {
					System.out.print(" " + arr[i][j] + ", ");
				} else {
					System.out.print(arr[i][j] + ", ");
				}
			}
			if (arr[i][arr[i].length - 1] < 10) {
				System.out.println(" " + arr[i][arr[i].length - 1]);
			} else {
				System.out.println(arr[i][arr[i].length - 1]);
			}
		}
	}

	public static int[][] constructArray(int x, int y, int max) {
		// Randomly assigns a new value to each position in the array
		Random rand = new Random();

		int[][] arr = new int[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				arr[i][j] = rand.nextInt(max);
			}
		}

		return arr;
	}

	public static int[] findMax(int[][] arr) {
		// Loops through the array keeping and updating the max value and position
		int[] best = { 0, -1, -1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > best[0]) {
					best[0] = arr[i][j];
					best[1] = i;
					best[2] = j;
				}
			}
		}

		return best;
	}
}
