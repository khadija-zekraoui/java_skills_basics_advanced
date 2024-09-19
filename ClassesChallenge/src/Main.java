public class Main {

    public static void main(String[] args) {

        Account miasAccount = new Account("12345", 500,
                "Mia Luna", "myemail@mia.com",
                "(087) 123-4567");

        System.out.println(miasAccount.getNumber());
        System.out.println(miasAccount.getBalance());

//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Mia Luna");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("(087) 123-4567");

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
