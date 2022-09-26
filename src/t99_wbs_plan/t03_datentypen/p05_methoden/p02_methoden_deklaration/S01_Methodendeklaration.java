package t99_wbs_plan.t03_datentypen.p05_methoden.p02_methoden_deklaration;

public class S01_Methodendeklaration {
  // ===============================================================================================================
  // [<acess-modifier>] [<non-access modifier>]   <return-type> methodName( parameter list ) [throws clause] { ... }
  // [<acess-modifier>]    <abstract|native>      <return-type> methodName( parameter list ) [throws clause];
  // ===============================================================================================================
  // <acess-modifier>:      public protected --- private
  // <non-access modifier>: static final abstract ....
  // <return-type>: void oder Etwas Anderes (Primitiver Typ, Referenztyp)
  // ===============================================================================================================

  public /* non-static */ void instanzMethode() {

  }

  public      static      void klassenMethode() { // statische Methode

  }

//  public abstract void abstractMethod();

  public static void main(String[] args) {
    System.out.println("======================================================");
    System.out.println("               Methodendeklarationen                  ");
    System.out.println("======================================================");
    S01_Methodendeklaration.klassenMethode(); // Aufruf von überall
    klassenMethode(); // Aufruf von hier aus
    // =============================================================================
    S01_Methodendeklaration md = new S01_Methodendeklaration();
    md.instanzMethode();
    // =============================================================================
  }

}
