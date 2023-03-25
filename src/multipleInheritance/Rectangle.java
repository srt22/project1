package multipleInheritance;
// a Rectangle is a Shape with a specific width and height.
// this is parent class
public class Rectangle extends Shape {    // extended from the Shape class
    private double width;
    private double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }


    public double getArea() {
        return width * height;
    }
}

