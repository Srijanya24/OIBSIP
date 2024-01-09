import java.util.Scanner;

public class OnlineReservationSystem {

    private static boolean[] seats = new boolean[10]; 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {


            System.out.println("\nPlease select an option:");
            System.out.println("1. View Login Form");
            System.out.println("2. Reservation Form");
            System.out.println("3. CancellationForm");
            System.out.println("4. Exit");


            int option = scanner.nextInt();



            switch (option) {

                case 1:
                    viewLoginForm();
                    break;

                case 2:
                    reservationForm();
                    break;

                case 3:
                    cancellationForm();
                    break;

                case 4:
                    System.exit(0); 

                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private static void viewLoginForm() {
        System.out.println("\nCurrent Seat Login:");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                System.out.print("X "); 
            } else {
                System.out.print((i + 1) + " "); 
            }
        }
        System.out.println();
    }

    private static void reservationForm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter seat number (1-10): ");
        int seatNumber = scanner.nextInt();
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number!");
        } else if (seats[seatNumber - 1]) {
            System.out.println("Seat already reserved!");
        } else {
            seats[seatNumber - 1] = true; 
            System.out.println("Seat reserved!");
        }
    }

    private static void cancellationForm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter seat number (1-10): ");
        int seatNumber = scanner.nextInt();
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number!");
        } else if (!seats[seatNumber - 1]) {
            System.out.println("Seat not reserved!");
        } else {
            seats[seatNumber - 1] = false; 
            System.out.println("Reservation canceled!");
        }
    }
}
