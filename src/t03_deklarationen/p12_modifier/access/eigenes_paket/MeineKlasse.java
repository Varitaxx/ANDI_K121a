
package t03_deklarationen.p12_modifier.access.eigenes_paket;

public class MeineKlasse {
  static public    int publicVar;     // Sichtbarkeit für alle
  static protected int protectedVar;  // Sichtbarkeit im eigenen Paket und für Unterklassen
  static           int defaultVar;    // Sichtbarkeit im eigenen Paket
  static private   int privateVar;    // Sichtbarkeit NUR in der eigenen "Klasse"


  // ######################################## TESTEN ########################################

  public void testMethode() {
    System.out.println(publicVar);
    System.out.println(protectedVar);
    System.out.println(defaultVar);
    System.out.println(privateVar);
  }
}
