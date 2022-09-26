package t04_string_stringbuilder.p01_string.p04_constant_pool;

import t04_string_stringbuilder.p01_string.p02_immutability.ImmutabilityTest;

public class PoolTest {

  public static void main(String[] args) {
    String s1 = "t09_IO_NIO/abc";
    String s2 = "t09_IO_NIO/abc";
//    String s2 = new String("abc");
    ImmutabilityTest.printWithAddress("s1", s1);
    ImmutabilityTest.printWithAddress("s2", s2); // s1 und s2 referenzieren dasselbe String-Objekt
    System.out.println("===========================================================");
    // == Vergleich der Speicherzellen
    // Bei Referenztypen <=> Vergleich der Adressen
    System.out.println("s1 == s2     : " + (s1 == s2)); // true (wegen Konstanten-Pool von Strings)
    // equals() Vergleich des Inhalts
    System.out.println("s1.equals(s2): " + s1.equals(s2)); // true, Zeichen identisch
  }

}
