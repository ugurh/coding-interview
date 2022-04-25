package exceptions;

public class Exceptions13 {

    public static void main(String args[]) {
        readFile("filename.text");
    }

    public static void readFile(String path) throws RuntimeException { //UncheckedException
        //code here
        System.out.println("Reading File");
    }
}
