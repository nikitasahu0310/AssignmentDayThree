package assignment.Day3;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("Reversed Array : ");
		for (int i = arr.length - 1; i >= 0; i--) { // i=5-1=4
			System.out.print(arr[i]+" ");
		}

	}

}
