package wizard_management;

public class Piano extends Instrument {

  int keys;
  String colour;

  public Piano(String material, int keys, String colour) {
    super(material);
    this.keys = keys;
    this.colour = colour;
  }

  public String play(){
    return "blam, blam, blam!";
  }

  public int getKeys(){
    return this.keys;
  }

}