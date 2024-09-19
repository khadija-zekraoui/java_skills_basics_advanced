public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("luna", 12335, "Mar");
        System.out.println(customer1.toString());

        Customer customer2 = new Customer();
        System.out.println(customer2.toString());

        Customer customer3 = new Customer("olaf", "olaf@gmail.com");
        System.out.println(customer3.toString());
    }
}
