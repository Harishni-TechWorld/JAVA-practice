package harsh1;

class RemoveDuplicate{
public static int removeDuplicate(int[] nums) {
     
	int k=1;
	for(int i=1;i<nums.length;i++) {
		if(nums[i]==nums[i-1]) {
			continue;
		}
		nums[k]=nums[i];
		k++;
		
	}
	return k;
}

	
public static void main(String[] args) {
	int[] nums= {0,0,1,1,1,2,2,3,3,4};
	int result=removeDuplicate(nums);
	System.out.println("Duplicate of the Array:"+result);
}
}
