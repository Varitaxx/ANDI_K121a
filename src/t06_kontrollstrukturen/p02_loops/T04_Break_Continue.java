package t06_kontrollstrukturen.p02_loops;

public class T04_Break_Continue {
  public static void main(String[] args) {
    breakTest();
    continueTest();
    System.out.println("=== END ===");
  }

  private static void breakTest() {
    String[] namenListe = {"Schmidt", "Meyer", "Erhardt", "Kinski", "Roland"};
    for( String name : namenListe ) {
      System.out.println(name);
      if (name.toLowerCase().contains("t09_IO_NIO/a")) // beim ersten Namen mit "a" oder "A" aussteigen
        break;
    }
  }

  private static void continueTest() {
    int[] zahlen = {45, 12, 15, 888};

    for( int zahl : zahlen ) {
      // Ungerade Zahlen überspringen
      if (zahl % 2 == 1)
        continue; // direkt zur nächsten Iteration springen
      System.out.println(zahl);
    }
  }

}
