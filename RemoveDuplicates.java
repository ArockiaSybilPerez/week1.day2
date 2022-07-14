package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 // b) Initialize an integer variable as count	
			int count = 0;
		 // c) Split the String into array and iterate over it 
			String str[]=text.split(" ");
			for (int i = 0; i < str.length; i++) {				
		 // d) Initialize another loop to check whether the word is there in the array
			for (int j =i+1; j < str.length; j++) {
		 // e) if it is available then increase and count by 1. 
			if (str[i].equals(str[j])) {
			count++;
			
			if (count>=1) {
				str[j]="";		
				}
			}
			}
		 // f) if the count > 1 then replace the word as "" 
			System.out.print(str[i]+" ");
	}
}
}
