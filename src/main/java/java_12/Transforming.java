package java_12;

public class Transforming {

    public static void main(String[] args) {
        String str = "1000";
        Integer integer = str.transform(Integer::parseInt);
        System.out.println(integer);
    }

}
