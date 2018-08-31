package leetcode;

public class Palinfrome {
	public static boolean isPalindrome(int x) {
		
		
		if (x<0||(x%10==0&&x!=0))
			return false;
		int opposite=0;
		while(x>opposite){
			opposite=opposite*10+x%10;
			x=x/10;
		}
		return (x==opposite)||(x==opposite/10);
		
	}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		boolean x=isPalindrome(0);
		System.out.println(x);
	}

}
