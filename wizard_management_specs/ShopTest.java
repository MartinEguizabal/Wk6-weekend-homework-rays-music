import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;
import java.util.*;
import behaviours.*;

public class ShopTest {

  Shop shop;
  Guitar guitar;
  Piano piano;

  @Before
  public void before(){
    shop = new Shop();
    guitar = new Guitar(MaterialType.ALUMINUM, 4, "silver", 150, 100);
    piano = new Piano(MaterialType.WOOD, 275, "black", 7000, 5000);
  }

  @Test
  public void countStartsAtZero(){
    assertEquals(0, shop.countStock());
  }

  @Test
  public void canAddToStock(){
    shop.addToStock(guitar);
    assertEquals(1, shop.countStock());
  }

  @Test
  public void canRemoveStock(){
    shop.addToStock(guitar);
    shop.addToStock(piano);
    shop.removeStock(guitar);
    assertEquals(1, shop.countStock());
  }

  @Test
  public void hasTotalPotentialProfit(){
    shop.addToStock(guitar);
    shop.addToStock(piano);
    assertEquals(2050, shop.totalPotentialProfit());
  }

}