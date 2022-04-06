package exceptions;

public class MyException19 {
    public static void main(String[] args) throws MyException {
        MyException19 f = new MyException19();
        try {
            f.readFile();
        } catch (MyException e) {
            f.readFile();
        } finally {
            f.deleteFile();
        }
    }

    public void readFile() throws MyException {
        throw new MyException();
    }

    public void deleteFile() throws RuntimeException {
        throw new NullPointerException();
    }
}


class MyException extends Exception {
}
