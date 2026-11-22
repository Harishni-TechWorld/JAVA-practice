package harsh1;

public class Secondlargest {
	public static int largerSecond(int[] arr) {
		
		int largest=-1;
		int secondlargest=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondlargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondlargest && arr[i]!=largest) {
				secondlargest=arr[i];
			}
		}
		return secondlargest;
	}
	public static void main(String[] args) {
		int[] arr= {-2,-6,-8,0};
		
		int secondlargest=largerSecond(arr);
		int largest=largerSecond(arr);
		System.out.println("Second Largest Element in an array:"+secondlargest);
		System.out.println("Largest in the array:"+largest);
	}

}
