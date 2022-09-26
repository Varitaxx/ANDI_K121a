package t99_wbs_plan.t03_datentypen.p06_string.p01_creation;

public class StringIntro {
  public static void main(String[] args) {
    creation();
    assignment();
  }


  private static void creation() {
    String str1 = new String(); // Erstellt den leeren String ""
    String str2 = new String("Hallo");
    String str3 = "Hallo";
  }

  private static void assignment() {
    String s1 = "Das ist eine Zeichenkette";
    String s2 = "Das ist eine Zeichenkette, die durch " +
                    "eine Konkatenation enstanden ist.";
    System.out.println("s2: " + s2);
    String s3 = " 1. Buch erstellen \n 2. Bücher anzeigen \n 3. Buch aktualisieren";
    System.out.println(s3);
  }


}













