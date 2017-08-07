package wizard_management;

public class Trumpet extends Instrument {

  int valves;

  public Trumpet(MaterialType material, int valves, String colour, int sale_price, int buy_price){
    super(material, colour, sale_price, buy_price);
    this.valves = valves;
  }

  public String play(){
    return "trumpy, trumpy, trumpy!";
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

  public int getValves(){
    return this.valves;
  }

}