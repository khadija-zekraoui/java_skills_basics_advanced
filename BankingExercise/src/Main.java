public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Luna", 50.05);
        bank.addCustomer("Adelaide", "Mia", 175.34);
        bank.addCustomer("Adelaide", "Olaf", 220.12);

        bank.addCustomerTransaction("Adelaide", "Luna", 44.22);
        bank.addCustomerTransaction("Adelaide", "Mia", 12.44);
        bank.addCustomerTransaction("Adelaide", "Olaf", 1.65);

        bank.listCustomers("Adelaide", true);
    }
}
