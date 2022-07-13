package week1.day2;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] ch = test.toCharArray();
		for (int i = 0; i < test.length(); i++) {
			if (i%2!=0)
			{
				System.out.print(Character.toUpperCase(ch[i]));
		}
			else
				System.out.print(ch[i]);
		}

	}

}
