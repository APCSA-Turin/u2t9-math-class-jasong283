import java.util.Scanner;

public class MathClass{
    public static void main(String[]args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a decimal to round: ");
    double num = scan.nextDouble();
    System.out.println(Math.round(num));

    System.out.print("Now enter a negative number to find its absolute value: ");
    double abs = scan.nextDouble();
    System.out.println(Math.abs(abs));
    }
}
