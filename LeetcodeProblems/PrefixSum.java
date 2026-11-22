package harsh1;

import java.util.Arrays;

public class PrefixSum {
	public static int[] calculatePrefixSum(int[] arr) {
		int[] prefixSum=new int[arr.length];
		
		prefixSum[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			prefixSum[i]=prefixSum[i-1]+arr[i];
		}
		return prefixSum;
	}
	public static int rangeSum(int[] prefixSum,int left, int right) {
		if(left==0) {
			return prefixSum[right];
		}else {
			return prefixSum[right]-prefixSum[left-1];
		}
	}
	public static void main(String[] args) {
		
		int[] arr= {5,10,15,20};
	    int[] result=calculatePrefixSum(arr);
	    int sum=rangeSum(result,1,3);
	    System.out.println("PrefixSum:"+Arrays.toString(result));
	    System.out.println("Range sum:"+sum);
	  
	}

}
