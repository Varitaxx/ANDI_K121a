package t03_deklarationen.p07_interfaces;

public class Test {
  public static void main(String[] args) {
    System.out.println("========================");
    Waschmaschine wm = new Waschmaschine();
    wm.start();
    System.out.println("========================");
    PC pc = new PC();
    pc.start();
    System.out.println("========================");
    Startable st; // Interface Typ
    // =======================
    st = new Waschmaschine(); // st => Waschmaschine-Objekt
    st.start();
    // =======================
    st = new PC();            // st => PC-Objekt
    st.start();
    System.out.println("========================");

  }
}
