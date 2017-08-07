package wizard_management;
import behaviours.*;

public abstract class Instrument implements Playable, Sellable {

  MaterialType material;
  String colour;
  int sale_price;
  int buy_price;

  public Instrument(MaterialType material, String colour, int sale_price, int buy_price) {
    this.material = material;
    this.colour = colour;
    this.sale_price = sale_price;
    this.buy_price = buy_price;
  }

  public MaterialType getMaterial(){
    return this.material;
  }

  public String getColour(){
    return this.colour;
  }
}