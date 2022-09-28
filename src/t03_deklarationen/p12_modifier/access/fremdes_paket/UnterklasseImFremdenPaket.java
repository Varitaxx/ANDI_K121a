
package t03_deklarationen.p12_modifier.access.fremdes_paket;


import t03_deklarationen.p12_modifier.access.eigenes_paket.MeineKlasse;

// Unterklasse von Intro
public class UnterklasseImFremdenPaket extends MeineKlasse {

  // ======================================== TESTEN ========================================

  public void testMethode() {
    System.out.println(publicVar);
    System.out.println(protectedVar);
    //System.out.println(defaultVar); // Nicht zulässig
    //System.out.println(privateVar); // Nicht zulässig
  }

}
