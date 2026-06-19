package edu.interfacelearning;

public class MainTest {
    public static void main(String[] args) {
      showShape(new Circle(5));
      showShape(new Rectangle(3,4));
    }
    public static void showShape(Shape shape){
        System.out.println(shape.getDescription());
    }
}
