package com.revature.app;

import com.revature.model.Bus;

public class Main {

	public static void main(String[] args) {
		referenceExample();
		};

		public static void referenceExample() {
			Bus bus1 = null; 
			bus1 = new Bus();
			
			bus1.model = "Dodge";
			bus1.type = "Express";
			bus1.numberOfWheels = 10;
			bus1.year = 2018;
			System.out.println(bus1.model);
			System.out.println(bus1.numberOfWheels);
			System.out.println(bus1.year);
			System.out.println(bus1.type);
			
		}
}