package oop;

// Rectangle Class
class Rectangle {

    // Write Fields Here
    private int length;
    private int width;

    public Rectangle() {
        // Write your code here
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(int length, int width) {
        // Write your code here
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        // Write your code here
        return this.length * this.width;
    }

}
