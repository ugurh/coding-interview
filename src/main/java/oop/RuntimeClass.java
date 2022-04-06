package oop;

public class RuntimeClass {

    public static void main(String[] args) {
        getSystemInfo();
    }

    public static void getSystemInfo() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Free Memory : " + runtime.freeMemory());
        System.out.println("Max Memory : " + runtime.maxMemory());
        System.out.println("Total Memory : " + runtime.totalMemory());
        runtime.gc();
    }
}
