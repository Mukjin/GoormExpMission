package java_middle.rectangle;

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("넓이: " + rect.getArea());
        System.out.println("둘레: " + rect.getPerimeter());
    }
}

