public class AreaCalculator {
    public static double area(double radius) {

        if (radius < 0 ) {
            return -1.0;
        }
        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double x, double y) {

        if (x < 0 || y < 0 ) {
            return -1.0;
        }
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println("Area of a circle with radius 5 is: " + area(5));
        System.out.println("Area of a circle with radius -1 is: " + area(-1));

        System.out.println("Area of a Rectangle with (5.0, 4.0) is: " + area(5.0, 4.0));
        System.out.println("Area of a Rectangle with (-1.0, 4.0) is:: " + area(-1.0, 4.0));
    }
}
