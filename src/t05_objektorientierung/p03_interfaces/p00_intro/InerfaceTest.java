package t05_objektorientierung.p03_interfaces.p00_intro;

public class InerfaceTest {
  public static void main(String[] args) {
//    Startable st1 = new Startable(); // COMPILER-Fehler
    System.out.println("==============================================");
    Waschmaschine wm = new Waschmaschine();
    wm.start();
//    wm = new PC();  // COMPILER-FEHLER

    PC pc = new PC();
    pc.start();

    System.out.println("==============================================");

    Startable st = null;

    st = new Waschmaschine(); // Waschmaschine IST (implements) Startable
    st.start();

    st = new PC();            // PC IST (implements) Startable
    st.start();

  }
}
