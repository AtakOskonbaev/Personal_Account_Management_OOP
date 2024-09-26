public class Main {
    public static void main(String[] args) {
        //creating and account
        PersonalAccount AtakOskonbaev = new PersonalAccount(123, "Atak Oskonbaev");

        //displaying information about the user
        System.out.println(AtakOskonbaev.getAccountNumber());
        System.out.println(AtakOskonbaev.getAccountHolder());
        System.out.println(AtakOskonbaev.getBalance());

        //first deposit of 100 soms
        AtakOskonbaev.deposit(100);
        System.out.println(AtakOskonbaev.getBalance());

        //withdrawal 50 soms
        AtakOskonbaev.withdrawal(50);
        System.out.println(AtakOskonbaev.getBalance());

        AtakOskonbaev.printTransactionHistory();

        //withdrawing more than the balance
        AtakOskonbaev.withdrawal(100); //returns nothing
        System.out.println(AtakOskonbaev.getBalance());
    }
}
