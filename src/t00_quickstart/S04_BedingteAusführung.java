package t00_quickstart;

public class S04_BedingteAusführung {

  public static void main(String[] args) {
    System.out.println("################################################");
    ifTest();
//    ifElseTest();
//    ifElseIfElseTest();
    System.out.println("################################################");
  }

  public static void ifTest() {
    int alter = 16;
    if (alter >= 18) {
      System.out.println("Erwachsen");
    }
  }

  public static void ifElseTest() {
    int zahl = 21;
    if (zahl % 2 == 0) {
      System.out.println("Gerade Zahl");
    } else {
      System.out.println("Ungerade Zahl");
    }
  }


  public static void ifElseIfElseTest() {
    int uhrzeit = 20;
    if (uhrzeit < 11) {
      System.out.println("Guten Morgen.");
    } else if (uhrzeit < 18) {
      System.out.println("Guten Tag.");
    } else {
      System.out.println("Guten Abend");
    }

  }

}
