
public class SimpleArrays {
	int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		//Return string of all numbers
	public String allNumbers() {
		String s = "";

		for(int i = 0; i < numbers.length; i++)
        {
           s = s + numbers[i];
        }

		return s;
	}

	//return alternating numbers
	public String everyOtherNumber() {
		String s = "";

        for(int i = 0; i < numbers.length; i = i+2)
        {
            s = s + numbers[i];
        }

		return s;
	}

	//Return first 5 numbers
	public String firstFiveNumbers() {
		String s = "";

        for(int i = 0; i < numbers.length && i < 5; i++)
        {
            s = s + numbers[i];
        }

		return s;
	}

	public String divisibleByThree() {
		String s = "";

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] % 3 == 0)
            {
                s = s + numbers[i];
            }
        }
		return s;
	}
	
	public String secondHalfOfList() {
		String s = "";

        for(int i = numbers.length / 2; i < numbers.length; i++)
        {
            s = s + numbers[i];
        }

		return s;
	}
	
	public boolean containsNumber(int num) {
		boolean contains = false;

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] == num)
            {
                contains = true;
                break;
            }
        }
		return contains;
	}

}
