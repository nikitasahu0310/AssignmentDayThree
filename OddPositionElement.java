package assignment.Day3;

public class OddPositionElement {

	public static void main(String[] args) {
	  int[] arr= {1,5,26,13,4,89};
	  
	  System.out.println(" ELements at odd position : ");

	  for(int i=0;i<arr.length;i=i+2) {
		  System.out.println(arr[i]);
	  }
	}

}
