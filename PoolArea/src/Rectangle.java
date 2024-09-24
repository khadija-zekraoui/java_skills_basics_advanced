public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double height) {
        this.width = width < 0 ? 0 : width;
        this.length = height < 0 ? 0 : height;;
    }

    public double getArea() {
        return width * length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
