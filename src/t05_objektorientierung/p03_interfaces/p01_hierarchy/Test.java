package t05_objektorientierung.p03_interfaces.p01_hierarchy;

public class Test {
  public static void main(String[] args) {
    System.out.println("I1.KONST: " + I1.KONST); // 12
    System.out.println("I2.KONST: " + I2.KONST); // 88
    
    //System.out.println("Sub.KONST: " + Sub.KONST); // COMPILER-FEHLER
  }
}


interface I1 {
  int KONST = 12;
}

interface I2 {
  int KONST = 88;
}

interface Sub extends I1, I2 {
}
