package wizard_management;

public class Trumpet extends Instrument {

  int valves;

  public Trumpet(String material, int valves, String colour){
    super(material, colour);
    this.valves = valves;
  }

  public String play(){
    return "trumpy, trumpy, trumpy!";
  }

  public int getValves(){
    return this.valves;
  }

}