import java.util.Scanner;

public class Opgave6 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int timer;
        System.out.println("Hvor mange timer vil du have konverteret: ");
                timer = input.nextInt();

                System.out.println(timer + " 2" + " timer er " + timer * 3600 + " sekunder");



    }
}
