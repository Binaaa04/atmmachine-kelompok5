import java.util.Scanner;

/**
 * AtmMachineGroup5
 */
public class Trialatm {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declare, inisialisasi
        int DepositAmount , WithdrawalAmount , TotalWithdraw , TotalDeposit, Balance = 50000, i=0 , 
            choose, choose2=0 , TransferAmount, TotalTransfer, InfoBalance ,  Pin = 1234, add, fill, index, index2=0 ;
        int[] AddBalance=new int[20], WithdrawBalance=new int[20]; 
        String user = "" ;

        for(i=0; i<=2; i++){

            System.out.println("=================================================");
            System.out.println("          Selamat Datang Di ATM Polinema 5       ");
            System.out.println("=================================================");
            
                System.out.print("Masukan user : ");
                user = sc.nextLine();
                System.out.print("Masukan PIN : ");
                Pin = sc.nextInt();
                if( (user.equalsIgnoreCase("admin")) && (Pin==1234) ){ 
                System.out.println("\n               Login Berhasil              ");        
                i=5;
                    while (true) {                        
                        System.out.println("\nmenu"       );       
                        System.out.println("Choose : " );
                        System.out.println("1. Deposit" );
                        System.out.println("2. Withdraw");
                        System.out.println("3. Transfer");
                        System.out.println("4. Info Balance");
                        System.out.print("\nPilih Menu : ");
                        choose = sc.nextInt();

                        switch (choose) {                          
                        case 1:
                        do {
                            System.out.println("Deposit : ");
                            System.out.print("Rp. ");
                            DepositAmount = sc.nextInt();
                            TotalDeposit = DepositAmount + Balance;
                            System.out.println("Total Deposit : " +TotalDeposit);
                            switch (choose2) {
                                    case 1:
                                    System.exit(0);
                                    break;}                                
                            } while (choose2!= 2);
                        break;                           
                        case 2: 
                                System.out.println("\nWithdraw : ");
                                WithdrawalAmount = sc.nextInt(); 
                                if (WithdrawalAmount < Balance) {
                                    TotalWithdraw = Balance - WithdrawalAmount;
                                    System.out.println("Total Withdraw : " + WithdrawalAmount);                    
                                    System.out.println("Saldo anda seakrang : "+ TotalWithdraw);
                                    AddBalance[index2]=WithdrawalAmount;
                                    index2++;                       
                                } else {                    
                                    System.out.println("Saldo anda tidak mencukupi ");                        
                                }                                   
                        break; 
                        case 3: 
                                System.out.println("Transfer : " );
                                TransferAmount = sc.nextInt(); 
                                if (TransferAmount < Balance) {
                                    TotalTransfer = Balance - TransferAmount; 
                                    System.out.println("Total Transfer : " + TotalTransfer);
                                } else {
                                    System.out.println("Saldo anda tidak mencukupi "); 
                                }                                    
                                break;
                            case 4:
                                System.out.println("infoBalance " + Balance);
                                break;
                            default:
                            break;
                            }
                    }
                        
                } else {
                    System.out.println("user atau password Salah silakan coba lagi");
                    }
                
        }   
    }
}