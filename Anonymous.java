
package com.mycompany.java8;

abstract class Student{
    abstract void start();
}
public class Anonymous {
    public static void main(String[]args)
    {
        Student s1 =  new Student()
        {
            @Override
            void start(){
                System.out.println("nice work");
            }
        };
        s1.start();
    }
    
}
