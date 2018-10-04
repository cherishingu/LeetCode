package leetcode;
//去掉开头结尾的空格，计算截止到目前单词的长度，遇到空格清零
public class Searchlastword58 {
	
	public static int lengthOfLastWord(String s) {
		int left=0;
		int right=0;
		for (int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				++right;
				left=right;
			}
			else{
				++right;
			}
		}
		return right-left;
        
    }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s=" hello worldsyu";
		int res=lengthOfLastWord(s);
		System.out.println(res);
	}

}
