//Sample programs to display all even numbers upto a given limit
package com.methods;

public class evenNumbers {
	public static void even(int i,int a) {
		for(int j=i;j<=a;j++)
		{
			if(j%2==0)
				System.out.println(j);
		}
		
	}

	public static void main(String[] args) {
		even(0,20);

	}

}
