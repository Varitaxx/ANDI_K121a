package t99_wbs_plan.t01_überblick.p01_erste_java_klasse;

public class Test {
  
  public static void main( String[] args ) {
    System.out.println( 12 * 34 * 58 ); 
    System.out.println("========================================================================");
    System.out.println("|   Vorname   |      Nachname     |    Adresse                         |");
    System.out.println("========================================================================");
    System.out.println("|   Peter     |      Schmidt      |    Gartenweg 12a, 50478 Köln       |");
    System.out.println("|   Hans      |      Meyer        |    Bahnstr. 40, 40147 Dortmund     |");
    System.out.println("========================================================================");
    someMethod(); // staticMethod() muss "static" sein
  }
  
  public static void someMethod() {
    System.out.println("blabla ...");
  }
}

