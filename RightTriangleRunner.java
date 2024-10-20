public class RightTriangleRunner {
    public static void main(String[]args) {
        
        RightTriangle tri1 = new RightTriangle(3, 4);
        RightTriangle tri2 = new RightTriangle(6.5, 10.7);

        double x = tri1.hypotenuse();
        double y = tri2.hypotenuse();

        System.out.println(x);
        System.out.println(y);
    }
    
}
