package assignment.Day3;

public class FrequencyOfElements {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 6 };

		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (visited[i]) {
				continue; // skip the element already visited
			}

			int count = 1;// count for current element
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i]+": occurs "+count+" times");
		}

	}

}
