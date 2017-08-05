package wizard_management;

public class Trumpet extends Instrument {

  int valves;
  String colour;

  public Trumpet(String material, int valves, String colour){
    super(material);
    this.valves = valves;
    this.colour = colour;
  }

  public String play(){
    return "trumpy, trumpy, trumpy!";
  }

  public int getValves(){
    return this.valves;
  }

}