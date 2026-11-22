package harsh1;

public class PivotIndex {
	public static int pivotIndex(int[] num) {
		int[] prefixSum=new int[num.length];
		int leftSum=0;
		int rightSum=0;
	    prefixSum[0]=num[0];
		for(int i=1;i<num.length;i++) {
				prefixSum[i]=prefixSum[i-1]+num[i];
		}
		for(int i=0;i<num.length;i++) {
			if(i>0) {
				leftSum=prefixSum[i-1];
			}else {
				leftSum=0;
			}
				rightSum=prefixSum[num.length-1]-prefixSum[i];
            if(leftSum==rightSum) {
				return i;
			}
		}
		return -1;
	}
    public static void main(String[] args) {
    	int[] num= {1,7,3,6,5,6};
    	
    	int indexValue=pivotIndex(num);
    	System.out.println("PivotIndex:"+indexValue);
    }
}
