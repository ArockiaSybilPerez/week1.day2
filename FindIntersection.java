package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] array1 = {3,2,11,4,6,7};
 int[] array2 = {1,2,8,4,9,7};
 for (int i = 0; i < array2.length; i++) {
	if(array1[i]==array2[i])
	System.out.println(i);
}
	}

}
