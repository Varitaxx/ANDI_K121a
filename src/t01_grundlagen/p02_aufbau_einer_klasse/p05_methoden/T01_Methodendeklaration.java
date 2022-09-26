package t01_grundlagen.p02_aufbau_einer_klasse.p05_methoden;

public class T01_Methodendeklaration {
  // [<acess-modifier>] [<non-access modifier>] <abstract|native> <return-type> methodName([parameter list]) [throws clause];
  // [<acess-modifier>] [<non-access modifier>]                   <return-type> methodName([parameter list]) [throws clause] { ... }


  public void instanzMethode() { // non-static

  }

  public static void klassenMethode() {

  }

  protected strictfp synchronized void someMethod() { }

//  public abstract void abstractMethod();

  public static void main(String[] args) {
    System.out.println("######################################################");
    System.out.println("               Methodendeklarationen                  ");
    System.out.println("######################################################");
    T01_Methodendeklaration md = new T01_Methodendeklaration();
    md.instanzMethode();
  }

}
