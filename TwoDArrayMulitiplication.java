package com.sample1;

import java.util.Scanner;

public class TwoDArrayMulitiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of row for matrix1 : ");
		int row1 = sc.nextInt();
		System.out.print("Enter the number of col for matrix1 : ");
		int col1 = sc.nextInt();
		System.out.print("Enter the number of row for matrix2 : ");
		int row2 = sc.nextInt();
		System.out.print("Enter the number of col for matrix2 : ");
		int col2 = sc.nextInt();

// Check if multiplication possible
		if (col1 != row2) {
			System.out.println("Multiplication is not possible");
			System.out.println("First matrix Column must be equal to Second matrix Row");
			return;
		}

// Create first matrix and input value
		int matrix1[][] = new int[row1][col1];
		System.out.println("Enter the element for the matrix1");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				System.out.print("Enter at row" + (i + 1) + ", column" + (j + 1) + ": ");
				matrix1[i][j] = sc.nextInt();
			}
		}

// Create second matrix and input value
		int matrix2[][] = new int[row2][col2];
		System.out.println("Enter the element for the matrix2");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				System.out.print("Enter at row" + (i + 1) + ", column" + (j + 1) + ": ");
				matrix2[i][j] = sc.nextInt();
			}
		}

// Matrix Multiplication
		int result[][] = new int[row1][col2];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				for (int p = 0; p < col1; p++) {
					result[i][j] += matrix1[i][p] * matrix2[p][j];
				}
			}
		}

// Print the matrices and result
		System.out.println("M1: ");
		printMatrix(matrix1);
		System.out.println("M2: ");
		printMatrix(matrix2);
		System.out.println("M1 * M2: ");
		printMatrix(result);
		sc.close(); 
	}

// Function to Print a matrix
	public static void printMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("================");
	}
}
