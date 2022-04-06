package exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class Exceptions14 {
    public static void main(String[] args) {
        try {
            readFile("filename.text");
        } catch (Exception e) {
            //code to handle the exception
            System.out.print("Exception caught: " + e);
        }
    }

    public static void readFile(String path) throws SQLException, IOException { //Multiple exceptions declared

        System.out.println("Reading File");
        throw new IOException();
    }
}
