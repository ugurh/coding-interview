package exceptions;

public class Exceptions2 {

    public static void main( String[] args ) {

        try{
            throw new NullPointerException(); // exception 1
            // throw new ArithmeticException();  // Unreachable statement
        }catch(Exception e){
            System.out.print(e);
        }

    }

}


