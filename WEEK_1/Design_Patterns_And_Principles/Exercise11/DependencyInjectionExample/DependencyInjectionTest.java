package WEEK_1.Design_Patterns_And_Principles.Exercise11.DependencyInjectionExample;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);
        Customer customer = customerService.getCustomerById(1);
        System.out.println(customer);
    }
}

