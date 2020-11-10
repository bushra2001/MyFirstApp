package com.example.lib;
import java.util.ArrayList;
import java.util.Iterator;


public class HelloWorld {

    public void testFunc(){
        int count=0;
        System.out.println("Count is now "+ ++count);

    }

    public static void main(String args[]){

//        2) Write a Java program to create a new array list, add some colors (string) and print out the collection.
//        ArrayList nameArray= new ArrayList();
//        nameArray.add("Red");
//        nameArray.add("Green");
//        nameArray.add("Blue");
//        nameArray.add("orange");
//
//        Iterator iterator = nameArray.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        3) Write a Java program to remove the third element from the array list.





                HelloWorld helloWorld = new HelloWorld();
        helloWorld.testFunc();
Student student1 = new Student();
Student student2 = new Student();

student1.english=60;
student1.maths=50;
student1.science=80;

student2.science=30;
student2.maths=20;

student2.english=10;

        System.out.println("Marks of Student 1");
        System.out.println(student1.english);
        System.out.println(student1.maths);
        System.out.println(student1.science);
        System.out.println("Marks of Student 2");
        System.out.println(student2.english);
        System.out.println(student2.maths);
        System.out.println(student2.science);

        System.out.println("Student name is "+ Student.name);

        System.out.println("HELLO WORLD AND HELLO PAKISTAN");

        ArrayList nameArray= new ArrayList();
        nameArray.add("Romesa");
        nameArray.add("Urba");
        nameArray.add("Ayesha");
        nameArray.add("Bushra");

        Iterator iterator = nameArray.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}