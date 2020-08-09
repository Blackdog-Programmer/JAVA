package com.blackdogcode;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

// A Java program to demonstrate working of a Class type
// object created by JVM to represent .class file in memory.
public class Main {
    // Java code to demonstrate use of Class object created by JVM
    public static void main(String[] args) {
        Student s1 = new Student();

        // Getting hold of Class object created by JVM
        Class c1 = s1.getClass();

        // Printing type of object using c1
        System.out.println(c1.getName());

        // getting all methods in an array
        System.out.println("--------------------------------------");
        System.out.println("Method List:");
        Method m[] = c1.getDeclaredMethods();
        for (Method method : m) System.out.println(method.getName());

        // getting all fields in an array
        System.out.println("--------------------------------------");
        System.out.println("Field List:");
        Field f[] = c1.getDeclaredFields();
        for (Field field : f) System.out.println(field.getName());

        // c2 will point to same object where
        // c1 is pointing
        System.out.println("--------------------------------------");
        Student s2 = new Student();
        Class c2 = s2.getClass();
        System.out.println("c1 == c2: " + (c1 == c2));

        // String class is loaded by bootstrap loader, and
        // bootstrap loader is not Java object, hence null
        System.out.println("--------------------------------------");
        System.out.println(String.class.getClassLoader());
        System.out.println(Main.class.getClassLoader());
    }
}
