public class Main {

    public static void main(String[] args) {

        Account miasAccount = new Account();

        miasAccount.setNumber("12345");
        miasAccount.setBalance(1000.00);
        miasAccount.setCustomerName("mia Luna");
        miasAccount.setCustomerEmail("myemail@mia.com");
        miasAccount.setCustomerPhone("(034) 123-1525");
        
        miasAccount.withdrawFunds(100.0);
        miasAccount.depositFunds(250);
        miasAccount.withdrawFunds(50);

        miasAccount.withdrawFunds(200);

        miasAccount.depositFunds(100);
        miasAccount.withdrawFunds(45.55);
        miasAccount.withdrawFunds(54.46);

        miasAccount.withdrawFunds(54.45);
    }
}
