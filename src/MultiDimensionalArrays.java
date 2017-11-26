
public class MultiDimensionalArrays {
	// A 4x5 2D array
	int[][] numbers = {
			{1,3,2,2,2},
			{2,3,1,1,2},
			{3,3,2,1,2},
			{2,3,1,2,2}};
	
	public String allNumbers() {
		String s = "";

		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++)
			{
				s = s + numbers[i][j];
			}
		}

		return s;
	}
	
	public int numberOfThrees() {
		int count = 0;

		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++)
			{
				if(numbers[i][j] == 3)
					count++;
			}
		}

		return count;
	}
	
	/**
	 * Find the first three (or more) in a row and print them out
	 */
	public void findThreeInARow() {
		boolean hasThree = false;
		int foundRow = 0;
		int foundCol = 0;

		int lastNum, count = 0;

		for(; foundRow < numbers.length || !hasThree; foundRow++)
		{
			lastNum = numbers[foundRow][0];

			for(int j = 1; j < numbers[foundRow].length; j++)
			{
				if(lastNum == numbers[foundRow][j])
				{
					count++;

					if(count >= 2)
					{
						hasThree = true;
						break;
					}
				}
				else
				{
					count = 0;
					foundCol = j;
				}

				lastNum = numbers[foundRow][j];
			}
			if(hasThree)
				break;
		}



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
