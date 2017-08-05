package wizard_management;

public class Guitar extends Instrument {

  int strings;

  public Guitar(String material, int strings, String colour) {
    super(material, colour);
    this.strings = strings;
  }

  public String play(){
    return "playing me my guitar!";
  }

  public String getColour(){
    return this.colour;
  }

}