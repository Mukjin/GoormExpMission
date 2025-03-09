package java_middle.shape3;

public class Triangle extends Shape implements Drawable {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("삼각형을 그립니다.");
    }
}