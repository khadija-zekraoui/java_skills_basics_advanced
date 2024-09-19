public class Main {

    public static void main(String[] args) {

//        Account miasAccount = new Account("12345", 500,
//                "Mia luna", "myemail@mia.com",
//                "(087) 123-4567");

        Account miasAccount = new Account();

        System.out.println(miasAccount.getNumber());
        System.out.println(miasAccount.getBalance());

//        miasAccount.setNumber("12345");
//        miasAccount.setBalance(1000.00);
//        miasAccount.setCustomerName("Mia Luna");
//        miasAccount.setCustomerEmail("myemail@mia.com");
//        miasAccount.setCustomerPhone("(087) 123-4567");
        
        miasAccount.withdrawFunds(100.0);
        miasAccount.depositFunds(250);
        miasAccount.withdrawFunds(50);

        miasAccount.withdrawFunds(200);

        miasAccount.depositFunds(100);
        miasAccount.withdrawFunds(45.55);
        miasAccount.withdrawFunds(54.46);

        miasAccount.withdrawFunds(54.45);

        Account olafsAccount = new Account("mia",
                "olaf@email.com", "12345");
        System.out.println("AccountNo: " + olafsAccount.getNumber() +
                "; name " + olafsAccount.getCustomerName());
    }
}
