package assignment.Day3;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 4, 3, 7, 5 };
		System.out.println("Sorted Array in ascending order : ");
        for(int i=0;i<arr.length;i++) {
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[i]>arr[j]){
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        	System.out.print( arr[i] +" ");
        }
	}

}
