interface Shape {
    void draw();
}

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draawing a circle here!");
    }

}

public static void main(String[] args) {
    Circle circle1 = new Circle();
    System.out.println(circle1.draw());
}