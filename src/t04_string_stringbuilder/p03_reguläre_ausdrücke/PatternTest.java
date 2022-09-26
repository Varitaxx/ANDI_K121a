package t04_string_stringbuilder.p03_reguläre_ausdrücke;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

  public static void main(String[] args) {
    testPattern();
//    searchReplace();
  }

  public static void testPattern() {
    String textEingabe = "7aba0#aab1,";
    String ausgabe = textEingabe;
    String regex = "(\\d\\w)|(\\d#)"; // 4a, 5a, 6a, 7a 
    // Pattern (Muster, das man suchen möchte) kompilieren
    Pattern myPattern = Pattern.compile(regex);
    // Matcher-Objekt erstellen
    Matcher myMatcher = myPattern.matcher(textEingabe);
    
    while(myMatcher.find()) {
      int startIndex = myMatcher.start();
      int endIndex = myMatcher.end();

      System.out.format("An Position %d bis %d gefunden: %s%n", startIndex, endIndex-1, myMatcher.group());
    }
  }
  public static void searchReplace() {
    String textEingabe = "7aba0#aab1W4,6S";
    String ausgabe = textEingabe;
    String regex = "(\\d\\w)|(\\d#)"; // 4a, 5a, 6a, 7a 
    // Pattern (Muster, das man suchen möchte) kompilieren
    Pattern myPattern = Pattern.compile(regex);
    // Matcher-Objekt erstellen
    Matcher myMatcher = myPattern.matcher(textEingabe);
    StringBuffer sb = new StringBuffer(textEingabe.length());
    int counter = 10;
    while(myMatcher.find()) {
      myMatcher.appendReplacement(sb, counter + "");
      counter += 10;
      System.out.println("Gefunden: " + myMatcher.group());
    }
    myMatcher.appendTail(sb);
    System.out.println(textEingabe);
    System.out.println(sb);
  }
}
