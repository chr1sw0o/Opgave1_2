import java.util.Scanner;

public class Opgave7 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Hvad vejer du: ");
        double weight = input.nextDouble();
        System.out.println("Hvor høj er du: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Din BMI er: " + bmi);

        input.close();
    }
}
