package t01_grundlagen.p06_nomenklatur.p03_getter_und_setter.p03_bankkonto;

public class BankkontoTest {
  public static void main(String[] args) {
    Bankkonto konto = new Bankkonto(50);

    konto.printKontostand();

    konto.einzahlen(100);

    konto.abbuchen(20);

    konto.printKontostand();
//    konto.kontostand = 100_000; // COMPILER-FEHLER, da kontstand "private" ist

  }
}
