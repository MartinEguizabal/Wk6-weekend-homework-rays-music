package behaviours;

public interface Sellable{
  int calculateMarkup(int sale_price, int buy_price);
  int getSalePrice();
  int getBuyPrice();
}