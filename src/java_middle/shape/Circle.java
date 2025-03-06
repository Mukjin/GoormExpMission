package java_middle.shape;

public class Circle implements Shape {
    private double radius;  // 원의 반지름

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;  // 원의 면적 공식
    }
}
