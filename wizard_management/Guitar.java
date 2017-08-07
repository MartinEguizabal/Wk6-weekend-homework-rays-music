package wizard_management;

public class Guitar extends Instrument {

  int strings;

  public Guitar(MaterialType material, int strings, String colour, int sale_price, int buy_price) {
    super(material, colour, sale_price, buy_price);
    this.strings = strings;
  }

  public String play(){
    return "playing me my guitar!";
  }

  // public double calculateMarkup(double sale_price, double buy_price){
  //   double result = ((sale_price - buy_price)/buy_price) *100;
  //   return Math.round(result);
  // }

  public int calculateMarkup(int sale_price, int buy_price){
    return sale_price - buy_price;
  }

  public int getSalePrice(){
    return this.sale_price;
  }

  public int getBuyPrice(){
    return this.buy_price;
  }

  public String getColour(){
    return this.colour;
  }

}

