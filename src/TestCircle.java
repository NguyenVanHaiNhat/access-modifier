public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        circle.setRadius(5.2);
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());
        circle.setColor("blue");
        System.out.println(circle.getColor());
    }
}
