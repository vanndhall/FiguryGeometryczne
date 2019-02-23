package figury;

public class Square extends Shape{
    private double side;
    public Square() {}
    public Square(double side) {
        this.side = side;
    }
    public double getArea() {
        return side*side;
    }
}
