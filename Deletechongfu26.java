package leetcode;

public class Deletechongfu26 {
	
	public static int removeDuplicates(int[] nums){
		int i=0;
		for(int j=1;j<nums.length;j++){
			if(nums[j]!=nums[i]){
				i++;
				nums[i]=nums[j];
			}
		}
		
		
		return i+1;
		
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums={1,2,2,3,4,5,6,6,7};
		int n=removeDuplicates(nums);
		System.out.println(n);
	}

}
