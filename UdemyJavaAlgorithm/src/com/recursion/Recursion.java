package com.recursion;

class Iteration{
	
	public static void  iteration() {
		int result=0;
		for(int i=0;i<10;i++)
		{
			result=result+i;
			System.out.println(result);
		}
		//return result;
		System.out.println(result);
	}
	public static int recursion(int j) {
		if(j==0)
		{
			return 1;
		}
		 return j+recursion(j-1);
	}
	
}

public class Recursion extends Iteration{
	
public static void main(String atr[])
{
	//iteration();
	recursion(10);
}

}
