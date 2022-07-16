package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the input
		String sentence = "I AM A SOFTWARE TESTER";
		//Traverse through each word (using loop)
		for(String s:sentence.split(" ")) {
			//find the odd index within the loop (use mod operator)
			if(s.length()%2==0) {
				//split the words and have it in an array
				char[] array = s.toCharArray();
				//print the even position words in reverse order using another loop
				for(int j=array.length-1;j>=0;j--) {
					System.out.print(array[j]);
					
				}
				System.out.print("  ");
				System.out.println('\n');
			}
			else {
				//Print Even String with Space
				System.out.print(s.toString());
				System.out.println('\n');
			}
		}
}
}
