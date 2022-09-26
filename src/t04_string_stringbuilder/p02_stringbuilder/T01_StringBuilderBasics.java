package t04_string_stringbuilder.p02_stringbuilder;

import t04_string_stringbuilder.p01_string.p02_immutability.ImmutabilityTest;

public class T01_StringBuilderBasics {
  public static void main(String[] args) {
    basics();
    System.out.println("===========================================================");
    // Kleine Aufgabe: Ein String bilden mit dem Inhalt: abcde....z
//    generateWithString();          // Lösung mit String
//    generateWithStringBuilder();   // Lösung mit StringBuilder
    System.out.println("===========================================================");
  }

  private static void basics() {
    //    StringBuilder sb = "Hallo"; // FEHLER, String-Literale sind nur bei String erlaubt
    StringBuilder sb = new StringBuilder("Hallo");
    ImmutabilityTest.printWithAddress("sb", sb);
    sb.append(" ").append("Welt").append("!");
    ImmutabilityTest.printWithAddress("sb", sb);
  }

  private static void generateWithString() {
    String result = "";
    for(char myChar = 'a'; myChar <= 'z'; myChar++) {
      result += myChar;
      System.out.print(System.identityHashCode(result) + "-");
    }
    System.out.println("\n27 String-Objekte wurden erzeugt");
    System.out.println("result: " + result);
  }

  private static void generateWithStringBuilder() {
    System.out.println("===========================================================");
    StringBuilder result = new StringBuilder(); // Mit dem Empty-String
    for(char myChar = 'a'; myChar <= 'z'; myChar++) {
      result.append(myChar);
      System.out.print(System.identityHashCode(result) + "-");
    }
    System.out.println("\nresult: " + result);
  }

}
