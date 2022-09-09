package t01_overview.p05_variablen_konstanten;


public class T01_VariablenDeklaration {
    // Nicht-Lokale Variablen
    // ======================
    /*  Syntax
    [Zugriffsmodifizierer][Nicht-Zugriffsmodifizierer]* <type> <variable name> [= expression];
      public                   static transient          int         zahl       =   12 * 5;
     */
    // Nicht-Lokale Variablen: haben immer einen Defaultwert
    int nichtLokaleVar = 12;
  
    public void someMethod() {
    // Lokale Variablen
    // ======================
      int lokaleVar = 32;
    }

    
}

