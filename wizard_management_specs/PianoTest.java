import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class PianoTest {

  Piano piano;

  @Before 
  public void before(){
    piano = new Piano("imitation ivory", 255, "black", 5000, 3000);
  }

  @Test
  public void hasCalculateMarkup(){
    assertEquals(67, piano.calculateMarkup(5000, 3000), 0.01);
  }

  @Test
  public void canPlay(){
    assertEquals("blam, blam, blam!", piano.play());
  }

  @Test
  public void hasKeys(){
    assertEquals(255, piano.getKeys());
  }

  @Test
  public void hasMaterial(){
    assertEquals("imitation ivory", piano.getMaterial());
  }

}