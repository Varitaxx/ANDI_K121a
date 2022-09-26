package t04_string_stringbuilder.p03_reguläre_ausdrücke;

public class Test {

  public static void main(String[] args) {
     firstTest();
//    quantifierTest();

    /*
        [A-Z] [A-Za-Z0-9_]
        \\d: Ziffer ==> [0-9]
        \\D: not \\d ==> [^\\d] oder [^0-9]
        \\w: Wortzeichen ===> [a-zA-Z0-9_]
        \\W: kein Wortzeichen ===> [^\\w]
        \\s: Weißraum [ \t\n\r\f\x0B]
        \\S: Kein Weißraum [^\\s]
     */
  }

  public static void firstTest() {
    String eingabe = "Meine PIN: 1478, Kreditkarte: 7845" + ". Ich habe 314 EC-Karten";

    System.out.println(eingabe);

    String ausgabe = eingabe.replaceAll("Meine", "Deine");
    System.out.println(ausgabe);
    System.out.println("===========================================================");
    System.out.println(eingabe);
    ausgabe = eingabe.replaceAll("\\d", "*"); // [0-9]
    System.out.println(ausgabe);
    ausgabe = eingabe.replaceAll("[0-9]", "*");
    System.out.println(ausgabe);
    System.out.println("===========================================================");
    System.out.println(eingabe);
    ausgabe = eingabe.replaceAll("\\D", "*"); // [^0-9]
    System.out.println(ausgabe);
    ausgabe = eingabe.replaceAll("[^0-9]", "*");
    System.out.println(ausgabe);
    System.out.println("===========================================================");
    System.out.println(eingabe);
    ausgabe = eingabe.replaceAll("\\d{4}", "----");
    System.out.println(ausgabe);
    System.out.println("===========================================================");
    System.out.println(eingabe);
    ausgabe = eingabe.replaceAll(".", "0"); // . steht für ein beliebiges Zeichen
    System.out.println(ausgabe);
    System.out.println("===========================================================");
    System.out.println(eingabe);
    ausgabe = eingabe.replaceAll("[0-9arI-M]", "*");
    System.out.println(ausgabe);
    System.out.println("===========================================================");
    String nummer = "84652123212189";
    String nummerSicher = nummer.substring(0, nummer.length() - 4) + "****";
    System.out.println(nummer);
    System.out.println(nummerSicher);

  }

  public static void quantifierTest() {
    String eingabe = "Meine PIN: 1478. Kreditkarte: 78458" + ". Ich habe 314 EC-Karten: 00, 4582";
    System.out.println(eingabe);

    String ausgabe = eingabe.replaceAll(": \\d{4}", "*");
    System.out.println(ausgabe);

    ausgabe = eingabe.replaceAll("\\d{2,4}", "*");
    System.out.println(ausgabe);

    ausgabe = eingabe.replaceAll("(: )?\\d{4}", "*");
    System.out.println(ausgabe);

    ausgabe = eingabe.replaceAll("(\\d{4})\\.", "$1!");
    System.out.println(ausgabe);

  }

}
