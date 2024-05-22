package org.example;

import java.sql.SQLOutput;
//runtime exception
//unchecked exceptions:
public class uncheckedExceptions {
    public static void main(String[] args) {
        String name = null; //what happen if we set the name to null?
        printLength(name);
    }

    private static void printLength (String myString) {
        try {
            System.out.println(myString.length());
        } catch (NullPointerException n) {
            System.out.println("String cannot be null");
        }
    }
}

//we end up passing null into the parameter printLength, then when it
//tries to call the parameter and call the length method, it is
//going to get a null pointer exception
//it will get a null pointer exception

//java will not give us compilation error, because null pointer exception
//is an unchecked exceptions.
//to fix it you will put a throws NullPointerException or a try catch exception

//java has a parent class called throwable: Error and Exception are a subclass of throwable
//one subclass of Exception is RuntimeException
//subclasses of RuntimeException are unchecked exception, everything else is a checked excpetion