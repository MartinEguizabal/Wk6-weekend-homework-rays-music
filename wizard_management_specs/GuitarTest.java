import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before(){
    guitar = new Guitar("wood", 4, "red");
  }

  @Test
  public void canPlay(){
    assertEquals("playing me my guitar!", guitar.play());
  }

  @Test
  public void hasMaterial(){
    assertEquals("wood", guitar.getMaterial());
  }

  @Test
  public void hasColour(){
    assertEquals("red", guitar.getColour());
  }


}