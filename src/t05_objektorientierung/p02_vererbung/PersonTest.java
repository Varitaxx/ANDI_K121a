package t05_objektorientierung.p02_vererbung;

public class PersonTest {

  public static void main(String[] args) {
    System.out.println("====================================================");
    Person person = new Person("Peter", "Schmidt");
    person.printInfo();
    System.out.println("====================================================");
    Teilnehmer teilnehmer = new Teilnehmer("Rober","Heppner", "15.10.2021");
    teilnehmer.printInfo();
    System.out.println("====================================================");
    Dozent dozent = new Dozent("Salah", "Lejmi");
    dozent.setPersonalNummer(817);
    dozent.printInfo();
    System.out.println("====================================================");
  }

}
