package java_middle.shape;


public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];


        shapes[0] = new Circle(5);        // 반지름 5인 원
        shapes[1] = new Rectangle(4, 6);  // 너비 4, 높이 6인 직사각형
        shapes[2] = new Triangle(4, 3);   // 밑변 4, 높이 3인 삼각형

        for (Shape shape : shapes) {
            System.out.println("도형의 면적: " + shape.area());
        }
    }
}

