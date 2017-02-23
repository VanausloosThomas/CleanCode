package be.cegeka.customers;

import com.sun.org.apache.xpath.internal.operations.String;

import java.time.LocalDate;

/**
 * Created by dieterp on 23/02/2017.
 */
public class Grocery {

    private String groceryItemName;
    private LocalDate buyDate;
    private int bonusPoints;
    private int timesTheItemIsBought;

    public Grocery(String groceryItemName) {
        this.groceryItemName = groceryItemName;
        this.buyDate = LocalDate.now();
        this.bonusPoints = 0;
        this.timesTheItemIsBought = 0;
    }

    public Grocery(String groceryItemName, int bonusPoints, int timesTheItemIsBought) {
        this.groceryItemName = groceryItemName;
        this.buyDate = LocalDate.now();
        this.bonusPoints = bonusPoints;
        this.timesTheItemIsBought = timesTheItemIsBought;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grocery grocery = (Grocery) o;

        if (bonusPoints != grocery.bonusPoints) return false;
        if (groceryItemName != null ? !groceryItemName.equals(grocery.groceryItemName) : grocery.groceryItemName != null)
            return false;
        return buyDate != null ? buyDate.equals(grocery.buyDate) : grocery.buyDate == null;
    }

    @Override
    public int hashCode() {
        int result = groceryItemName != null ? groceryItemName.hashCode() : 0;
        result = 31 * result + (buyDate != null ? buyDate.hashCode() : 0);
        result = 31 * result + bonusPoints;
        return result;
    }
}
