import java.util.scanner;
    public class Area {
    public static void main(String[] args) {
        int r,l, b, perimeter, area;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the radius:");
        r = s1.nextInt();
        System.out.println("Enter the breadth:");
        b=s1.nextInt();
        System.out.println("Enter the length:");
        l=s1.nextInt();
        double circleArea = calculateArea(r);
        double rectangleArea = calculateArea(l, w);

        System.out.println("Area of circle: " + circleArea);
        System.out.println("Area of rectangle: " + rectangleArea);
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }
}