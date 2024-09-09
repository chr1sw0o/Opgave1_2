import java.util.Scanner;

public class Opgave5 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        double længde;
        int sider = 4;
        System.out.println("Hvad er længden på din kvadrant: ");

        længde = input.nextDouble();
        System.out.println("Arealet af din kvadrant er: " + længde * længde);
        System.out.println("Omkredsen af din kvadrant er: " + længde * sider);

    }
}
