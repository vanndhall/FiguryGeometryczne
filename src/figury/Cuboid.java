package figury;

public class Cuboid extends Square {
    public Cuboid(double side) {
        super(side);
    }
    @Override
    public double getArea() {
        return super.getArea()*6;
    }
}
