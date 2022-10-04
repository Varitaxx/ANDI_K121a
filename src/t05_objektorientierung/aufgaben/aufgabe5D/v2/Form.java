package t05_objektorientierung.aufgaben.aufgabe5D.v2;

import util.ConsoleUtil;

public interface Form {
  double getOberfläche(); // implizit: public abstract
  double getVolumen();    // implizit: public abstract
  void printFormInfo();      // konzipiert für konkrete Formen: Zylinder, Quader, Würfel, ...
  void printSuperFormInfo(); // konzipiert für abstrakte Formen: Prisma, Pyramide

  default void printInfo() {
    ConsoleUtil.printTitle(this.getClass().getSimpleName(), '#',37); // Gibt den String zentriert aus. (37 Zeichen)
    printFormInfo();      // Konkrete Form
    System.out.println("==========");
    printSuperFormInfo(); // Abstrakte Superform
    System.out.println("==========");
    System.out.println("getOberfläche(): " + getOberfläche());
    System.out.println("getVolumen()   : " + getVolumen());
  }

}
