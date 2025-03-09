package java_middle.shape3;


public class Rectangle extends Shape implements Drawable {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("직사각형을 그립니다.");
    }
}
