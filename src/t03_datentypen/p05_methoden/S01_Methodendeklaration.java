package t03_datentypen.p05_methoden;

public class S01_Methodendeklaration {
  // [<acess-modifier>] [<non-access modifier>]   <return-type> methodName( parameter list ) [throws clause] { ... }
  // [<acess-modifier>]    <abstract|native>      <return-type> methodName( parameter list ) [throws clause];

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
