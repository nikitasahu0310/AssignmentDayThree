package assignment.Day3;

public class EvenPositionElement {

	public static void main(String[] args) {
		int arr[] = { 1, 24, 5, 17, 18, 15, 3 };

		System.out.println("Elements at even position");

		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}
	}

}
