package t01_grundlagen.p11_operatoren;

public class S04_TernärerOperator {
  public static void main(String[] args) {
    int zahl = 4;
//    int zahl = 5;
    // =============================================
    String zahlIst;
    // =============================================
    // Äquivalent zu folgendem Code:
    if (zahl % 2 == 0)
      zahlIst = "Gerade";
    else
      zahlIst = "Ungerade";
    // ====================
    System.out.println("Zahl ist: " + zahlIst);
    // =============================================

    zahl = -1;
    Person person = zahl > 0 ? new Person("Peter", "Schmidt") : new Person("Hans", "Meyer");
    System.out.println(person.firstname + " " + person.lastname);
  }
}

class Person {
    String firstname;
    String lastname;

  public Person(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }
}