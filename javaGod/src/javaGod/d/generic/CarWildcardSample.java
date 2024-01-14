package javaGod.d.generic;

public class CarWildcardSample {
  public static void main(String[] args) {
    CarWildcardSample sample = new CarWildcardSample();
    sample.callBoundedWildcardMethod();
    sample.callBusBoundedWildCardMethod();
  }

  private void callBoundedWildcardMethod() {
    WildcardGeneric<Car> wildcard = new WildcardGeneric<>();
    wildcard.setWildCard(new Car("Mustang"));
    boundedWildcardMethod(wildcard);
  }

  private void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
    Car value = c.getWildCard();
    System.out.println(value);
  }


  private void callBusBoundedWildCardMethod() {
    WildcardGeneric<Bus> wildcard = new WildcardGeneric<>();
    wildcard.setWildCard(new Bus("6900"));
    boundedWildcardMethod(wildcard);
  }


}
