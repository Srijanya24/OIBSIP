import java.util.*;

public class BankAccount {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        UserAccount a=new UserAccount();
        System.out.println("<---WELCOME TO AUTOMATED TELLER MACHINE(ATM)--->");
        System.out.print("Enter username : ");
        if(a.checkUserName(sc.nextLine()))
        {
            System.out.println("ENTERED USERNAME IS INCORRECT! KINDLY ENTER THE CORRECT USERNAME.");
        }
        else{
            System.out.print("Enter your PIN : ");
            if(sc.nextInt() != a.getpin()){
                System.out.println("ENTERED VALUE IS INCORRECT! KINDLY ENTER THE CORRECT NUMBER.");
            }
            else{
                System.out.println("\nENTERED DETAILS ARE VALID.\n");
            }
            while(true){
                System.out.print("\n\nEnter the numbers(1-6) to perform your choice of operation: ");
                System.out.println("\n1. Amount Deposited\n2. Withdraw\n3. Deposit\n4. Transfer\n5. Balance\n6. Quit\n");
                switch(sc.nextInt()){
                    case 1:
                        if(a.getBalance()<100000) System.out.println("\nWithdrawl Amount :  "+(100000-a.getBalance())+"\n");
                        else System.out.println("\nDeposited amount : "+(a.getBalance()-100000));
                        break;
                    case 2:
                        System.out.print("\nEnter the amount to withdraw from your account : ");
                        int am=sc.nextInt();
                        if(am>a.getBalance()){
                            System.out.println("SUFFICIENT FUNDS HAVE NOT BEEN MET. KINDLY CHECK YOUR BALANCE AND TRY AGAIN.");
                        }
                        else{
                            System.out.println("\nYour Balance : "+a.withdraw(am));
                        }
                        break;
                    case 3:
                        System.out.print("\nEnter an amount to deposit in your account : ");
                        int am1=sc.nextInt();
                        System.out.println("Your Balance : "+a.credit(am1));
                        break;
                    case 4:
                        System.out.print("\nEnter the A/C Name to transfer : "); 
                        String otherPerson = sc.next();
                        System.out.print("Enter the amount : ");
                        int am2=sc.nextInt();
                        if(am2>a.getBalance()){
                            System.out.println("SUFFICIENT FUNDS HAVE NOT BEEN MET. KINDLY CHECK YOUR BALANCE AND TRY AGAIN.");
                        }
                        else{
                            System.out.println("\nAMOUNT HAS BEEN SUCCESSFULLY TRANSFERED TO "+otherPerson);
                            System.out.println("Your balance after transfer : "+a.withdraw(am2));
                        }
                        break;
                    case 5:
                        System.out.println("\nYour Balance : "+a.getBalance());
                        break;
                    case 6:
                        System.out.println("\nTHE TRANSACTION HAS BEEN CANCELLED. THANK FOR BANKING WITH US!.");
                        System.exit(0);
                    default:
                        System.out.println("\nINVALID CHOICE. KINDLY ENTER A CORRECT CHOICE.");
                }
            }
        }
        sc.close();
    }   
}
class UserAccount{
    private int pin=10500;
    private int balance=100000;
    private String username="User1234";
    boolean checkUserName(String s){
        return this.username==s;
    }
    int getBalance(){
        return this.balance;
    }
    int getpin(){
        return this.pin;
    }
    int withdraw(int am){
        this.balance=this.balance-am;
        return this.balance;
    }
    int credit(int am){
        this.balance=this.balance+am;
        return this.balance;
    }
    
}

