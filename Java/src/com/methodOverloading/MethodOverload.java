//Program to design method to perform multiplication of two integers,two decimal numbers,three integers//
package com.methodOverloading;

public class MethodOverload {
	static void product(int a,int b) {
	System.out.println(" product is "+(a*b));}
	static void product(double a,double b) {
	System.out.println(" product is "+(a*b));}
	static void product(int a,int b,int c) {
	System.out.println(" product is "+(a*b*c));}
	public static void main(String[] args) {
		product(2,3);
		product(20.0,60.6);
		product(2,4,6);

	}

}
