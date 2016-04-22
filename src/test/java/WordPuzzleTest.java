import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleTest {

  @Test
    public void isUserPhrase_forReplaceLetterA_True() {
    WordPuzzle phrase = new WordPuzzle();
    String expected = new String();
    expected = "Th-t -pple is or-nge";
    assertEquals(expected, WordPuzzle.userPhrase("Th-t -pple is or-nge"));
  }
  @Test
    public void isUserPhrase_forReplaceLetterE_True() {
    WordPuzzle phrase = new WordPuzzle();
    String expected = new String();
    expected = "Th-t -ppl- is or-ng-";
    assertEquals(expected, WordPuzzle.userPhrase("Th-t -ppl- is or-ng-"));
  }
}
