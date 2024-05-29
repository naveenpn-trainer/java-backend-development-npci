package org.letsupgrade.handson.fundamentals;

public class _02_WorkingWithTwoDimensionalArray {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 10, 11, 12 }, 
				{ 13, 14, 15 }, 
				{ 16, 17, 28 } 
				};
		
		
		for (int row=0;row<matrix.length;row++) {
			for(int col=0;col<3;col++) {
				System.out.print(matrix[row][col]+"\t");
			}
			System.out.println();
		}
		System.out.println("For each");

		for (int[] rows:matrix) {
			for(int val:rows) {
				System.out.print(val+"\t");
			}
			System.out.println();
		}
		
		
	}
}

