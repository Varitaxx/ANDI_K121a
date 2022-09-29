package t03_deklarationen.p06_konstruktoren;

public class PersonTest {

  public static void main(String[] args) {
    Person person1 = new Person(); // Konstruktor-Aufruf
    person1.printData();           // Methoden-Aufruf
    // =============================================================================
    Person person2 = new Person();
    person2.vorname = "Peter";
    person2.nachname = "Schmidt";
    person2.printData();
    // =============================================================================
    // Alternative mit einem geeigneten Konstruktor:
    Person person3 = new Person("Hans", "Meyer");
    person3.printData();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Person person1 = new Person();
    //person1.instanceMethod(); // vorname = null, nachname = null (Defaultwert für String und für alle Referenztypen)
    //
    //System.out.println("=============================================");
    //
    //Person person2 = new Person(); // mit "new" wird ein Konstruktor aufgerufen
    //person2.vorname  = "Peter";
    //person2.nachname = "Schmidt";
    //person2.instanceMethod();
    //
    //System.out.println("=============================================");
    //
    //Person person3 = new Person("Hans", "Meyer");
    //person3.instanceMethod();
    //
    //System.out.println("=============================================");

  }



}
