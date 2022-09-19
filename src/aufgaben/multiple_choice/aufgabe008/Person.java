package aufgaben.multiple_choice.aufgabe008;

// ===============================================================================
public class Person {
  
  String name;
  
   //public Person() { } // Default-Konstruktor: Implizit
  
  public Person( String name ) { // neuerName = "Peter" beim Aufruf von Zeile 20
    this.name = name;
  }
  
}
// ===============================================================================
class PersonTest {
  
  public static void main( String[] args ) {
    Person person1 = new Person("Peter");
  }
}
// ===============================================================================
