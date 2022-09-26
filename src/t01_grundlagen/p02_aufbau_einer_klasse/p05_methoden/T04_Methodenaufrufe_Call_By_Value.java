package t01_grundlagen.p02_aufbau_einer_klasse.p05_methoden;

public class T04_Methodenaufrufe_Call_By_Value {
  public static void main(String[] args) {
    // =============================================
    // Test mit primitiven Typen:
    // =============================================
    int zahl = 12;
    manipulateNumber(zahl); // manipulateNumber(12);
    System.out.println("zahl: " + zahl); // 12 !!!

    // =============================================
    // Test mit Referenztypen:
    // =============================================
    Person myPerson = new Person("Peter"); // @A1B2
    manipulatePerson(myPerson);
    System.out.println("myPerson.name: " + myPerson.name); // ???
  }

  private static void manipulateNumber(int param) {
    // int param = 12; // Der Parameter ist eine lokale Variable der Methode
    System.out.println("param: " + param);
    param = 30;
    System.out.println("param: " + param);
  }

 private static void manipulatePerson(Person person) {
    // Person person = myPerson;   // @A1B2
    person.name = "Klaus";
    // person = new Person("Thomas"); // @C1E8
 }
}

class Person {
  String name;

  public Person(String name) {
    this.name = name;
  }
}

