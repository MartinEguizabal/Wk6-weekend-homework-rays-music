package wizard_management;
import behaviours.*;

public abstract class Instrument implements Playable {

  String material;
  String colour;

  public Instrument(String material, String colour) {
    this.material = material;
    this.colour = colour;
  }

  public String getMaterial(){
    return this.material;
  }

  public String getColour(){
    return this.colour;
  }
}