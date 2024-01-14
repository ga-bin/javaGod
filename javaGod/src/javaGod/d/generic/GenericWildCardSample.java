package javaGod.d.generic;

import java.io.ObjectInputStream.GetField;

public class GenericWildCardSample {
  public static void main(String[] args) {
    GenericSample sample = new GenericSample();
    callGenericMethod();
  }

  
  public static <T> void genericMethod(WildcardGeneric<T> c, T addValue) {
    c.setWildCard(addValue);
    T value = c.getWildCard();
    System.out.println(value);
  }
  
  private static void callGenericMethod() {
    WildcardGeneric<String> wildcard = new WildcardGeneric<>();
    genericMethod(wildcard, "Data");
  }
}
