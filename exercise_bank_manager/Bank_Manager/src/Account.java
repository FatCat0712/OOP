import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private final double interestRate = 0.035;
    private final double withdrawingFee = 10000;
    private long accountNumber;
    private String accountName;
    private double figure;

    public Account(long accountNumber, String accountName) {
        if(accountNumber > 0 && !accountName.isEmpty()){
            this.accountNumber = accountNumber;
            this.accountName = accountName;
        }
        this.figure = 50000;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        if(accountNumber > 1000){
            this.accountNumber = accountNumber;
        }

    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        if(!accountName.isEmpty()){
            this.accountName = accountName;
        }

    }

    public double getFigure() {
       return figure;
    }

    public void setFigure(double figure){
        if(figure > 0){
            this.figure = figure;
        }
    }
    public String toString(){
        Locale local = new Locale("vn","VN");
        NumberFormat numf = NumberFormat.getInstance(local);
        return String.format("%5d%10s%15s",accountNumber,accountName,numf.format(figure));
    }

    public void deposit(double money){
        figure += money;


    }

    public void withdraw(double money){
        this.figure = this.figure -  money - withdrawingFee;
    }

    public void maturing(){
        figure = figure + figure * interestRate;
    }

    public void transfer(double money){
        figure = figure - money;

    }


}
