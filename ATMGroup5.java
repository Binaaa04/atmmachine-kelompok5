import java.util.Scanner;

public class ATMGroup5 {

    public static void main(String[] args) {
        Scanner GroupFifth = new Scanner (System.in);
        int Deposit, Withdraw, Balance = 50000
        ,Transfer,choice2, Choose,  index =0 , index2 =0 , index3 =0, fill;
        String[] users = {"admin", "admin2"};
        int[] PIN = {1234}                                     ;
        boolean isLoggedIn = false;
        int[] addBalance=new int[20], pullBalance=new int[20]  ;

            System.out.println("\n"); 
            System.out.println("===========================================");
            System.out.println("          Welcome to ATM Aesthetic         ");
            System.out.println("===========================================");

        
        while (true) {
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
            System.out.println("\n"); 
            System.out.println("===========================================");
            System.out.println("          Welcome to ATM Aesthetic         ");
            System.out.println("===========================================");
            System.out.println("| Choose :                                 |");
            System.out.println("|1. Deposit                                |");
            System.out.println("|2. Withdraw                               |");
            //lupsaSystem.out.println("3. Transfer");
            System.out.println("|4. Check Balance                          |");
            System.out.println("|5. History                                |");
            System.out.println("|6. Change PIN                             |");
            System.out.println("|7. Logout                                 |");
            System.out.println("|8. Exit                                   |");

            System.out.print("\nChoose Menu: ");
            Choose = GroupFifth.nextInt();
            
            switch (Choose) {
            case 1:
            do{
                System.out.println("=================================================");
                System.out.println("   Enter The Amount Of Money You Want To Save  ");
                System.out.print("     Rp. ");
                Deposit = GroupFifth.nextInt();
                addBalance[index] = Deposit;
                index++;
                Balance += Deposit;
                System.out.println("  Saldo Anda adalah Rp. " + Balance);
                System.out.println("=================================================");
                System.out.println("\n1.Exit");
                System.out.println("2.Back ");
                System.out.print("\nPilih Menu : ");
                choice2 = GroupFifth.nextInt();
                switch (choice2) {
                        case 1:
                        System.exit(0);
                        break;                        
                        }
                }while(choice2!=2);
                break;    
            case 2: 
            do{
                System.out.println("=================================================");
                System.out.println("   Enter The Amount Of Money You Want To Take    ");
                System.out.print("     Rp. ");
                Withdraw = GroupFifth.nextInt();
                pullBalance[index2]=Withdraw;
                index2++;
                fill = Balance;
                if (fill <= 50000) {
                System.out.println("Saldo Minimal setelah pengambilan harus Rp.50000");
                } else {
                Balance -= Withdraw;
                System.out.println("Saldo Anda adalah Rp. " + Balance);
                }
                System.out.println("=================================================");
                System.out.println("\n1.Exit");
                System.out.println("2.Back");
                System.out.print("\nPilih Menu : ");
                choice2 = GroupFifth.nextInt();
                switch (choice2) {
                        case 1:
                        System.exit(0);
                        break;
                        
                        }
                }while(choice2 != 2);
                break;
                
            case 3:
                
            
            case 4:
            do{
                System.out.println("=================================================");
                System.out.println("                    Check Balance                ");
                System.out.println("       Saldo Anda adalah Rp. " + Balance       );
                System.out.println("=================================================");
                System.out.println("\n1.keluar");
                System.out.println("2.Kembali");
                System.out.print("\nPilih Menu : ");
                choice2 = GroupFifth.nextInt();
                switch (choice2) {
                        case 1:
                        System.exit(0);
                        break;
                        
                        }
                }while(choice2 != 2);
                break;
            
            case 5:          
            do {
                System.out.println("=================================================");
                System.out.println("                History Transaksi                ");
                System.out.println("Deposit History");
                for (int y=0; y<index; y++){
                System.out.println((y+1)+" "+addBalance[y]);}
                System.out.println("Withdraw History");
                for (int z=0; z<index2; z++){
                System.out.println((z+1)+" "+pullBalance[z]);}
                System.out.println("=================================================");
                System.out.println("\n1.keluar");
                System.out.println("2.Kembali");
                System.out.print("\nPilih Menu : ");
                choice2 = GroupFifth.nextInt();              
                switch (choice2) {
                        case 1:
                        System.exit(0);
                        break;                        
                        }
                }while(choice2 != 2);
                break;
            
            
            case 6:
            System.out.println("\nChange PIN: ");
                    System.out.print("Enter old PIN: ");
                    int OldPIN = GroupFifth.nextInt();

                    
                    boolean userFound = false;
                    for (int i = 0; i < users.length; i++) {
                        if (OldPIN == PIN[i]) {
                            System.out.print("Enter new PIN: ");
                            PIN[i] = GroupFifth.nextInt();
                            System.out.println("=================================================");
                            System.out.println("           PIN changed successfully.             ");
                            System.out.println("=================================================");
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

                case 7:
                    System.out.println("Logging out...");
                    isLoggedIn = false;
                    break;

                case 8:
                    System.out.println("Thank you. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid menu choice.");
                    break;
            }
        }
    }
}