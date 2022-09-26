package t03_deklarationen.p01_klassen;

// Eine Utility-Klasse besteht in der Regel aus statischen Konstanten und Methoden
// Beispiele: System, Math und meine Klasse Util
public class NumberUtil {
  // KEINE Instanzvariablen: NUR statische Konstanten
  private NumberUtil() {}

  public static boolean istPrimzahl(int zahl) {
    for (int i = 2; i <= Math.sqrt(zahl); i++) { // alle Teiler
      if (zahl % i == 0) {
        return false;    // keine Primzahl
      }
    }
    return true; // Primzahl
  }

}
