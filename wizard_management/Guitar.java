package wizard_management;

public class Guitar extends Instrument {

  int strings;

  public Guitar(String material, int strings, String colour, double sale_price, double buy_price) {
    super(material, colour, sale_price, buy_price);
    this.strings = strings;
  }

  public String play(){
    return "playing me my guitar!";
  }

  public double calculateMarkup(double sale_price, double buy_price){
    double result = ((sale_price - buy_price)/buy_price) *100;
    return Math.round(result);
  }

  public String getColour(){
    return this.colour;
  }

}

