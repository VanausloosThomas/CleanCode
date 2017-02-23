import be.cegeka.customers.Customer;
import be.cegeka.customers.LoyaltyCard;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by thomasva on 23/02/2017.
 */
public class CustomerTest {

    Customer testCustomer;

    @Before
    public void setUp(){
        testCustomer = new Customer("testName");
    }

    @Test
    public void newCustomer_returnsACustomerClass(){
        Assertions.assertThat(testCustomer.getClass()).isEqualTo(Customer.class);
    }

    @Test
    public void newCustomer_whenMade_ReturnsACustomerWithTheCorrectName(){
        Assertions.assertThat(testCustomer.getCustomerName()).isEqualTo("testName");
    }

    @Test
    public void addLoyaltyCard_whenAddingANewCard_AddsItToTheCustomer(){
        LoyaltyCard loyaltyCard = (new LoyaltyCard("barcodeValue"));
        testCustomer.addLoyaltyCard(loyaltyCard);

        Assertions.assertThat(testCustomer.getLoyaltyCard()).isEqualTo(loyaltyCard);
    }
}
