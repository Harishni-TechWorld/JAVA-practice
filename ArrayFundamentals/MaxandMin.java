package harsh1;

public class MaxandMin {
	
	record MinMax(int max,int min) {}
	
	public static MinMax findmaxandmin(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return new MinMax(max,min);
	}
	public static void main(String[] args) {
		int[] arr= {3,9,10,30,-1};
		
		MinMax result=findmaxandmin(arr);
		

		System.out.println("Maximum number: " + result.max());
		System.out.println("Minimum number: " + result.min());
	}

}
