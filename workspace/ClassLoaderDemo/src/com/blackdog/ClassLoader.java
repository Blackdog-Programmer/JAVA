package com.blackdog;

public class ClassLoader {

	public static void main(String[] args) {
		// Let's print the ClassLoader name of current class.
		// Application/System ClassLoader will load this class
		Class c = ClassLoader.class;
		System.out.println(c.getClassLoader());
		// If we print the ClassLoader name of String, it will print null because it is
		// an
		// in-built class which is found in rt.jar, so it is loaded by Bootstrap
		// ClassLoader
		System.out.println(String.class.getClassLoader());
	}

}
