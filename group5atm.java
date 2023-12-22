import java.util.Date;
import java.util.Scanner;


/**
 * group5atm
 */
public class group5atm {

    

    static int Balance = 50000;
    static int[] addBalance = new int[10];
    static int[] sendBalance = new int[10];
    static int[] pullBalance = new int[10];
    static String[] users = { "admin1", "admin2" };
    static int[] PIN = { 1234,5678};
    static int Deposit = 0;
    static int Withdraw = 0;
    static int Transfer = 0;

    public static void main (String[] args) {
    Login();
    menu();
    }

    public static int Deposit() {
        Scanner GroupFifth = new Scanner(System.in);
        int choose;
        int index1 = 0;
        

        System.out.println("=================================================");
        System.out.println("   Enter The Amount Of Money You Want To Save  ");
        System.out.print("     Rp. ");
        Deposit = GroupFifth.nextInt();
        addBalance[index1] = Deposit;
        index1++;
        Balance += Deposit;
        System.out.println("  Your Balance is Rp. " + Balance);
        System.out.println();
        printReceipt(1,Deposit, Balance);
        System.out.println("=================================================");
        System.out.println("1.Back to the menu");
        System.out.println("2.Exit");
        System.out.print("\nSelect Menu :");
        choose = GroupFifth.nextInt();
        switch (choose) {
            case 1:
                menu();
                break;
            case 2:
                System.exit(2);
                break;
        }
        return Deposit;
    }

    public static int Withdraw() {
        Scanner GroupFifth = new Scanner(System.in);
        int Take = 0;
        int choose;
        int index2 = 0;

        System.out.println("=================================================");
        System.out.println("   Enter The Amount Of Money You Want To Take    ");
        System.out.print("     Rp. ");
        Withdraw = GroupFifth.nextInt();
        pullBalance[index2] = Withdraw;
        index2++;
        Take = Balance;
        if (Withdraw <= Take) {
            Balance -= Withdraw;
            System.out.println("Your balance is Rp. " + Balance);
        } else {
            System.out.println("The minimum balance after collection must be Rp.50000");
        }

        System.out.println();
        printReceipt(2, Withdraw, Balance);
        System.out.println("=================================================");
        System.out.println("1.Back to the menu");
        System.out.println("2.Exit");
        System.out.print("\nSelect Menu : ");
        choose = GroupFifth.nextInt();
        switch (choose) {
           case 1:
                menu();
                break;
            case 2:
                System.exit(2);
                break;
        }
        return Withdraw;
    }
    

