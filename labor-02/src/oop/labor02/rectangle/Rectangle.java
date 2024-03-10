package oop.labor02.rectangle;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double area(double length, double width) {
        return length * width;
    }

    public double perimeter(double length, double width) {
        return 2 * (length + width);
    }
}
