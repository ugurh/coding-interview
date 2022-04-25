package exceptions;

import java.io.IOException;

public class Exceptions15 {
    public void readFile(String path) throws IOException {
        //reads file
    }
}

class Child extends Exceptions15{

    public void readFile(String path) throws IOException {
        // method overrriden
        throw new IOException();
    }

}
