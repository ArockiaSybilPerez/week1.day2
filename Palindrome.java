package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare a string value as "Madam"
		String str = "madam";
		//declare another string
		String rev = "";
		//Iterate the string in reverse order	
			int length = str.length();
			for (int i = length-1; i>=0; i--)
			{
				rev=rev+str.charAt(i);
			}
				if (str.equalsIgnoreCase(rev)){
					System.out.println("It is a Palindrome");
				}
				else
		{
			System.out.println("It is not Palindrome");
		}
		
	}
}
