// test

import java.util.*;

public class t
{
	public static void main(String[] args)
	{
		System.out.println("hi " + fn(30));
		//fn(1);
	}

	private static int fn(int n)
	{
		if(n % 2 == 0)  return n / 2;
		else  return fn(3 * n + 1);

		/*  also works:
		int y;

		y = n % 2 == 0 ? n / 2 : fn(3 * n + 1);

		return y; 
		*/
	
	}
}
