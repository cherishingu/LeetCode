package leetcode;

public class Removeelement27 {
	
	public static int removeElement(int[] nums, int val) {
		int res=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=val){
				res++;
				nums[res-1]=nums[i];
			}
			
		}
		return res;
        
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums={1,2,2,3,5};
		int res=removeElement(nums,2);
		System.out.println(res);
	}

}