    public static int Transfer() {
        Scanner groupFifth = new Scanner(System.in);
        int transferIndex = 0;
        int receiverTransfer = 0;

        System.out.println("=================================================");
        System.out.println("   Enter The Amount Of Money You Want To Send    ");
        System.out.print("     Rp. ");
        Transfer = groupFifth.nextInt();
        sendBalance[transferIndex] = Transfer;
        transferIndex++;

        System.out.println("Select receiver:");
        displayUsers();
        receiverTransfer = groupFifth.nextInt();

       if (Balance < Transfer) {
            System.out.println("Your balance is not enough.");
        } else {
            Balance -= Transfer;
            System.out.println("Your Balance is Rp. " + Balance);
            sendBalance[0] = transferIndex   ;
            sendBalance[1] = receiverTransfer;
            transferIndex++;
            
            System.out.println();
            printReceipt(3, Transfer, Balance);

            System.out.println("=================================================");
            System.out.println("1.Back to the menu");
            System.out.println("2.Exit");
            System.out.print("\nSelect Menu : ");
            int choose = groupFifth.nextInt();
            switch (choose) {
                case 1:
                    menu();
                    break;
                case 2:
                    System.exit(2);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        return Transfer;
    }

    public static void displayUsers(){
        System.out.println("1. admin 1");
        System.out.println("2. admin 2 ");
        System.out.print("choose user :");;
    
    }

    public static void checkBalance() {
        Scanner GroupFifth = new Scanner(System.in);
        int checkBalance = 0;
        System.out.println("=================================================");
        System.out.println("                    Check Balance                ");
        System.out.println("             Your saldo is Rp. " + Balance);
        System.out.println("=================================================");
        System.out.println("\n1. Back to the menu");
        System.out.println("2.Exit");
        System.out.print("\nchoose menu : ");
        checkBalance = GroupFifth.nextInt();
        switch (checkBalance) {
            case 1:
                menu();
                break;
            case 2:
                System.exit(2);
                break;
    
        }
    }

    public static void printReceipt(int transactionType, int amount, int currentBalance) {
        Date date = new Date();
        String transactionTypeName = getTransactionTypeName(transactionType);

        System.out.println("=============================================");
        System.out.println("            ATM transaction receipt          ");
        System.out.println("=============================================");
        System.out.println("Date/time: " + date);
        System.out.println("Transaction type: " + transactionTypeName);
        System.out.println("Nominal: Rp. " + amount);
        System.out.println("Final balance: Rp. " + currentBalance);
    }


    public static String getTransactionTypeName(int transactionType) {
        switch (transactionType) {
            case 1:
                return "Deposit";
            case 2:
                return "Withdraw";
            case 3:
                return "Transfer";
            default:
                return "Unknown";
        }
    }

    public static void menu() {
        Scanner GroupFifth = new Scanner(System.in);
        int menu = 0;
        System.out.println("\n");
        System.out.println("===========================================");
        System.out.println("|           Welcome to ATM Fifth           |");
        System.out.println("===========================================");
        System.out.println("| Choose :                                 |");
        System.out.println("|1. Deposit                                |");
        System.out.println("|2. Withdraw                               |");
        System.out.println("|3. Transfer                               |");
        System.out.println("|4. Check Balance                          |");
        System.out.println("|5. History Transaction                    |");
        System.out.println("|6. Change PIN                             |");
        System.out.println("|7. Exit                                   |");
        System.out.println("============================================");
        System.out.print("\nChoose Menu: ");
        menu = GroupFifth.nextInt();
        switch (menu) {
            case 1:
                Deposit();
                break;
            case 2:
                Withdraw();
                break;
            case 3:
                Transfer();
                break;
            case 4:
                checkBalance();
                break;
            case 5 :
            HistoryTransaction();
            break;
            case 6:
            changePin();
                break;

            case 7:
            System.exit(2);
                break;
                default:
                    System.out.println("Invalid choice. please try again!");
                    break;
        }
    }

    public static int changePin() {
        Scanner GroupFifth = new Scanner(System.in);
        int OldPIN;
        boolean changePin = false;

        do {
            System.out.println("\nChange PIN: ");
            System.out.print("Enter old PIN: ");
            OldPIN = GroupFifth.nextInt();
            boolean userFound = false;

            for (int i = 0; i < users.length; i++) {
                if (OldPIN == PIN[i]) {
                    System.out.print("Enter new PIN: ");
                    PIN[i] = GroupFifth.nextInt();
                    System.out.println("=================================================");
                    System.out.println("           PIN changed successfully.             ");
                    System.out.println("=================================================");

                    int choice;
                    do {
                        System.out.println("1. Logout");
                        System.out.println("2. Login again");
                        System.out.print("Select Menu: ");
                        choice = GroupFifth.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("Logging out...");
                                System.exit(2);
                                break;
                            case 2:
                                GroupFifth.nextLine();
                                Login();
                                menu();
                                break;

                            default:
                                System.out.println("Invalid choice. Please try again.");
                                
                        }
                    } while (choice != 1 && choice != 2);

                    userFound = true;
                    break;
                }
            }

            if (!userFound) {
                System.out.println("Old PIN is incorrect. Please try again.");
            }
        } while (!changePin);
        return 0;
    }

    public static void HistoryTransaction() {

            System.out.println("=================================================");
            System.out.println("              Transaction History               ");
            System.out.println("=================================================");
            System.out.println("history of incoming money");
            for (int y=0; y<Deposit; y++){
                System.out.println((y+1)+" "+Deposit);
                break;
        }
            System.out.println("history of outgoing money");
            for (int i = 0; i < Transfer; i++) {
                System.out.println((i+1)+" "+Transfer);
                break;
            }
            for (int z=0; z<Withdraw; z++){
                System.out.println((z+1)+" "+Withdraw);
                break;
        }
            System.out.println("=================================================");
            System.out.println();
    }
    
        
    public static int Login() {
        int Login = 0;
        Scanner GroupFifth = new Scanner(System.in);
        String user;
    
        System.out.println("\n===========================================");
        System.out.println("           Welcome to ATM Fifth         ");
        System.out.println("===========================================");
    
        while (true) {
            System.out.print("Enter user: ");
            user = GroupFifth.nextLine();
            System.out.print("Enter PIN: ");
            int PINNow = GroupFifth.nextInt();
            GroupFifth.nextLine(); 
    
            boolean userFound = false;
    
            for (int i = 0; i < users.length; i++) {
                if (user.equalsIgnoreCase(users[i]) && PINNow == PIN[i]) {
                    System.out.println("\n               Login Successful              ");
                    Login = 1; 
                    userFound = true;
                    break; 
                }
            }
    
            if (!userFound) {
                System.out.println("Login failed. Invalid user or PIN.");
            } else {
                break; 
            }
        }
    
        return Login;
    }
    
    }
