package t99_wbs_plan.t02_grundlagen.p02_variablen_konstanten;


public class S01_VariablenDeklaration {
  
  // Nicht-Lokale Variablen
  // [Zugriffsmodifizierer][Nicht-Zugriffsmodifizierer]* <type> <variable name> [= expression];
  // public                   static transient          int         zahl       =   12 * 5;
  // Nicht-Lokale Variablen: haben immer einen Defaultwert
  int nichtLokaleVar = 12;
  
  public void someMethod() {
    // Lokale Variablen
    // [final] <type> <variable name> [= expression];
    //          int         zahl       =   12 * 5;
    int lokaleVar = 32;
  }
  
}


