package t99_wbs_plan.t01_überblick.p05_import;

import java.lang.*;  // IMPLIZIT
import java.util.Scanner; // Importiert die Klasse Scanner aus dem Paket java.util
// java.util.regex.*; werden damit NICHT importiert
import static java.lang.Math.pow;
// => importiert ein statisches Element (Methode)   der Klasse Math
import static java.lang.Math.PI;
// => importiert ein statisches Element (Konstante) der Klasse Math


public class ImportAnweisung {
  public static void main(String[] args) {
    // Dank import java.util.Scanner; möglich
    Scanner myScanner = new Scanner(System.in);
    double res1 = Math.pow(7, 2); // 7² = 49.0
    double res2 = pow(7, 2);      // Dank import static ...
    double radius = 12;
    double umfang1 = 2 * Math.PI * radius; // area = 2 * PI * r
    double umfang2 = 2 * PI * radius;      // Dank import static ...
  }
}

