import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        boolean flag = true;
        int choice;
        ArrayList<Account> accountList = new ArrayList<>();
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
            System.out.println("7. Save account list as file");
            System.out.println("8. Read account list from a file");
            System.out.println("9. Exit");
            System.out.println("-------------------");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("How many accounts do want add ?");
                    number = sc.nextInt();
                    for(int i = 0; i < number; i++){
                            System.out.println("Enter account number for account "+accountList.size());
                            long accountNumber = sc.nextLong();
                            sc.nextLine();
                            System.out.println("Enter account name for account "+accountList.size());
                            String accountName = sc.nextLine();
                            accountList.add(new Account(accountNumber,accountName));
                    }


                    break;
                case 2:
                    for(Account acc : accountList){
                        System.out.println(acc.toString());
                    }
                    break;
                case 3:
                    System.out.println("Choose the account you want to deposit: ");
                    long choose = sc.nextLong();
                    long found = 0;
                    for(Account acc1 : accountList){
                        if(choose == acc1.getAccountNumber()){
                            found = acc1.getAccountNumber();
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
                    for(Account acc2 : accountList){
                        if(found == acc2.getAccountNumber()){
                            acc2.deposit(money);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Choose the account to withdraw: ");
                    long c = sc.nextLong();
                    for(Account acc3 : accountList){
                        if(c == acc3.getAccountNumber()){
                            System.out.println("Enter the amount you want to withdraw");
                            double m = sc.nextDouble();
                            while(m > acc3.getFigure()){
                                System.out.println("Cannot withdraw");
                                System.out.println("Try again");
                                m = sc.nextDouble();
                            }
                            acc3.withdraw(m);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Choose the account to maturing: ");
                    long a = sc.nextLong();
                    for(Account acc4: accountList){
                        if(a == acc4.getAccountNumber()){
                            acc4.maturing();
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
                    for(Account acc5 : accountList){
                        if(acc == acc5.getAccountNumber()){
                            while (amount > acc5.getFigure() || acc5.getFigure() <= 0){
                                System.out.println("Cannot transfer");
                                System.out.println("Try again");
                                amount = sc.nextDouble();
                            }
                            acc5.transfer(amount);
                        }
                        else if(re == acc5.getAccountNumber()){
                            acc5.deposit(amount);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Enter file name: ");
                    Scanner sc1 = new Scanner(System.in);
                    String fileName = sc1.nextLine();
                    try {
                        File f = new File("E:\\"+fileName);
                        OutputStream os = new FileOutputStream(f);
                        ObjectOutputStream oos = new ObjectOutputStream(os);

                        for(Account acc6 : accountList){
                            oos.writeObject(acc6);
                        }
                        oos.flush();
                        oos.close();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
                case 8:
                    System.out.println("Enter file name: ");
                    Scanner sc2 = new Scanner(System.in);
                    String fileToRead = sc2.nextLine();
                    try {
                        File f = new File("E:\\"+fileToRead);
                        InputStream is = new FileInputStream(f);
                        ObjectInputStream ois = new ObjectInputStream(is);

                        while (is.available() > 0){
                            Account accountRead = (Account) ois.readObject();
                            System.out.println(accountRead);
                        }
                    }
                    catch (Exception e){
                        e.printStackTrace();
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
