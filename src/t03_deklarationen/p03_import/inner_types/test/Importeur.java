package t03_deklarationen.p03_import.inner_types.test;

import t03_deklarationen.p03_import.inner_types.OuterClass;

import java.util.Map;


public class Importeur {
  public static void main(String[] args) {
    OuterClass oc = new OuterClass();

    // =====================================================================
    // Nicht-Statische Innere Typ-Deklarationen
    // =====================================================================
    OuterClass.InnerClass ic1;
    OuterClass.InnerClass ic2; // Dank "import ....OuterClass.InnerClass;" oder "....OuterClass.*"
    Map.Entry entry;  //

    // =====================================================================
    // Statische Innere Typ-Deklarationen
    // =====================================================================
    OuterClass.StaticInnerClass staticIc1;
    OuterClass.StaticInnerClass staticIc2; // Dank "import ....OuterClass.*" oder "import static ...OuterClass.StaticInnerClass" oder *
    //    System.out.println(COUNTER); // FEHLER: dafür ist import static notwendig

  }
}
