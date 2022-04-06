package java8;

public class SystemParams {

    public static void main(String[] args) {
        String model = System.getProperty("sun.arch.data.model");
        System.out.println("Model : " + model);

        int i = Integer.MAX_VALUE;
        byte b = (byte) i; // lose 24 bit

        System.out.println("i : " + i); // 32 bit
        System.out.println("b : " + b); //  8 bit

    }
}
