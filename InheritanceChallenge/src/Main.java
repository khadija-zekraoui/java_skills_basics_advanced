public class Main {

    public static void main(String[] args) {

        Employee luna = new Employee("Luna", "11/11/1985",
                "01/01/2020");
        System.out.println(luna);
        System.out.println("Age = " + luna.getAge());
        System.out.println("Pay = " + luna.collectPay());

        SalariedEmployee mia = new SalariedEmployee("Mia", "11/11/1990",
                "03/03/2020", 35000);
        System.out.println(mia);
        System.out.println("Mia's Paycheck = $" + mia.collectPay());

        mia.retire();
        System.out.println("Mia's Pension check = $" + mia.collectPay());

        HourlyEmployee mar = new HourlyEmployee("Mar", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(mar);
        System.out.println("Mar's Paycheck = $" + mar.collectPay());
        System.out.println("Mar's Holiday Pay = $" + mar.getDoublePay());
    }
}
