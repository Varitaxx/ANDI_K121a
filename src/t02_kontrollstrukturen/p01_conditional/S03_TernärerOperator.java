package t02_kontrollstrukturen.p01_conditional;

public class S03_TernärerOperator {
  public static void main(String[] args) {
    String ausgabe = "";
    int zahl = 20;
    // =======================================
    if (zahl % 2 == 0)
      ausgabe = "Gerade Zahl";
    else
      ausgabe = "Ungerade Zahl";
    // =======================================
    System.out.println(ausgabe);

    // =======================================
    // Alternative
    // Ternärer Ausdruck: booleanExpr ? expr1 : expr2;
    ausgabe = zahl % 2 == 0 ? "Gerade Zahl" : "Ungerade Zahl";
    System.out.println(ausgabe);
    // =======================================
    // Alternative
    System.out.println( zahl % 2 == 0 ? "Gerade Zahl" : "Ungerade Zahl" );
//    System.out.println( zahl % 2 == 0 ? "Gerade Zahl" : 13 ); // Zulässig
  }
}
