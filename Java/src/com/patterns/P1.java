/*1 2 3 4 5
    6 7 8 9
     10 11 12
        13 14
           15*/
package com.patterns;

public class P1 {

	public static void main(String[] args) {
		int n=5;int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j<=(n-1))
					System.out.print(k);
				
			}
			System.out.println( );
		}
		int p=1;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i+j>(n-1))
						System.out.print(p);
					else
						System.out.print(" ");
				}
				System.out.println( );
				p++;
				
			
		}
	}

}
