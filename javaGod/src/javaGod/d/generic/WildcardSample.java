package javaGod.d.generic;

public class WildcardSample {
  
  public static void main(String[] args) {
    WildcardSample sample = new WildcardSample();
    sample.callWildcardMethod();
  }

  private void callWildcardMethod() {
    WildcardGeneric<String> wildcard = new WildcardGeneric<>();
    wildcard.setWildCard("A");
    wildCardStringMethod(wildcard);
  }

  private void wildCardStringMethod(WildcardGeneric<?> c) {
    Object value = c.getWildCard();
    if(value instanceof String) {
      System.out.println(value);
    }
  }

  

  
}

