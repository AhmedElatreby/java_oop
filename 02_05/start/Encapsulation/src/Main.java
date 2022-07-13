public class Main {
    public static void main(String[] args) {
        BankAccount accountOne = new BankAccount("Ahmed El-Atreb", 5000);


        accountOne.deposit(5000);
        System.out.println(accountOne.getOwner());
        System.out.println(accountOne.getBalance());

        accountOne.withdraw(9000);
        System.out.println(accountOne.getBalance());


    }
}
