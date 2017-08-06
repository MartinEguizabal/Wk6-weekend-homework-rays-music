import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class SheetMusicTest{

  SheetMusic sheet_music;

  @Before
  public void before(){
    sheet_music = new SheetMusic(20, 12);
  }

  @Test
  public void hasCalculateMarkup(){
    assertEquals(67, sheet_music.calculateMarkup(20, 12), 0.01);
  }
}
