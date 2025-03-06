package java_middle.shape;


public class Triangle implements Shape {
    private double base;   // 삼각형의 밑변
    private double height; // 삼각형의 높이

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;  // 삼각형의 면적 공식
    }
}
