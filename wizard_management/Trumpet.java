package wizard_management;

public class Trumpet extends Instrument {

  int valves;

  public Trumpet(String material, int valves, String colour, double sale_price, double buy_price){
    super(material, colour, sale_price, buy_price);
    this.valves = valves;
  }

  public String play(){
    return "trumpy, trumpy, trumpy!";
  }

  public double calculateMarkup(double sale_price, double buy_price){
    double result = ((sale_price - buy_price)/buy_price) *100;
    return Math.round(result);
  }

  public int getValves(){
    return this.valves;
  }

}