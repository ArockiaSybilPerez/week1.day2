package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the input
		String G1 = "I AM A SOFTWARE TESTER";
		//split the words
		String G2[] = G1.split(" ");
		//Traverse through each word (using loop)
		for(int i=0; i<G2.length; i++) {
			//find the odd index within the loop (use mod operator)
			if(i%2==0) {
				//split the words and have it in an array
				char[] array = G2[i].toCharArray();
				//print the even position words in reverse order using another loop
				for(int j=array.length-1;j>=0;j--) {
					System.out.print(array[j]);
				}
			}
			else {
				//Print Even String with Space
				System.out.print(" "+G2[i]+" ");
			}
		}
}
}