package Exercise11DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // Simulated database
        if (id == 1) {
            return "Hari Krishna (ID: 1)";
        } else if (id == 2) {
            return "Arjun Kumar (ID: 2)";
        } else {
            return "Customer not found.";
        }
    }
}
