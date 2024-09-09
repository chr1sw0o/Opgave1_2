import java.util.Scanner;

public class Opgave4 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        double radius;
        System.out.println("Hvad er radius af din cirkel:");


        radius = input.nextDouble();
        System.out.println("Areal af din cirkel er: " + Math.PI * radius * radius);
        System.out.println("Omkredsen af din cirkel er: " + Math.PI * Math.PI * radius);

    }
}
