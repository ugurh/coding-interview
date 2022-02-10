package generics;

public class MultipleTypesUsingGenerics {

    public static void main(String[] args) {
        print("Harun", 18.25, 2022);
    }

    public static <T1, T2, T3> void print(T1 t1, T2 t2, T3 t3) {
        System.out.println("T1 :" + t1);
        System.out.println("T2 :" + t2);
        System.out.println("T3 :" + t3);
    }
}
