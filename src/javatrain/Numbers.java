package javatrain;

public class Numbers {
	
	/* Numbers
Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
Create a second method that when given the number 1-99 returns a String representation of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
Expand on the method you wrote in Numbers 2 to allow the input 1-999.
Expand the method you wrote in Numbers 2 to allow the input 1-9999 */
	public static String numString(int i) {
		String [] nums = new String [] {"one", "two", "three", "four" ,"five", "six", "seven", "eight", "nine", "ten","eleven","twelve","thirteen","fourteen","fifthteen","sixteen","seventeen","eighteen","nineteen"};
		String [] prefixs = new String [] {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String result = "";
		int prefix = i/10;
		int postfix = i % 10;
		
		if(i >= 20) {
			result = prefixs[prefix - 2];
			if(postfix != 0);
				result = result + "-" + nums[postfix - 1];
		} else
			result += nums[i - 1];
		return result;
		
	}
}

