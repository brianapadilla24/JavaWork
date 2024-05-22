package org.example;

//checked and unchecked exceptions
//checked: checked for at compile time, makes you deal with at compile time
//java checks, before you compile and wont compile until you do

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        readFile("myFile.txt");
    }

    //you can also use:
    //private static void readFile (String fileName) throws FileNotFoundException {
    private static void readFile (String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        }
        catch (FileNotFoundException filenotfound) {
            System.out.println("Hey that file does not exist.");
        }
    }
}

