package com.sample1;

import java.util.Scanner;

public class CurrencyChange {

	public static void main(String[] args) {

		// Define the available currency
		int currency[] = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

		int currencyCount[] = new int[currency.length];

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the amount: ");

		int amount = sc.nextInt();

		// Calculate the change using a greedy algorithm
		int x = amount;

		for (int i = 0; i < currency.length; i++) {
			if (amount >= currency[i])
				currencyCount[i] = amount / currency[i];
			amount %= currency[i];

		}
		// Print the change and the number of each currency used
		System.out.println("Changes for " + x + " INR:");

		for (int i = 0; i < currency.length; i++) {
			if (currencyCount[i] > 0) {

				System.out.println(currency[i] + " INR x " + currencyCount[i]);
			}
		}
	}
}
