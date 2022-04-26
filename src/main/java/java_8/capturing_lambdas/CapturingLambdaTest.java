package java_8.capturing_lambdas;

import java.util.function.UnaryOperator;

public class CapturingLambdaTest {

    static int k = 0; // Using Static variable

    public static void main(String[] args) {
        int i = 5; // Here is an EFFECTIVELY FINAL, because variable is not be changed
       //  i = 7; Compile Error, This is NOT EFFECTIVELY FINAL
        k = 10;
        UnaryOperator<Integer> unary = (input) ->  input * i * k;
        unary.apply(7);


    }
}
