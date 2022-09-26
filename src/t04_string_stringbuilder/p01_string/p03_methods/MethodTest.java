package t04_string_stringbuilder.p01_string.p03_methods;

import t04_string_stringbuilder.p01_string.p02_immutability.Person;

import java.util.Arrays;
import java.util.List;

public class MethodTest {
  public static void main(String[] args) {
    stringInfos();
//    stringManipulation();
//    concatTest();
//    splitTest();
//    replaceTest();
//    staticMethods();
  }

  // Aufgabe: die letzten 12 Zahlen der Kreditkartennummer mit X ersetzen
  // 1234-4567-9014-8785 => 1234-XXXX-XXXX-XXXX

  private static void stringInfos() {
    //            0123456789012
    String str = "International";
    System.out.println("===========================================================");
    System.out.println("str                : " + str);
    System.out.println("str.toString()     : " + str.toString());      // International
    System.out.println("str.length()       : " + str.length());        // 13
    System.out.println("str.charAt(0)      : " + str.charAt(0));       // I
    System.out.println("str.indexOf(nat)   : " + str.indexOf("nat"));  // 5
    System.out.println("str.substring(2)   : " + str.substring(2));    // ternational
    System.out.println("str.substring(2, 7): " + str.substring(2, 7)); // terna (2 inkl. 7 exkl.)
    System.out.println("===========================================================");
    System.out.println("str: " + str);
    System.out.println("str.equals(International)          : " + str.equals("International"));
    System.out.println("str.equals(INTERNATIONAL)          : " + str.equals("INTERNATIONAL"));
    System.out.println("str.equalsIgnoreCase(INTERNATIONAL): " + str.equalsIgnoreCase("INTERNATIONAL"));
    System.out.println("===========================================================");
    System.out.println("str.contains(nat)  : " + str.contains("nat"));
    System.out.println("str.startsWith(Int): " + str.startsWith("Int"));
    System.out.println("str.endsWith(nal)  : " + str.endsWith("nal"));
    System.out.println("===========================================================");
  }

  private static void stringManipulation() {
    // Manipulation
    String str = "International";
    System.out.println("str: " + str);
    System.out.println("str.toLowerCase(): " + str.toLowerCase());
    System.out.println("str.toUpperCase(): " + str.toUpperCase());
    System.out.println("===========================================================");
    String test = "   Bananen und Äpfel       ";
    System.out.println("[test]       : [" + test + "]");
    System.out.println("[test.trim()]: [" + test.trim() + "]");
  }

  private static void concatTest() {
    String s1 = "Hallo";
    String s2 = "Welt";
    String result = s1.concat(" ").concat(s2);
    System.out.println("result: " + result);
    result = s1 + " " + s2; // Hallo Welt
    System.out.println("result: " + result);
//    result = result + "!!!";
    result += "!!!"; // Hallo Welt!!!
    System.out.println("result: " + result);
    System.out.println("===========================================================");
    int a = 6;
    result = s1 + a + 5; // (a + 5) benutzen um die Addition zu erzwingen
    System.out.println("result: " + result); // Hallo65
    System.out.println("===========================================================");
    Person person = new Person("Peter", "Schmidt");
    result = s1 + " " + person;                // <=> s1 + " " + person.toString();
    System.out.println("result: " + result);   // Hallo Peter Schmidt
//    result = s1.concat(person); // FEHLER
  }

  private static void splitTest() {
//    String input = "Apfel-.- Banane-.- Kiwi -.-  Wasswermelone";
    String input = "Apfel, Banane, Kiwi ,  Wasswermelone";
    // Kommagetrennte Tokens
    String[] obstArray = input.split(","); // input.split("-.-");
    for( String obst : obstArray ) {
      System.out.println(" - " + obst.trim()); // trim() entfernt Weißzeichen
    }
    System.out.println("===========================================================");
    /* Inhalt einer CSV-Datei
      Peter;Schmidt;+492215484545;+49157845821
      Hans;Meyer;+492216546200;+4917158552122
      // TODO Aufgabe => CSV-Datei einlesen und auswerten
     */
    List<String> lines = Arrays.asList("Peter;Schmidt;+492215484545;+49157845821", "Hans;Meyer;+492216546200;+4917158552122");
    for( String zeile : lines ) {
      String[] elemente = zeile.split(";");
      //                  Kunde(vorname           , nachname          , tel1              , tel2              )
//      Kunde kunde = new Kunde(elemente[0].trim(), elemente[1].trim(), elemente[2].trim(), elemente[3].trim() );
//      kundenListe.add(kunde);
      System.out.format("%s %s - Tel1: %s, Tel2: %s%n", elemente[0].trim(), elemente[1].trim(), elemente[2].trim(), elemente[3].trim());
    }

  }

  private static void replaceTest() {
    String str = "Hallo";
    System.out.println("str   : " + str);
    System.out.println("===========================================================");
    String result = str.replace('l', '-');
    System.out.println("result: " + result); // Ha--o
    System.out.println("===========================================================");
    result = str.replace("llo", "ns im Glück");
    System.out.println("result: " + result); // Hans im Glück
    System.out.println("===========================================================");
    str = "4587-8745-9852-6541";
    // Ersetzen mit regulären Ausdrücken: \d: Ziffer <=> [0-9]
    result = str.replaceAll("\\d", "X");   // XXXX-XXXX-XXXX-XXXX
    System.out.println("result: " + result);
    System.out.println("===========================================================");
    result = str.replaceFirst("\\d", "X"); // X587-8745-9852-6541
    System.out.println("result: " + result);
  }

  private static void staticMethods() {
    int zahl = 12;
    String zahlAsString = String.valueOf(12);
    zahlAsString = zahl + ""; // Alternative
    System.out.println("===========================================================");
    String result = String.format("Das Kind ist %d Jahre alt%n", zahl);
    System.out.println("result: " + result);
    System.out.println("===========================================================");
    result = String.join(":", "Peter", "Hans", "Thomas");// Gegenteil von split()
    System.out.println("result: " + result); // Peter:Hans:Thomas
  }
}
