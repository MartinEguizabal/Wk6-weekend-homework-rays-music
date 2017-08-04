package wizard_management;

public class Guitar extends Instrument {

  int strings;
  String colour;

  public Guitar(String material, int strings, String colour) {
    super(material);
    this.strings = strings;
    this.colour = colour;
  }

  public String play(){
    return "playing me my guitar!";
  }

  public String getColour(){
    return this.colour;
  }

}