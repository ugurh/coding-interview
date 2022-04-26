package java_8.lambda_expression;

public class Client {
    public static void say(Message message) {
        message.say();
    }

    public static void main(String[] args) {
        Message eng = new EnglishMessage();
        Message tr = new TurkishMessage();

        // Using OOP
        System.out.println("------Using OOP---------");
        say(eng);
        say(tr);

        // Using Lambda
        System.out.println("------Using Lambda---------");
        say(new Message() {
            @Override
            public void say() {
                System.out.println("Merhaba");
            }
        });
        // To make our code less cumbersome, create first lambda expression
        say(()-> System.out.println("Hello"));
    }
}
