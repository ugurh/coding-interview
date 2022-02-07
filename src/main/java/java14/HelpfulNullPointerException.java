package java14;

public class HelpfulNullPointerException {

    public static void main(String[] args) {

        String name = null;
        if (name.contains("w")) {
            System.out.println("w is exists");
        }
    }

}
