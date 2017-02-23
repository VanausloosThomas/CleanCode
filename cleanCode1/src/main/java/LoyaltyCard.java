/**
 * Created by thomasva on 23/02/2017.
 */
public class LoyaltyCard {

    private String barcode;
    private int bonusPoints;

    public LoyaltyCard(String barcode) {
        this.barcode = barcode;
        this.bonusPoints = 0;
    }

    public String getBarcode() {
        return new String(barcode);
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public void addBonusPoints(int bonusPoints) {
        this.bonusPoints += bonusPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoyaltyCard)) return false;

        LoyaltyCard that = (LoyaltyCard) o;

        if (bonusPoints != that.bonusPoints) return false;
        return barcode.equals(that.barcode);
    }

    @Override
    public int hashCode() {
        int result = barcode.hashCode();
        result = 31 * result + bonusPoints;
        return result;
    }
}
