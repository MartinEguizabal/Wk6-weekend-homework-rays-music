package wizard_management;
import behaviours.*;

public abstract class Instrument implements Playable {

  String material;

  public Instrument(String material) {
    this.material = material;
  }

  public String getMaterial(){
    return this.material;
  }
}