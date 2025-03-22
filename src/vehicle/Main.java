package vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car(0, 0, 1000, true, Refillable.CAR);

        int option;
        do {
            menu();
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: // MOVE X
                    if (!car.move('x')) System.out.println("Move denied");
                    break;
                case 2: // MOVE Y
                    if (!car.move('y')) System.out.println("Move denied");
                    break;
                case 3: // SHOW DETAILS
                    System.out.println("\n" + car);
                    break;
                case 4: // SIMULATE COLLISION
                    car.collision();
                    break;
                case 5: // REPAIR
                    car.repair();
                    break;
                case 6: // REFILL
                    car.refill();
                    break;
                case 7: // GET MONEY
                    System.out.print("Extract money: ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    car.setMoney(amount);
                    break;
                case 0: // LEAVE
                    System.out.println("\nLEAVING...");
                    break;
                default:
                    System.out.println("INVALID OPTION. TRY AGAIN");
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
