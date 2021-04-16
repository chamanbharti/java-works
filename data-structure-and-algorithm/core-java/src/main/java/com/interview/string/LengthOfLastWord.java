package com.string;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String input = "Geeks For Geeks  ";
		LengthOfLastWord len =  new LengthOfLastWord();
	    System.out.println("The length of last word is " +len.lengthOfLastWord(input));
	    System.out.println("The length of last word is " +len.lengthOfLastWord2(input));
	}

	private int lengthOfLastWord(String input) {
		int len=0;
		/* String a is 'final'-- can not be modified
        So, create a copy and trim the spaces from
        both sides */
		String x = input.trim();
		for(int i=0;i<x.length();i++){
			if(x.charAt(i) == ' ')
				len=0;
			else
				len++;
		}
		return len;
	}
	
	public int lengthOfLastWord2(final String a)
    {
        boolean char_flag = false;
        int len = 0;
        for (int i=a.length()-1; i>=0; i--)
        {
            if (Character.isLetter(a.charAt(i)))
            {
                // Once the first chracter from last
                // is encountered, set char_flag to true.
                char_flag = true;
                len++;
            }
            else
            {
                // When the first space after the characters
                // (from the last) is encountered, return the
                // length of the last word
                if (char_flag == true)
                    return len;
            }
        }
        return len;
    }

}
