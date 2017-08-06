package wizard_management;
import behaviours.*;

public abstract class Instrument implements Playable, Sellable {

  String material;
  String colour;
  int sale_price;
  int buy_price;

  public Instrument(String material, String colour, int sale_price, int buy_price) {
    this.material = material;
    this.colour = colour;
    this.sale_price = sale_price;
    this.buy_price = buy_price;
  }

  public String getMaterial(){
    return this.material;
  }

  public String getColour(){
    return this.colour;
  }
}