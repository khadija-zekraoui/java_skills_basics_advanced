public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to calculate distance from this point to (0, 0)
    public double distance() {
        return distance(0,0);
    }

    // Method to calculate distance from this point to another Point
    public double distance(Point p) {
        return distance(p.getX(),p.getY());
    }

    // Method to calculate distance from this point to specific coordinates (x, y)
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
