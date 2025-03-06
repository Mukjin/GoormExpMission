package java_middle.shapes;


public class Rectangle implements Shape {
    private double width;  // 직사각형의 너비
    private double height; // 직사각형의 높이

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;  // 직사각형의 면적 공식
    }
}
