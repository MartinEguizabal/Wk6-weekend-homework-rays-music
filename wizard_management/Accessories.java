package wizard_management;
import behaviours.*;

public abstract class Accessories implements Sellable {

  int sale_price;
  int buy_price;

  public Accessories(int sale_price, int buy_price) {
    this.sale_price = sale_price;
    this.buy_price = buy_price;
  }

}