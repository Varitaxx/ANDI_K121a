package t99_wbs_plan.t03_datentypen.p05_methoden.p04_call_by_value;

public class S02_CallByValueMitReferenzen {
  
  public static void main( String[] args ) {
    System.out.println("============================================================");
  
    Person myPerson = new Person();
    myPerson.name = "Peter";

    manipulate(myPerson); // Methodenaufruf mit Übergabe eines Arguments

    System.out.println("myPerson.name: " + myPerson.name); // Hans !!!
    
    
    System.out.println("======================= end of main() ======================");
  }
  
  private static void manipulate( Person param ) {
    // Der Parameter param verhält sich wie eine lokale Variable,
    // die den Wert des Arguments des Methodenaufrufs Annimmt
    // Beim obigen Methodenaufruf => Person param = myPerson;
    System.out.println("param.name: " + param.name);
    param.name = "Hans";
    // =============================================================================
    //param = new Person();
    //param.name = "Hans";
    // in diesem Fall, wird in Zeile 13 "Peter" ausgegeben
    // =============================================================================
    System.out.println("param.name: " + param.name);
  }
  
}


class Person {
  String name;
}