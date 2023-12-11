import java.util.Scanner;
/**
 * ATMGroup5
 */
public class ATMGroup5 {

    public static void main(String[] args) {
        Scanner GroupFifth = new Scanner (System.in);
        int DepositAmount         ; 
        int WithdrawalAmount      ; 
        int TotalWithdraw         ; 
        int TotalDeposit          ;
        int Balance = 1000000     ;
        String[] users = {"admin"};
        int[] PIN = {1234}        ;
        boolean isLoggedIn = false;
        int TransferAmount        ;
        int TotalTransfer         ; 
        int choice2 ;

        while (true) {
            System.out.println("\n"); 
            System.out.println("===========================================");
            System.out.println("          Welcome to ATM Aesthetic         ");
            System.out.println("===========================================");

            if (!isLoggedIn) {
                System.out.print("Enter user: ");
                String user = GroupFifth.nextLine();
                System.out.print("Enter PIN: ");
                int PINNow= GroupFifth.nextInt();


                boolean userFound = false;
                for (int i = 0; i < users.length; i++) {
                    if (user.equalsIgnoreCase(users[i]) && PINNow == PIN[i]) {
                        System.out.println("\n               Login Successful              ");
                        isLoggedIn = true;
                        userFound = true;
                        break;
                    }
                }

                if (!userFound) {
                    System.out.println("Login failed. Invalid user or PIN.");
                    GroupFifth.nextLine(); 
                    continue;
                }
            }

            System.out.println(" Choose : ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Info Balance");
            System.out.println("5. Change PIN");
            System.out.println("6. Logout");
            System.out.println("7. Exit");

            System.out.print("\nChoose Menu: ");
            int choice = GroupFifth.nextInt();

            switch (choice) {
            case 1:
            do {
                System.out.println("=================================================");
                System.out.println("                 Input Deposit:                   ");
                System.out.print("                   Rp.");
                DepositAmount = GroupFifth.nextInt();
                TotalDeposit = DepositAmount + Balance;
                System.out.println("    Your current balance is Rp  " +TotalDeposit       );
                System.out.println("=================================================");

                System.out.println("\n1.keluar");
                System.out.println("2.Kembali");
                System.out.print("\nPilih Menu : ");
                choice2 = GroupFifth.nextInt();

               switch (choice2) {
                   case 1:
                       System.out.println("Thank you. Goodbye!");
                       return;
               }
           } while (choice2 != 2);
             break;

            case 2: 
                do {
                System.out.println("=================================================");
                 System.out.println("                  Withdraw:                     ");
                 System.out.print("                    Rp.");
                WithdrawalAmount = GroupFifth.nextInt(); 
                if (WithdrawalAmount < Balance) {
                    TotalWithdraw = Balance - WithdrawalAmount;
                    System.out.println("\nTotal Withdraw : " + WithdrawalAmount);                    
                    System.out.println("your current balance : "+ TotalWithdraw);      
                    System.out.println("=================================================");                  
                } else {                    
                    System.out.println(" You don't have enough balance ");                        
                }                                   
                  System.out.println("\n1.keluar");
                 System.out.println("2.Kembali");
                 System.out.print("\nPilih Menu : ");
                 choice2 = GroupFifth.nextInt();

                 switch (choice2) {
                    case 1:
                    System.out.println("Thank you. Goodbye!");
                    return;
                 }
            } while (choice2 != 2);
                break;

            case 3: 
                do {
                System.out.println("=================================================");
                System.out.println("                    Transfer:                       " );
                System.out.print("                      Rp.");
                TransferAmount = GroupFifth.nextInt(); 
                if (TransferAmount < Balance) {
                    TotalTransfer = Balance - TransferAmount; 
                    System.out.println("\nTotal Transfer       : " + TransferAmount );
                    System.out.println("your current balance : " + TotalTransfer );
                } else {
                 System.out.println(" You don't have enough balance "); 
                }              
                System.out.println("=================================================");
                System.out.println("\n1.keluar");
                System.out.println("2.Kembali");
                System.out.print("\nPilih Menu : ");
                choice2 = GroupFifth.nextInt();

                switch (choice2) {
                    case 1:
                        System.out.println("Thank you. Goodbye!");
                        return;
                }
            } while (choice2 != 2);
            break;

            case 4:
            do {
                System.out.println("-------------------------------------------------");
                System.out.println("                   Info Balance                  ");
                System.out.println("         Your balance is Rp. " +    Balance         );
                System.out.println("-------------------------------------------------");
                System.out.println("\n1.keluar");
                System.out.println("2.Kembali");
                System.out.print("\nPilih Menu : ");
                choice2 = GroupFifth.nextInt();

                switch (choice2) {
                    case 1:
                        System.out.println("Thank you. Goodbye!");
                        return;
                }

            } while (choice2 != 2);
            break;
            
            case 5:
                    System.out.println("\nChange PIN: ");
                    System.out.print("Enter old PIN: ");
                    int OldPIN = GroupFifth.nextInt();

                    
                    boolean userFound = false;
                    for (int i = 0; i < users.length; i++) {
                        if (OldPIN == PIN[i]) {
                            System.out.print("Enter new PIN: ");
                            PIN[i] = GroupFifth.nextInt();
                            System.out.println("-------------------------------------------------");
                            System.out.println("           PIN changed successfully.             ");
                            System.out.println("-------------------------------------------------");
                            System.out.print("Do you want to log out? (y/n): ");
                            GroupFifth.nextLine(); 
                            String logoutChoice = GroupFifth.nextLine();
                            if (logoutChoice.equalsIgnoreCase("y")) {
                                System.out.println("Logging out...");
                                isLoggedIn = false;
                            }
                            userFound = true;
                            break;
                        }
                    }

                    if (!userFound) {
                        System.out.println("Old PIN is incorrect. Please contact the headquarters.");
                    }
                    break;

                case 6:
                    System.out.println("Logging out...");
                    isLoggedIn = false;
                    break;

                case 7:
                    System.out.println("Thank you. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid menu choice.");
                    break;
            }
        }

    }
}