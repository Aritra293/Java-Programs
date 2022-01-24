package nov22;

public class Countword {

	public static void main(String[] args) {
		String str;
		int i,wc=0;
		str="The Quick Brown Fox Jumps Over The Lazy Dog";
		for(i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' '&& Character.isLetter(str.charAt(i+1))&&(i>0))
			{
				wc++;
			}
		}
	wc++;
	System.out.println("Given String: "+ str);
	System.out.println("Total number of words in the given string: "+ wc);
	
}
}
