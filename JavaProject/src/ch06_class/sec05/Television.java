package ch06_class.sec05;

public class Television {
	static String company="Samsung";
	static String model="LCD";
	static String info;
	
	static { 
		info = company + "-" + model;
	}
}
