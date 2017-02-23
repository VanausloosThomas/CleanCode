import java.util.ArrayList;
import java.util.List;

/**
 * Created by dieterp on 23/02/2017.
 */
public class LoyaltyCardRepository {
    private List<LoyaltyCard> loyaltyCardList;


    public LoyaltyCardRepository() {
        this.loyaltyCardList = new ArrayList<>();
    }

    public void AddLoyaltyCardToRepository(LoyaltyCard card)
    {
        loyaltyCardList.add(card);
    }

    public List<LoyaltyCard> GetAllLoyaltyCards()
    {
        return new ArrayList<>(loyaltyCardList);
    }
}
