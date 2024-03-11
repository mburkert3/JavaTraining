public class Main {
    public static void main(String[] args) {
        Account account = new Account("12345", 1000.00, "Matt Burkert", "myemail.com", "785-224");
        account.setBalance(2500);
        account.setCustomerEmail("maburkert3");
        account.setNumber("15");

        account.depositFunds(250);
        account.withdrawFunds(750);
    }
}
