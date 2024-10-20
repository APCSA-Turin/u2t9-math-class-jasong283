public class CircleRunner {
    public static void main(String[]args) {
        Circle circ = new Circle(5);
        circ.area();
        circ.circumference();
        System.out.println(circ.getInfo());
        circ.setRadius(9.2);
        circ.area();
        circ.circumference();
        System.out.println(circ.getInfo());
    }
}
