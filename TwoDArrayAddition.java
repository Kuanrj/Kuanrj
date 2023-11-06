package com.sample1;

import java.util.Scanner;

public class TwoDArrayAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of row for matrix : ");
		int row = sc.nextInt();
		System.out.print("Enter the number of col for matrix : ");
		int col = sc.nextInt();

// Create first matrix and input value
		int matrix1[][] = new int[row][col];
		System.out.println("Enter the element for the matrix1");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Enter at row" + (i + 1) + ", column" + (j + 1) + ": ");
				matrix1[i][j] = sc.nextInt();
			}
		}

// Create second matrix and input value
		int matrix2[][] = new int[row][col];
		System.out.println("Enter the element for the matrix2");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Enter at row" + (i + 1) + ", column" + (j + 1) + ": ");
				matrix2[i][j] = sc.nextInt();
			}
		}

// Matrix Addition
		int result[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
// Print result
		System.out.println("Result of matrix Addition: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
