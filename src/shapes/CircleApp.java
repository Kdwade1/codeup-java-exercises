package shapes;
import until.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input in= new Input();
        System.out.println("Create a circle.");
        Circle circle= new Circle(in.getDouble());
        System.out.println();
        circle.getCircumgerence();
        circle.getArea();
    }
}
