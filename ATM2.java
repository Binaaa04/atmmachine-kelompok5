import java.util.Scanner;

public class ATM2 {
    private static int balance = 10000; // Initial balance

    private static boolean pinIsValid(int pin) {
        // Replace with your PIN validation logic
        return pin == 1234;
    }

    private static void deposit(int nominal) {
        balance += nominal;
        System.out.println("Deposit successful. cash deposit: " + balance);
    }

    private static void pull(int nominal) {
        if (balance >= nominal) {
            balance -= nominal;
            System.out.println("Pull successful. cash withdrawals: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    private static void transaction(int nominal) {
        if (balance >= nominal) {
            balance -= nominal;
            System.out.println("Transaction successful. transaction payment: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    private static void showMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Deposit");
        System.out.println("2. Pull");
        System.out.println("3. Transaction");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        int pin = scanner.nextInt();

        if (pinIsValid(pin)) {
            int choice;
            do {
                showMenu();
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the nominal to deposit: ");
                        int nominalDeposit = scanner.nextInt();
                        deposit(nominalDeposit);
                        break;
                    case 2:
                        System.out.print("Enter the nominal to pull: ");
                        int nominalPull = scanner.nextInt();
                        pull(nominalPull);
                        break;
                    case 3:
                        System.out.print("Enter the transaction nominal: ");
                        int transactionNominal = scanner.nextInt();
                        transaction(transactionNominal);
                        break;
                    case 4:
                        System.out.println("Exiting the program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } while (choice != 4);
        } else {
            System.out.println("Invalid PIN. Please try again.");
        }

        scanner.close();
    }
}
