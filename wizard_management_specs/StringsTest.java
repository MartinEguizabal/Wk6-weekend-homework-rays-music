import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class StringsTest{

  Strings strings;

  @Before
  public void before(){
    strings = new Strings(10, 8);
  }

  @Test
  public void hasCalculateMarkup(){
    assertEquals(2, strings.calculateMarkup(10, 8));
  }
}

