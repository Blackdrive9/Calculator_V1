import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int value;
        boolean exit = false;
        String yn;

        System.out.println("******* CALCULATOR V1 *******\n");

        do {

            printMenu();

            System.out.print("-> ");
            if (in.hasNextInt()) {
                value = in.nextInt();
            } else {
                System.out.println("Invalid input, please enter an integer.");
                in.next(); // Consuma l'input errato dell'utente
                continue; // Torna al ciclo do-while
            }

            switch (value) {
                case 1:

                    Calculator c = new Calculator();

                    c.insert();

                    System.out.println("\nResult: " + c.getRis());

                    break;

                case 2:
                    System.out.println(
                            "-Enter the first number.\n-Enter the calculation operator.\n-Enter the second numberBoth integers and floating point numbers are allowed");

                    break;
                case 3:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid value!\n");
                    continue;
            }

            if (value != 3) {
                System.out.println("\nDo you want to make a new operation?(Y/n):");

                yn = in.next();

                if (!yn.equals("Y")) {
                    exit = true;
                }

            }

        } while (!exit);

        in.close();
    }

    public static void printMenu() {

        System.out.println("\n1. New data entry and calculation.");
        System.out.println("2. Instruction.");
        System.out.println("3. Exit.\n");

    }

}
