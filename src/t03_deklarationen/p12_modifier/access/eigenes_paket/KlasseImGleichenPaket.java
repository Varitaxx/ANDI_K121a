package t03_deklarationen.p12_modifier.access.eigenes_paket;

public class KlasseImGleichenPaket {

  // ======================================== TESTEN ========================================

  public void testMethode() {
    System.out.println(MeineKlasse.publicVar);
    System.out.println(MeineKlasse.protectedVar);
    System.out.println(MeineKlasse.defaultVar);
    //System.out.println(MeineKlasse.privateVar); // Nicht zulässig
  }

}
