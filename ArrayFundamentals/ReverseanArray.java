package harsh1;

import java.util.Arrays;

public class ReverseanArray { 
	public static void revtoArray(int[] arr) {
		
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}

	}
	
  public static void main(String[]args) {
	  int[] arr= {10,20,30,40,50};
	  
	  revtoArray(arr);
	  
	  System.out.println(Arrays.toString(arr));
}
}
