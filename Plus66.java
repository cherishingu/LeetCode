package leetcode;

import java.util.Arrays;

//首先判断最后一位是否为9，若不是，直接加一返回，若是，则该位赋0，再继续查前一位，同样的方法，知道查完第一位。
//如果第一位原本为9，加一后会产生新的一位，
//那么最后要做的是，查运算完的第一位是否为0，如果是，则在最前头加一个1。

public class Plus66 {
	
	public static int[] plusOne(int[] digits) {
		
		for(int i=digits.length-1;i>=0;--i){
			if(digits[i]<9){
				++digits[i];
				return digits;
			}
			digits[i]=0;
		}
		int[] res=new int[digits.length+1];//比如999才会运行至此
		res[0]=1;
		return res;
        
    }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] digits={1,9,9,9}; 
		int[] res=plusOne(digits);
		//直接打印res的是数组的首地址
		for(int i=0;i<res.length;i++){
		System.out.println(res[i]);}
		System.out.println(Arrays.toString(res));
		//for each循环
		/*
		foreach语句是java5新增，在遍历数组、集合的时候，foreach拥有不错的性能。
		foreach是for语句的简化，但是foreach并不能替代for循环。可以这么说，任何foreach都能改写为for循环，但是反之则行不通。
		foreach不是java中的关键字。foreach的循环对象一般是一个集合，List、ArrayList、LinkedList、Vector、数组等。
		foreach的格式：
		　　　　for(元素类型T 每次循环元素的名称O : 循环对象){

		　　　　　　　　//对O进行操作

		　　　　}


		
		*/
		for(int re:res)
		    System.out.println(re);
	}

}
