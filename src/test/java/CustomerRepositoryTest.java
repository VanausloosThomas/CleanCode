import be.cegeka.customers.Customer;
import be.cegeka.customers.CustomerRepository;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thomasva on 23/02/2017.
 */
public class CustomerRepositoryTest {
    private CustomerRepository customerRepository;
    private Customer xan;
    private Customer marijn;
    private List<Customer> customers;

    @Before
    public void setUp(){
        customerRepository = new CustomerRepository();
        xan = new Customer("Xan");
        marijn = new Customer("Marijn");
        customers = new ArrayList<>();
        customers.add(xan);
        customers.add(marijn);
    }

    @Test
    public void addCustomer_whenAddingACustomer_ListShouldContainThatCustomer(){
        customerRepository.addCustomer(xan);
        customerRepository.addCustomer(marijn);
        Assertions.assertThat(customerRepository.getAllCustomers()).isEqualTo(customers);
    }


}
