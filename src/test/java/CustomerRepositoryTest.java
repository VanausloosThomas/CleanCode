import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thomasva on 23/02/2017.
 */
public class CustomerRepositoryTest {




    @Test
    public void addCustomer_whenAddingACustomer_ListShouldContainThatCustomer(){
        Customer testCustomer  = new Customer("aName");
        CustomerRepository testRepo = new CustomerRepository();
        testRepo.addCustomer(testCustomer);
        List<Customer> testList = new ArrayList<>();
        testList.add(testCustomer);
        Assertions.assertThat(testRepo.getAllCutomers()).containsExactly(testCustomer);
    }


}
