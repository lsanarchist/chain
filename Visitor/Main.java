
// Інтерфейс Visitor
interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Square square);
}

// Абстрактний клас фігури
abstract class Shape {
    abstract void accept(ShapeVisitor visitor);
}

// Реалізація конкретної фігури - круга
class Circle extends Shape {
    @Override
    void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

// Реалізація конкретної фігури - квадрата
class Square extends Shape {
    @Override
    void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

// Конкретний клас Visitor, який виконує певну операцію для круга
class CircleVisitor implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Обробка круга");
    }

    @Override
    public void visit(Square square) {
        System.out.println("Обробка квадрата");
    }
}

// Конкретний клас Visitor, який виконує певну операцію для квадрата
class SquareVisitor implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        // Тут може бути власна реалізація для круга, але тут пусто, бо цей Visitor реалізує операцію лише для квадрата
    }

    @Override
    public void visit(Square square) {
        System.out.println("Обробка квадрата");
    }
}

