package leetcode;

public class Count38 {
	
	public static String countAndSay(int n) {
		
		String res="1";
		
		for(int m=1;m<n;m++){
			String temp="";
			for(int i=0;i<res.length();i++){
				int num=1;
				while((i+1<res.length())&&res.charAt(i)==res.charAt(i+1)){
					num++;
					i++;
				}
				String str=String.valueOf(num);
				
			    temp=temp+str+res.charAt(i);  
			}
			res=temp;
		}
        return res;
    }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String res=countAndSay(5);
		System.out.println(res);
	}

}
