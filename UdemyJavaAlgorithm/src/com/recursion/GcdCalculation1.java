package com.recursion;

class gcd{
	public static int gcdRecurcion(int input1,int input2)
	{
		if(input2==0)
		{
			return input1;
		}

		return gcdRecurcion(input2,input1%input2);
	}
	public static int gcdIteration(int input1,int input2) {
		while(input2!=0) {//input2 is not equals to 0 then While loop will work
			int temp=input2;
			input2=input1%input2;
			input1=temp;
		}
		return input1;
	}
}
public class GcdCalculation1 extends gcd{
	
	public static void main(String str[])
	{
		System.out.println(gcdRecurcion(10,15));
		//System.out.println(gcdIteration(10, 15));
	}
	

}
