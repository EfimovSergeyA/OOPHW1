package ooplesson2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human humann = new Human();
        humann.name = "Олег";
        Market market = new Market();
        market.acceptToMarket(humann);
        market.takeQueue(humann);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue(humann);
        market.releaseFromMarket(humann);

    }
}
