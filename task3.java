import java.util.Scanner;
class atm{
    bankaccount account;
    Scanner sc = new Scanner(System.in);
    public atm(bankaccount account){
        this.account =account;
    }
    void display(){
        System.out.println("welcome to the atm");
        System.out.println("press 1 to withdraw amount ");
        System.out.println("press 2 to deposit amount");
        System.out.println("press 3 to check balance");
        System.out.println("press 4 to exit");
    }
    void insert(int choice) {
        switch (choice){
            case 1:
            withdraw();
            break;
            case 2:
            deposit();
            break;
            case 3:
            checkbalance();
            break;
            case 4:
            System.exit(0);
            break;
            default:
            System.out.println("invalid choice");
        }
    }
    void withdraw()
    {
        System.out.print("enter amount to withdrawn: ");
        int amount = sc.nextInt();
        if(account.getbalance() >= amount)
        {
            account.withdraw(amount);
            System.out.println("withdrawal successfully. your balance is :"+account.getbalance());
        }else{
            System.out.println("insufficient balance.");
        }
        }
        void deposit(){
            System.out.print("enter amount to deposit:");
            int amount= sc.nextInt();
            account.deposit(amount);
            System.out.println("deposit successful. your balance is: "+account.getbalance());
            
        }
        void checkbalance()
        {
            System.out.println("your current balance is: "+account.getbalance());
        }

    }
    class bankaccount{
    int balance;
    bankaccount(int balance){
        this.balance=balance;
    }
    int getbalance()
    {
        return balance;
    }
    void withdraw(int amount){
        balance = balance-amount;
    }
    void deposit(int amount){
        balance = balance+amount;
    }

}
public class task3 {
    public static void main(String[] args) {
        bankaccount account = new bankaccount(10000);
        atm input = new atm(account);
        while(true){
            input.display();
            System.out.print("enter your choice :");
            int choice = new Scanner(System.in).nextInt();
            input.insert(choice);
        }
    }
    
}
