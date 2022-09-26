package t03_deklarationen.p08_enums.p01_example1;
/*
 [access modifier] [non-access modifier*] enum <name> {CONST1, CONST2, ....}
 [access modifier] [non-access modifier*] enum <name> {
   CONST1, CONST2, ....;
   Variablen, Methoden, Konstruktoren, Innere Typdeklarationen
 }
*/

// Alle Enumerations sind intern Unterklassen von Enum
//                 0  1  2   3   4

/**
 * Eine Enum, die Keildergrößen
 */
public enum Size { S, M, L, XL, XXL }

// Alle Konstanten S, M, ... sind vom Typ Size


// =========================================================================
// Wenn enums nicht verfügbar wären ====>
//public class Size {
//  final int i;
//
//  private Size(int i) {
//    this.i = i;
//  }
//
//  public static final Size S   = new Size(0);
//  public static final Size M   = new Size(1);
//  public static final Size L   = new Size(2);
//  public static final Size XL  = new Size(3);
//  public static final Size XXL = new Size(4);
//}
// =========================================================================

