package javaGod.d.lang;

public class NumberObjects {
  
  public static void main(String[] args) {
    NumberObjects numberObjects = new NumberObjects();
     Long long1 = numberObjects.parseLong("10");
     System.out.println(long1);
     Long long2 = numberObjects.parseLong("r13434");
     System.out.println(long2);
     numberObjects.printOtherBase(1024);
  }

  public long parseLong(String data) {
    Long longData = null;
    try {
      longData = Long.parseLong(data);
    } catch(NumberFormatException e) {
      System.out.println(data + " is not a number");
      return -1;
    }

    return longData;
  }


  public void printOtherBase(long value) {
    System.out.println("Original:" + value);
    System.out.println("Binary:" + Long.toBinaryString(value));
    System.out.println("Hex:" + Long.toHexString(value));
    System.out.println("Octal:" + Long.toOctalString(value));


  }
}
