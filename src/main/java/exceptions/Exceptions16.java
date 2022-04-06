package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions16 {
    public static void main(String args[]) {
        Parent p = new Parent();
        try {
            p.readFile("filename.txt");
        } catch (Exception e) {
            System.out.print("Exception caught: " + e);
        }
    }
}

interface filing {
    public void readFile(String path) throws IOException;
}

class Parent implements filing {

    //Won't compile
    //Exception is a Parent class of IOException
    // public void readFile(String path) throws Exception{ // throws a parent class
    // }

    //Will compile
    //FileNotFoundException is a child class of IOException
    public void readFile(String path) throws FileNotFoundException { // Sub class of IOException
        throw new FileNotFoundException();
    }
}
