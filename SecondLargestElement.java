package assignment.Day3;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 4, 3, 7, 5, 14, 12 };
		System.out.println("Second largest element in a array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//print element in second last index 
		System.out.println(arr[arr.length - 2]);
	}

}
