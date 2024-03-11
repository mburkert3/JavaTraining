public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Matt", 1000, "Matt@email.com");
        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getCreditLimit());      

        Customer second = new Customer();
        System.out.println(second.getName());
        System.out.println(second.getEmail());
        System.out.println(second.getCreditLimit());

        Customer third = new Customer("Joe", "Joe@email.com");
        System.out.println(third.getName());
        System.out.println(third.getEmail());
        System.out.println(third.getCreditLimit());

    }
}
