package Assignment2;

public class Cuboid extends Rectangle {
    double height;

    Cuboid(double height, double width, double length) {
        super(width, length);
        this.height = height;
    }

    public static void main(String[] args) {
        Cuboid rct = new Cuboid(10, 2, 5);
        System.out.println("Area " + rct.getArea());
        System.out.println("Length " + rct.getLength());
        System.out.println("Width " + rct.getWidth());
        System.out.println("Volume " + rct.getVolume());
    }

    public double getVolume() {
        if (height >= 0) {
            return height * super.getArea();
        } else {
            return 0;
        }
    }
}
