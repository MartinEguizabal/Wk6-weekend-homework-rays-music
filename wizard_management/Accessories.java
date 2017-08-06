package wizard_management;
import behaviours.*;

public abstract class Accessories implements Sellable {

  double sale_price;
  double buy_price;

  public Accessories(double sale_price, double buy_price) {
    this.sale_price = sale_price;
    this.buy_price = buy_price;
  }

}