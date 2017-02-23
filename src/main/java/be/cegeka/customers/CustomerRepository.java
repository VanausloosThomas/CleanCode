package be.cegeka.customers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thomasva on 23/02/2017.
 */
public class CustomerRepository {

    private List<Customer> customerList = new ArrayList<>();

    public List<Customer> getAllCustomers(){
        return new ArrayList<>(customerList);
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

}
