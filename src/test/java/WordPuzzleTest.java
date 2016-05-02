import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleTest {

  @Test
    public void isUserPhrase_forReplaceLetterA_True() {
    WordPuzzle phrase = new WordPuzzle();
    String expected = new String();
    expected = "-nd";
    assertEquals(expected, WordPuzzle.userPhrase("-nd"));
  }
  @Test
    public void isUserPhrase_forReplaceLetterE_True() {
    WordPuzzle phrase = new WordPuzzle();
    String expected = new String();
    expected = "--k";
    assertEquals(expected, WordPuzzle.userPhrase("--k"));
  }
  @Test
    public void isUserPhrase_forReplaceLetterI_True() {
    WordPuzzle phrase = new WordPuzzle();
    String expected = new String();
    expected = "-t";
    assertEquals(expected, WordPuzzle.userPhrase("-t"));
  }
  @Test
    public void isUserPhrase_forReplaceLetterO_True() {
    WordPuzzle phrase = new WordPuzzle();
    String expected = new String();
    expected = "-n";
    assertEquals(expected, WordPuzzle.userPhrase("-n"));
  }
  @Test
    public void isUserPhrase_forReplaceLetterU_True() {
    WordPuzzle phrase = new WordPuzzle();
    String expected = new String();
    expected = "-gly";
    assertEquals(expected, WordPuzzle.userPhrase("-gly"));
  }
  @Test
    public void isUserPhrase_forReplaceAllVowels_True() {
    WordPuzzle phrase = new WordPuzzle();
    String expected = new String();
    expected = "Th-t -s -n -gly sw--t-r";
    assertEquals(expected, WordPuzzle.userPhrase("Th-t -s -n -gly sw--t-r"));
  }
}
