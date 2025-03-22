package vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            menu();
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    System.out.println("\nEXIT");
                    break;
                default:
                    System.out.println("INVALID OPTION");
                    break;
            }

        } while (option != 0);

        scanner.close();
    }

    private static void menu() {
        System.out.print("""
                MENU:
                1. MOVE CAR X
                2. MOVE CAR Y
                3. SHOW DETAILS CAR
                4. SIMULATE COLLISION CAR
                5. REPAIR CAR
                6. REFILL CAR
                7. GET MONEY CAR
                0. LEAVE.
                OPTION (0 .. 8) ?\s""");
    }
}
