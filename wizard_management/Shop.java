package wizard_management;
import behaviours.*;
import java.util.*;

public class Shop {
  ArrayList<Sellable> stock;

  public Shop (){
    this.stock = new ArrayList<Sellable>();
  }

  public int countStock(){
    return this.stock.size();
  }

  public void addToStock(Sellable item){
    this.stock.add(item);
  }

  public void removeStock(Sellable item){
    this.stock.remove(item);
  }

  public int totalPotentialProfit(){
    int total_profit = 0;
    for(Sellable item : stock){
      int item_profit = item.calculateMarkup(item.getSalePrice(), item.getBuyPrice());
        total_profit = total_profit + item_profit;
    }
    return total_profit;
  }

}

