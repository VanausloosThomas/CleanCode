package be.cegeka.customers;

/**
 * Created by thomasva on 23/02/2017.
 */
public class Customer {

    private String name;
    private LoyaltyCard loyaltyCard;

    public Customer(String name) {
        this.name = name;
    }

    public String getCustomerName() {
        return name;
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    public void addLoyaltyCard(LoyaltyCard loyaltyCard) {
        if(this.loyaltyCard == null){
            this.loyaltyCard = loyaltyCard;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        return loyaltyCard != null ? loyaltyCard.equals(customer.loyaltyCard) : customer.loyaltyCard == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (loyaltyCard != null ? loyaltyCard.hashCode() : 0);
        return result;
    }
}
