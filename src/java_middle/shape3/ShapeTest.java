package java_middle.shape3;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(4, 3)
        };

        for (Shape shape : shapes) {
            System.out.println("도형의 면적: " + shape.area());
            if (shape instanceof Drawable) {
                ((Drawable) shape).draw();
            }
        }
    }
}