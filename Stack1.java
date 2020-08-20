package util;

public class Stack1 
{
	private int top;
	private int []arr;
	
	public Stack1()
	{
		top=-1;
		arr=new int[5];
	}
	
	public Stack1 (int size)
	{
		top=-1;
		arr=new int[size];
	}
	
	public void push(int n )
	{
		if(top == arr.length-1)
		{
			System.out.println("Stack full");
			return;
			
		}
		if(top == arr.length-1)
		{
			throw new StackOverflowException();
		}
		top++;
		arr[top]=n;
	}
	public void pop()
	{
		if(top ==-1)
		{
			System.out.println("Stack empty");
			return;
		}
		System.out.println("value popped from array:"+arr[top]);
		top--;
	}
	public int pop() throws StackUnderflowException
	{
		if(top == -1)
		{
			throw new StackUnderflowException();
		}
		int temp=arr[top];
		top--;
		return temp;
	}
	public void display()
	{
		if(top == -1)
		{
			System.out.println("Stack empty");
			return;
		}
		System.out.println("Elements of stack are:");
		for(int temp=top;temp>=0;temp--)
			System.out.println(arr[temp]);
			
		}
		
			
		
		
		
		
		
}
	
		


