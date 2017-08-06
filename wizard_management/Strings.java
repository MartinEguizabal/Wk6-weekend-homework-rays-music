package wizard_management;

public class Strings extends Accessories {

  public Strings(int sale_price, int buy_price) {
    super(sale_price, buy_price);
  }

  public int calculateMarkup(int sale_price, int buy_price){
    return sale_price - buy_price;
  }

  public int getSalePrice(){
    return this.sale_price;
  }

  public int getBuyPrice(){
    return this.buy_price;
  }
}