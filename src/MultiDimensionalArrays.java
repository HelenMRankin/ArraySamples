
public class MultiDimensionalArrays {
	// A 4x5 2D array
	int[][] numbers = {
			{1,3,2,2,2},
			{2,3,1,1,2},
			{3,3,2,1,2},
			{2,3,1,2,2}};
	
	public String allNumbers() {
		String s = "";

		// TODO

		return s;
	}
	
	public int numberOfThrees() {
		int count = 0;

		// TODO

		return count;
	}
	
	/**
	 * Find the first three (or more) in a row and print them out
	 */
	public void findThreeInARow() {
		boolean hasThree = false;
		int foundRow = 0;
		int foundCol = 0;
		// TODO
		
		if (hasThree) {
			System.out.println("Found three in a row on row " + foundRow + " starting at column " + foundCol);
		} else {
			System.out.println("Did not find three in a row");
		}
	}
	
	/**
	 * Sets any matching three or more numbers in a column to 0 and prints the matrix out
	 */
	public void zeroOutThreeInAColumn() {
		
		// TODO
		
		// Print array
		for(int[] row: numbers) {
			for(int position: row) {
				System.out.print(position + "\t");
			}
			System.out.println();
		}
	}
}
