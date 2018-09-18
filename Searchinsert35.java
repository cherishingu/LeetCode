package leetcode;

public class Searchinsert35 {
	
	public static int searchInsert(int[] nums, int target) {
		//如果数组元素出现大于等于目标直的，返回index，如果遍历结束也没找到，则插入到数组末尾，返回数组大小
		int i=0;
		for(i=0;i<nums.length;i++){
			if(nums[i]>=target) return i;	
		}
		return nums.length;
    }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[]={1,2,3,4,6};
		int res=searchInsert(a,3);
		System.out.println(res);
	}

}
