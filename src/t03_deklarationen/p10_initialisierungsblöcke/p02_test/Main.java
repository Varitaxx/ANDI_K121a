package t03_deklarationen.p10_initialisierungsblöcke.p02_test;

public class Main {


  public static void main(String[] args) throws ClassNotFoundException {
    System.out.println("============================================================");
    // Bei der ersten effektive Nutzung der Klasse, wird sie in die JVM geladen
    System.out.println("TestClass.counter: " + TestClass.counter);
    System.out.println("============================================================");
    TestClass mc1 = new TestClass();
    TestClass mc2 = new TestClass();
    System.out.println("============================================================");
  }
}

