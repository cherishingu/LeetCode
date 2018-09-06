package leetcode;

import java.util.Arrays;

public class Longeststring {
	
	public static int lengthOfLongestSubstring(String s) {
        int[] m = new int[256];
        Arrays.fill(m, -1);
        
        System.out.println(m);
        int res = 0, left = -1;
        for (int i = 0; i < s.length(); ++i) {
            left = Math.max(left, m[s.charAt(i)]);
            System.out.println(m[s.charAt(i)]);
            m[s.charAt(i)] = i;
            res = Math.max(res, i - left);
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String S="abcdbacddd";
		int res=lengthOfLongestSubstring(S);
		System.out.println(res);
	}

}
