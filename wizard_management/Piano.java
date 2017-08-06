package wizard_management;

public class Piano extends Instrument {

  int keys;

  public Piano(String material, int keys, String colour, double sale_price, double buy_price) {
   super(material, colour, sale_price, buy_price);
    this.keys = keys;
  }

  public double calculateMarkup(double sale_price, double buy_price){
    double result = ((sale_price - buy_price)/buy_price) *100;
    return Math.round(result);
  }

  public String play(){
    return "blam, blam, blam!";
  }

  public int getKeys(){
    return this.keys;
  }

}