import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class WordPuzzle {
  public static void main(String[] arg) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request,response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");
      String input = request.queryParams("input");
      String userPhrase = userPhrase(input);
      String phrase = input;
      model.put("phrase", phrase);
      model.put("userPhrase", userPhrase);
      model.put("input", request.queryParams("input"));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String userPhrase(String input){
    String phrase = input;
    for (Integer index = 0 ; index < phrase.length() ; index += 1) {
    phrase = phrase.replace("a","-");
    phrase = phrase.replace("e","-");
    phrase = phrase.replace("i","-");
    phrase = phrase.replace("o","-");
    phrase = phrase.replace("u","-");
    }
    return phrase;
  }
}
