package com.recursion;
class fact{
public static int factorial1(int n) {
	
	if(n==1)
	{
		return n;
	}
	return n*factorial1(n-1);
}

	public static int gcdRecurcion(int input1,int input2)
	{
		if(input2==0)
		{
			return input1;
		}

		return gcdRecurcion(input2,input1%input2);
	}
	public void gcdIteration() {

	}
}
public class Factorial extends fact{
public static void main(String str[])
{
	//factorial1(5);
	//System.out.println(factorial1(5));
	System.out.println(gcdRecurcion(10,15));
}	
}
