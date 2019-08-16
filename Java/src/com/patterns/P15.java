/*  A
   BC
  DEF
 GHIJ
KLMNO*/package com.patterns;

public class P15 {

	public static void main(String[] args) {
		int n=5;char ch='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j>=(n-1))
					System.out.print(ch++);
				else
					System.out.print(" ");
				
				
			}
			System.out.println( );
		
			
		}
	}

}
