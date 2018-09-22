package leetcode;
//多看几遍，找数组中和最大的子数组
public class Maxsubarray53 {
	
	public static int maxSubArray(int[] nums) {
		int res=Integer.MIN_VALUE;
		int sum=0;
		for (int i=0;i<nums.length;i++){
			
			sum=Math.max(sum+nums[i], nums[i]);
			res=Math.max(sum, res);
		}
		
		
		return res;
        
    }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[]={-2,1,-3,4,-1,2,1,-5,4};
		int res=maxSubArray(a);
		System.out.println(res);
	}

}
