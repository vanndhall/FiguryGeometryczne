package figury;

public abstract class Shape {
    public abstract double getArea();
    public void showArea() {
        System.out.println("Pole = " + this.getArea());
    }
}
