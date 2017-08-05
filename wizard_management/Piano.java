package wizard_management;

public class Piano extends Instrument {

  int keys;

  public Piano(String material, int keys, String colour) {
    super(material, colour);
    this.keys = keys;
  }

  public String play(){
    return "blam, blam, blam!";
  }

  public int getKeys(){
    return this.keys;
  }

}