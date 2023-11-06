package com.study;

public class DuplicateCountOfArray {

	public static void main(String[] args) {

		int number[] = { 1, 1, 2, 3, 4, 5, 6, 3, 2, 3, 1, 2, 3 };  // Here sorted or unsorted array both can be applicable
		
		int skipNumber = -9999;    // here assumed value is biggest among all elements of array                      
		
		for (int i = 0; i < number.length; i++) {
			int duplicateCount = 1;
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] != skipNumber && number[i] == number[j]) { // Here it restrict to further count the duplicate																			 
					duplicateCount++;
					number[j] = skipNumber;
				}
			}

			if (duplicateCount > 1) {
				System.out.println("Elements " + number[i] + " is duplicated " + duplicateCount + " times.");
			}
		}
	}

}
