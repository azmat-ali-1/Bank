public class Main {

    public static void main(String[] args) {

        ChaltaBank account = new ChaltaBank(1234,"Azmat",10000,5.0);
        account.addMoney(250);
        account.withdrawMoney(101000);
        System.out.println("Your Balance is :" + account.checkBalance());
        System.out.println("the interest of the year is " +account.CalculateInterest());

    }
}