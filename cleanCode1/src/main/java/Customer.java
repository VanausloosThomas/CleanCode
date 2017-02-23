/**
 * Created by thomasva on 23/02/2017.
 */
public class Customer {

    private String name;
    private LoyaltyCard loyaltyCard;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
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
}
