package leetcode;

public class Reverse {

	public static int reverse(int x){
		int res=0;   //res要放在while循环的前面，不然return res会报错
		while(x!=0){
			int temp=x % 10;
			x=x/10;
			//溢出处理，结果在 -2147483648～2147483647间
			if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
            if (res < Integer.MIN_VALUE/10 || (res== Integer.MIN_VALUE / 10 && temp < -8)) return 0;
			res=res*10+temp;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int res=reverse(3004);
		System.out.println(res);
	}

}
