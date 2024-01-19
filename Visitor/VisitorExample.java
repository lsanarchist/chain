// Приклад використання
public class VisitorExample {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        ShapeVisitor circleVisitor = new CircleVisitor();
        ShapeVisitor squareVisitor = new SquareVisitor();

        circle.accept(circleVisitor); // Виклик методу accept для круга
        square.accept(squareVisitor); // Виклик методу accept для квадрата
    }
}
