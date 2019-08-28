//*Program to design two methos ,name of 1st method "printEven" this should print even numbers upto a
//given limit and to check a given number is even or not we should design a method called isEven from main method**//
package com.methods;

public class CheckAndDisplay {
	static boolean isEven(int i)
	{
		if(i%2==0)
			return true;
		else
			return false;
	}
    static void printEven(int a) {
    	for(int i=0;i<=a;i++)
    	{
    		if(isEven(i))
    			System.out.println(i);
    	}
    }
	public static void main(String[] args) {
		printEven(10);

	}

}
