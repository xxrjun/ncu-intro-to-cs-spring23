package A3_109403019;

import java.util.ArrayList;


/**
 * The type Store.
 */
public class store {
    private ArrayList<goods> goodList;
    private int money = 0;

    /**
     * Instantiates a new store.
     */
    public store() {
        goodList = new ArrayList<>();
    }

    /**
     * Add item.
     *
     * @param good the good
     */
    public void addItem(goods good) {
        goodList.add(good);
    }

    /**
     * Sell item.
     *
     * @param id     the id
     * @param amount the amount
     */
    public void sell(String id, int amount) {
        for (goods good : goodList) {
            if (good.id.equals(id)) {
                // decrease the amount of the item.
                good.amount -= amount;

                // increase money.
                money += amount * good.getPrice();

                // remove the good from the list if the amount is equal or less than 0.
                if (good.amount <= 0) {
                    goodList.remove(good);
                    break;
                }
            }
        }
    }

    /**
     * Show all items in the store.
     */
    public void showAll() {
        goodList.forEach((good) -> {
            if (good.amount > 0) {
                System.out.println(good.id + " " + good.getName() + " " + good.getPrice() + " " + good.amount);
            }
        });
    }

    /**
     * Show income.
     */
    public void showIncome() {
        System.out.println(money);
    }
}
