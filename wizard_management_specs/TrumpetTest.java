import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class TrumpetTest {

  Trumpet trumpet;

  @Before
  public void before(){
    trumpet = new Trumpet("brass", 6, "gold", 1000, 600);
  }

  @Test
  public void canPlay(){
    assertEquals("trumpy, trumpy, trumpy!", trumpet.play());
  }

  @Test
  public void hasCalculateMarkup(){
    assertEquals(100, trumpet.calculateMarkup(1000, 500), 0.01);
  }

  @Test
  public void hasValves(){
    assertEquals(6, trumpet.getValves());
  }
}

