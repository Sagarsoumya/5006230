package WEEK_1.Design_Patterns_And_Principles.Exercise11.DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
         return new Customer(id, "John Doe", "john.doe@example.com");
    }
}

