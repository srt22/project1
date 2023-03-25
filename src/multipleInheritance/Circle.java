package multipleInheritance;
// A Circle is a Shape1 with a specific radius.
// this is child class
public class Circle extends Shape {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Shape[] shape = new Shape[2]; // creating shape array of size 2
        shape[0] = new Circle(2); // creating circle object at index 0
        shape[1] = new Rectangle(2,2); // creating rectangle object at index 1
        // Shape object is calling children classes method
        System.out.println("Area of the circle : " + shape[0].getArea());
        System.out.println("Area of the Rectangle : " + shape[1].getArea());

    }
}
