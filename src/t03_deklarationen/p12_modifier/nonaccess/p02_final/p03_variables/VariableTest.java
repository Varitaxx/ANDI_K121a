package t03_deklarationen.p12_modifier.nonaccess.p02_final.p03_variables;


import java.util.List;

public class VariableTest {
  // ############################################################
  // ################### Statische Konstanten ###################
  // ############################################################

//  public static final double E = 2.718; // OK (Eurlesche Zahl)
  public static final double E; // OK (aber Konstante muss noch gesetzt werden)
  static { // Statischer (Klassen-) Initialisierungsblock
    E = 2.718; // OK
  }


//  static { // Statischer (Klassen-) Initialisierungsblock
//    E = 2.999; // Nochmals Setzen => COMPILER-FEHLER
//  }

  // ############################################################
  // ################ Nicht-statische Konstanten ################
  // ############################################################
  //   public final int START = 20; // OK

  public final int START; // OK (aber Konstante muss noch gesetzt werden)

  {  // Nicht-statischer (Instanz-) Initialisierungsblock
     START = 20; // OK
  }

  {
//     START = 28; // Nochmals Setzen => COMPILER-FEHLER
  }

  public VariableTest() {
//    START = 20;   // OK
//    START = 21; // Nochmals Setzen => COMPILER-FEHLER
//    E = 88;   // FEHLER: statische Konstanten werden nicht im Konstruktor gesetzt
  }

  public VariableTest(int newStart) {
//    START = newStart; // OK
  }

  // ############################################################
  // ######### Lokale Konstanten / Methodenparamter #############
  // ############################################################
  public void someMethod(final int param) {
    // param = 45; // FEHLER, da param "final" ist

    final int zahl = 12;
    // zahl = 13; // // Nochmals Setzen => COMPILER-FEHLER
  }

  public void manipulate(final List<String> names) {
//    names = new ArrayList<>(); // FEHLER: Neuzuweisung NICHT möglich (final)
    names.add("Peter"); // OK (Punktoperationen verletzten keine Regel)
  }

  public void manipulate(final Person person) {
//    person = new Person(); // FEHLER: Neuzuweisung NICHT möglich (final)
    person.setName("Peter"); // OK (Punktoperationen verletzten keine Regel)
  }

}








