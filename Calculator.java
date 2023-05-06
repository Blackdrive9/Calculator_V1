import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    private double ris;

    public void insert() {

        Scanner in = new Scanner(System.in);

        double x, y;
        String op;

        System.out.println("\nEnter your data (a op b):");

        do {

            try {

                System.out.print("-> ");
                x = in.nextDouble();

                break;

            } catch (InputMismatchException e) {

                System.out.println("You must enter a number!");
                in.nextLine(); //consuma l'input errato
                continue;
            }

        } while (true);

        do {

            System.out.print("-> ");
            op = in.next();

            if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {

                break;
            }

            System.out.println("You must enter one of these operator: + - * /");

        } while (true);

        do {

            try {

                System.out.print("-> ");
                y = in.nextDouble();

                break;

            } catch (InputMismatchException e) {

                System.out.println("You must enter a number!");
                in.nextLine(); //consuma l'input errato
                continue;
            }

        } while (true);

        calcola(x, op, y);

    }

    public void calcola(double x, String op, double y) {

        if (op.equals("+")) {

            ris = x + y;

        } else if (op.equals("-")) {
            ris = x - y;
        } else if (op.equals("*")) {
            ris = x * y;
        } else if (op.equals("/")) {

            if (y != 0) {
                ris = x / y;
            } else {
                System.out.println("Math Error! Cannot divide by 0!");
            }
        }

    }

    public double getRis() {
        return ris;
    }

}
