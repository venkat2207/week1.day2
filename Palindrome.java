package week1.day2.Assignments1;

public class Palindrome {

	public static void main(String[] args) {

		String value="mada";
		
		String reversedString;
		
		StringBuffer updatedString=new StringBuffer();
		
		for(int i = value.length()-1; i>=0; i--)
		{

		      char a = value.charAt(i);
		      //System.out.print(a);
		      updatedString.append(a);
		      
		      
		  }
		
		reversedString=updatedString.toString();
		//System.out.println(reversedString);
		
		System.out.println(reversedString.equalsIgnoreCase(value));

	}

	
	
	
}
