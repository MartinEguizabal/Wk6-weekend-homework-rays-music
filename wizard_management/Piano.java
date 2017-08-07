package wizard_management;

public class Piano extends Instrument {

  int keys;

  public Piano(MaterialType material, int keys, String colour, int sale_price, int buy_price) {
   super(material, colour, sale_price, buy_price);
    this.keys = keys;
  }

  public int calculateMarkup(int sale_price, int buy_price){
    return sale_price - buy_price;
  }

  public String play(){
    return "blam, blam, blam!";
  }

  public int getSalePrice(){
    return this.sale_price;
  }

  public int getBuyPrice(){
    return this.buy_price;
  }

  public int getKeys(){
    return this.keys;
  }

}