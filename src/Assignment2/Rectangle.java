package Assignment2;

class Rectangle {
    double width;
    double length;

    Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        if (length >= 0 && width >= 0) {
            return length * width;
        } else {
            return 0;
        }
    }
}