package leetcode;

public class Findstrsrt28 {
	
	public static int strStr(String haystack, String needle) {
		int index=haystack.indexOf(needle);
		
		return index;
		
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		int index=strStr("abcd","bc");
		System.out.println(index);
		
	}
}
