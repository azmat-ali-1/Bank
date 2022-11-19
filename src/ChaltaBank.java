public class ChaltaBank implements Bank {
        int accountNo;
        String name;
        int balance;
        double interestRate;

    public ChaltaBank(int accountNo, String name, int balance, double interestRate) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void addMoney(int money) {
        balance+=money;
        System.out.println("Your total Balance = "+balance);
    }

    @Override
    public boolean withdrawMoney(int money) {
        if(money<=balance){
            balance-=money;
            System.out.println("Your Current Balance ="+balance);
            return true;
        }
    else{
            System.out.println("Chalta ban ChaltaBank se");
            return false;
        }
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public double CalculateInterest() {
        return balance * interestRate /100;
    }
}
