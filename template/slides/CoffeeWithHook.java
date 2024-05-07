package patterns.template.slides;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
  public void brew() {
    // implementation here...
  }

  public void addCondiments() {
    // implementation here...
  }

  public boolean customerWantsCondiments() {
    String answer = getUserInput();
    return answer.equals("yes");
  }

  private String getUserInput() {
    // get the user’s answer
    return "yes";
  }
}
