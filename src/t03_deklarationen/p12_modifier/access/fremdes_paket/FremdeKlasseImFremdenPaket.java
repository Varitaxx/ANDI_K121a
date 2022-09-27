package t03_deklarationen.p12_modifier.access.fremdes_paket;

import t03_deklarationen.p12_modifier.access.eigenes_paket.MeineKlasse;

public class FremdeKlasseImFremdenPaket {

  // ######################################## TESTEN ########################################

  public void testMethode() {
    System.out.println(MeineKlasse.publicVar);
//    System.out.println(Intro.protectedVar); // Nicht zulässig
//    System.out.println(Intro.defaultVar);   // Nicht zulässig
//    System.out.println(Intro.privateVar);   // Nicht zulässig
  }
}
