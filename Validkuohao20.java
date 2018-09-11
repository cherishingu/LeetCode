package leetcode;


class Stack{
	 
    private Object[] stackElem;
    private int top;
 
    public Stack(int maxSize)
    {
        stackElem=new Object[maxSize];
        top=0;
    }
 
    //清空
    public void clear()
    {
        top=0;
    }
    //是否为空
    public boolean isEmpty()
    {
        return top==0;
    }
    //元素个数
    public int length()
    {
        return top;
    }
    //栈顶
    public Object peek()
    {
        if(!isEmpty())
            return stackElem[top-1];
        else
            return null;
    }
 
    //入栈
    public void push(Object x) throws Exception
    {
        if(top==stackElem.length)
        {
            throw new Exception("栈已满！");
        }
        else
        {
            stackElem[top++]=x;
        }
    }
    //出栈
    public Object pop() throws Exception
    {
        if(top==0)
        {
            throw new Exception("栈为空！");
        }
        else
            return stackElem[--top];  //删除然后返回现在的栈顶
    }
 
    //打印（从栈顶到栈底）
    public void display()
    {
        for(int i=length()-1; i>=0; i--)
        {
            System.out.print(stackElem[i]+" ");
        }
        System.out.println();
    }
}

public class Validkuohao20 {

	public static boolean isValid(String s) throws Exception {
	Stack sqStack=new Stack(30);
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='[')
			sqStack.push(s.charAt(i));
		else if((s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')')&&(sqStack.isEmpty()))
			return false;
		else {
			if((s.charAt(i)=='}')&&((char)sqStack.peek()!='{'))	return false;
			if((s.charAt(i)==')')&&((char)sqStack.peek()!='('))	return false;
			if((s.charAt(i)==']')&&((char)sqStack.peek()!='['))	return false;
			sqStack.pop();
		}
	}
	
	return sqStack.isEmpty();
    }
	
	
	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		String s="{()[]]]}";
		boolean res=isValid(s);
		System.out.println(res);
	}

}
