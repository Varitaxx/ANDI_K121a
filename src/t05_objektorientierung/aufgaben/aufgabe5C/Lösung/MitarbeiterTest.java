package t05_objektorientierung.aufgaben.aufgabe5C.Lösung;

public class MitarbeiterTest {

  public static void main(String[] args) {
    Festangestellter festangestellter = new Festangestellter("Peter", "Schmidt");
    festangestellter.setSteuernummer("412/5454/4570");
    festangestellter.setGehalt(3500);

    Freiberufler freiberufler = new Freiberufler("Hans", "Meyer");
    freiberufler.setSteuernummer("521/5874/9985");
    freiberufler.setStundensatz(20);

//    bericht(festangestellter);
//    bericht(freiberufler);

    // Festangesteller IST (extends) ein Mitarbeiter
    // Freiberufler    IST (extends) ein Mitarbeiter
    bericht(festangestellter, freiberufler);

  }

  public static void bericht(Mitarbeiter... mitarbeiterListe) {
    for( Mitarbeiter ma : mitarbeiterListe ) {
      System.out.println("=======================================================");
      ma.printInfo();
      System.out.println("=======================================================");
    }
  }

//  public static void bericht(Festangestellter festangestellter) {
//    System.out.println("=======================================================");
//    festangestellter.printInfo();
//    System.out.println("=======================================================");
//  }
//
//  public static void bericht(Freiberufler freiberufler) {
//    System.out.println("=======================================================");
//    freiberufler.printInfo();
//    System.out.println("=======================================================");
//  }
}
