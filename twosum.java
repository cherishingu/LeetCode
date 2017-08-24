package task;

public class twosum {

	public static int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		int l=nums.length;
		int sign=0;
		for (int i=0;i<l;i++)
		{
			if(sign==0)
			{
				for (int j=i+1;j<l;j++)
				{
					if (nums[i]+nums[j]==target)
					{
						arr[0]=i;
						arr[1]=j;
						sign=1;
						break;
					}
				}
			}
			else
			{
				break;
			}
		}
		
		return arr;

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] output={3,5,6};
		int[] jieguo=twoSum(output,11);
		System.out.println(jieguo[0]);
		System.out.println(jieguo[1]);

	}

}
