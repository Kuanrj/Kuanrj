package com.sample1;

import java.util.Scanner;

public class ArraySorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//Read and store the user's input into an array
		System.out.println("Enter the number of elements in the array: ");
		int size = sc.nextInt();
		int[] number = new int[size];

		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}

//Sort the array using a sorting algorithm (e.g., bubble sort)		
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] > number[j]) {
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}

//Print the sorted array		
		System.out.println("Sorted list in ascending order: ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		sc.close();
	}

}
