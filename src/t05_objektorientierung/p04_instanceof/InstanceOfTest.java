package t05_objektorientierung.p04_instanceof;

import java.time.LocalTime;

public class InstanceOfTest {
  public static void main(String[] args) {
//    Object var = getObject();
    Object var = null;
    //Object var = new Dozent();
    
    //Object[] array = new Dozent[3]; //
    //Object var = array[0]; // null


    // Syntax: Ausdruck instanceof Referenztyp
    System.out.println("var instanceof Dozent           ===> " + (var instanceof Dozent));      // true
    System.out.println("var instanceof Mitarbeiter      ===> " + (var instanceof Mitarbeiter)); // true
    System.out.println("var instanceof Motivationsfähig ===> " + (var instanceof Motivationsfähig)); // true
    System.out.println("var instanceof Person           ===> " + (var instanceof Person));      // true
    System.out.println("var instanceof Object           ===> " + (var instanceof Object));      // true
    System.out.println("var instanceof Teilnehmer       ===> " + (var instanceof Teilnehmer));  // false
// =============================================================================================
// Die Klasse des Objektes ausfindig machen:
    System.out.println("var.getClass().getSimpleName(): " + var.getClass().getSimpleName());
// =============================================================================================
  }

  private static Object getObject() {
    // if Sonne scheint
    LocalTime time = LocalTime.now();
    int second = time.getSecond();
    if (second < 10)
      return new Object();
    else if (second < 20)
      return new Person();
    else if (second < 30)
      return new Mitarbeiter();
    else if (second < 40)
      return new Teilnehmer();
    return new Dozent();
  }
}
