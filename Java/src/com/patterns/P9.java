/*10101
   0101
    010
     10
      1
*/package com.patterns;

public class P9 {

	public static void main(String[] args) {
		int n=5;int p=1;
	
		for(int i=1;i<=n;i++)
		{
	for(int j=1;j<=n;j++)
	{ if(i<=j)
		System.out.print(p++%2);
	else
		System.out.print(" ");
	}
	System.out.println( );
		

	}

}
}
