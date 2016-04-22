import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class WordPuzzle {
  public static void main(String[] arg) {

  }
  public static String userPhrase(String input){
    String phrase = "That apple is orange";

    for (Integer index = 0 ; index < phrase.length() ; index += 1) {
    phrase = phrase.replace("a","-");
    phrase = phrase.replace("e","-");
    // phrase = phrase.replace("i","-");
    // phrase = phrase.replace("o","-");
    // phrase = phrase.replace("u","-");
    }

    return phrase;
  }


}
