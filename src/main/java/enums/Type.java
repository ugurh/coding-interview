package enums;

public enum Type {
    BYTE(0),
    INT(4);
    final int size;

    Type(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

class Client {
    public static void main(String[] args) {
        System.out.println(Type.BYTE.getSize());
    }
}
