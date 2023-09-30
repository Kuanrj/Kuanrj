package com.sample1;

import java.util.Scanner;

public class MaxMinArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();

		// Create an array to store the user's input
		int[] numbers = new int[n];

		// Prompt the user to enter the elements of the array
		System.out.println("Enter the elements of the array:");

		for (int i = 0; i <n; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			numbers[i] = sc.nextInt();
		}

		// Close the Scanner
		sc.close();

		// Initialize variables to hold the maximum and minimum values
		int max = numbers[0]; // Assuming the first element is the maximum initially
		int min = numbers[0]; // Assuming the first element is the minimum initially

		// Iterate through the array to find the maximum and minimum values
		for (int i = 1; i < n; i++) {
			if (numbers[i] > max) {
				max = numbers[i]; // Update max if a larger number is found
			}
			if (numbers[i] < min) {
				min = numbers[i]; // Update min if a smaller number is found
			}
		}

		// Print the maximum and minimum values
		System.out.println("Maximum number: " + max);
		System.out.println("Minimum number: " + min);
	}

}
