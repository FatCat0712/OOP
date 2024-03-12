import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        boolean flag = true;
        int choice = 0;
        Account[] accountList = null;
        int number = 0;
        while (flag){
            System.out.println("-- Bank Manager --");
            System.out.println("What are u up to ?");
            System.out.println("1. Create a bank account list");
            System.out.println("2. Print bank account list");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Maturity");
            System.out.println("6. Transfer");
            System.out.println("7. Exit");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("How many accounts do want add ?");
                    number = sc.nextInt();
                    accountList = new Account[number];
                    for(int i = 0; i < number; i++){
                        System.out.println("Enter account number for account "+(i+1));
                        long accountNumber = sc.nextLong();
                        sc.nextLine();
                        System.out.println("Enter account name for account "+(i+1));
                        String accountName = sc.nextLine();
                        accountList[i] = new Account(accountNumber,accountName);
                    }
                    break;
                case 2:
                    for(int i = 0; i < number; i++){
                        System.out.println(accountList[i].toString());
                    }
                    break;
                case 3:
                    System.out.println("Choose the account you want to deposit: ");
                    long choose = sc.nextLong();
                    long found = 0;
                    for(int i = 0; i < number; i++){
                        if(choose == accountList[i].getAccountNumber()){
                            found = accountList[i].getAccountNumber();
                            break;
                        }
                    }
                    System.out.println("Enter the amount of money you want to deposit: ");
                    double money = sc.nextDouble();
                    while (money < 0){
                        System.out.println("Deposit must be positive");
                        System.out.println("Try again !");
                        money = sc.nextDouble();
                    }
                    for(int i = 0; i < number; i++){
                        if(found == accountList[i].getAccountNumber()){
                            accountList[i].deposit(money);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Choose the account to withdraw: ");
                    long c = sc.nextLong();
                    for(int i = 0; i < number; i++){
                        if(c == accountList[i].getAccountNumber()){
                            System.out.println("Enter the amount you want to withdraw");
                            double m = sc.nextDouble();
                            while(m > accountList[i].getFigure()){
                                System.out.println("Cannot withdraw");
                                System.out.println("Try again");
                                m = sc.nextDouble();
                            }
                            accountList[i].withdraw(m);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Choose the account to maturing: ");
                    long a = sc.nextLong();
                    for(int i = 0; i < number; i++){
                        if(a == accountList[i].getAccountNumber()){
                            accountList[i].maturing();
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Sender: ");
                    long acc = sc.nextLong();
                    System.out.println("Amount to send: ");
                    double amount = sc.nextDouble();
                    System.out.println("Receiver: ");
                    long re = sc.nextLong();
                    for(int i = 0; i < number; i++){
                        if(acc == accountList[i].getAccountNumber()){
                            while (amount > accountList[i].getFigure() || accountList[i].getFigure() <= 0){
                                System.out.println("Cannot transfer");
                                System.out.println("Try again");
                                amount = sc.nextDouble();
                            }
                            accountList[i].transfer(amount);
                        }
                        else if(re == accountList[i].getAccountNumber()){
                            accountList[i].deposit(amount);
                        }
                    }
                    break;
                default:
                    System.out.println("Bye");
                    flag = false;
                    break;
            }
        }




    }
}
