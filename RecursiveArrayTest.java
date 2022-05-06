import java.util.Arrays;

public class RecursiveArrayTest extends RecursiveArray {
	
	// driver
	public static void main (String[] args) {
		
		int testArray[] = {1,2,3,4,5,6};
		
		System.out.println("Original array is: " + Arrays.toString(testArray));
		System.out.print("Reversed array is: "); reverseArray(testArray, 0, 5);
		System.out.println();
		System.out.print("Reversed portion (first half) of array is: "); reverseArray(testArray, 3, 5);
	}
}

