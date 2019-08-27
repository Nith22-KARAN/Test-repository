package com.nonstatic;

public class Rider {

	public static void main(String[] args) {
       Vehicle v1=new Vehicle();
       Vehicle v2=new Vehicle();
       System.out.println("name: "+v1.name+" color: "+v1.color+" mileage: "+v1.mileage);
       v1.name="Honda acticva";
       v1.color="Silver";
       v2.name="Dio";
       v2.mileage=80.0;
       System.out.println("name: "+v2.name+" color: "+v2.color+" mileage: "+v2.mileage);
       System.out.println("name: "+v1.name+" color: "+v1.color+" mileage: "+v1.mileage);
       
       
	}

}
       