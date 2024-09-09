import java.util.Scanner;


public class Opgave2 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
String navn;
int alder;
float yndlings;
        System.out.println("Hvad er dit navn:" );
        navn = input.nextLine();
        System.out.println("Hvad er din alder:" );
        alder = input.nextInt();
        System.out.println("Hvad er dit yndlingsdecimal:");
        yndlings = input.nextFloat();

        System.out.println(navn);
        System.out.println(alder);
        System.out.println(yndlings);


    }
}
