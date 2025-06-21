package Exercise11DependencyInjectionExample;


public class Main {
    public static void main(String[] args) {
    
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);

       
        service.getCustomerDetails(1);  
        service.getCustomerDetails(3);  
    }
}
