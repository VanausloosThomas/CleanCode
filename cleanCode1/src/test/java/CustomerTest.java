import org.assertj.core.api.Assertions;
import org.junit.Test;


/**
 * Created by thomasva on 23/02/2017.
 */
public class CustomerTest {

    @Test
    public void newCustomer_returnsACustomerClass(){
        Customer testCustomer = new Customer("aName");
        Assertions.assertThat(testCustomer.getClass()).isEqualTo(Customer.class);
    }
}
