package t00_quickstart;

public class S06_Schleifen {

  public static void main(String[] args) {
    System.out.println("################################################");
    forTest();             // Test mit der For-Schleife
//    forArrayTest();      // Array iterieren mit der For-Schleife
//    forEachArrayTest();  // Test mit der erweiterten For-Schleife
//    whileSchleifeTest(); // While-Schleife
    System.out.println("################################################");
  }

  private static void forTest() {
//    for (Initialanweisung ; Iterationsbedingung ; Fortschrittsanweisung)
    for(int i = 1 ; i < 10 ; i++ ) {
      System.out.println(i + ". Zeile");
    }
  }

  private static void forArrayTest() { // Mit Mengenkonstrukten
    int[] zahlenArray = {10, 20, 30};
for(int i = 0; i < zahlenArray.length; i++) { // oder i = i + 2 (jedes 2. Element)
  System.out.println( zahlenArray[i] );
}
  }

  private static void forEachArrayTest() {
    int[] zahlenArray = {10, 20, 30};
    for(int zahl : zahlenArray) { // Enhanced for loop!!!
      System.out.println(zahl);
    }
  }

  private static void whileSchleifeTest() {
    int uhrzeit = 8;
    while(uhrzeit < 18) { // Solange Bedingung erfüllt ist, tue ...
      System.out.println("Es ist " + uhrzeit + "h00");
      uhrzeit++;
    }
  }


}
