package question3;

@FunctionalInterface
interface ShapesArea {
    Double calculate(double length, double breadth);
}

public class Shapes {
    public static void main(String[] args) {
        ShapesArea calculateAreaOfRectangle = (double length, double width)-> length*width;
        ShapesArea calculateAreaOfTriangle = (double length, double width)-> 0.5*(length*width);

        double areaOfRectangle = calculateAreaOfRectangle.calculate(3,4);
        double areaOfTriangle = calculateAreaOfTriangle.calculate(3,4);

        System.out.println("Area of Rectangle is: "+ areaOfRectangle);
        System.out.println("Area of Triangle is: "+ areaOfTriangle);
    }
}
