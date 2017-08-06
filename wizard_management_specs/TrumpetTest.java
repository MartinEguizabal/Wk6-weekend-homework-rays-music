import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class TrumpetTest {

  Trumpet trumpet;

  @Before
  public void before(){
    trumpet = new Trumpet("brass", 6, "gold", 800, 600);
  }

  @Test
  public void canPlay(){
    assertEquals("trumpy, trumpy, trumpy!", trumpet.play());
  }

  @Test
  public void hasCalculateMarkup(){
    assertEquals(200, trumpet.calculateMarkup(800, 600));
  }

  @Test
  public void hasValves(){
    assertEquals(6, trumpet.getValves());
  }
}

