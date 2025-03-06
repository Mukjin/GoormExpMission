package java_middle.shapes;


public class ShapeTest {
    public static void main(String[] args) {
        // 도형 객체 배열 생성
        Shape[] shapes = new Shape[3];

        // 도형 객체들 생성
        shapes[0] = new Circle(9);
        shapes[1] = new Rectangle(3, 2);
        shapes[2] = new Triangle(3, 6);

        // 각 도형의 면적 출력
        for (Shape shape : shapes) {
            System.out.println("도형의 면적: " + shape.area());
        }
    }
}
