package t05_objektorientierung.p05_ueberschreiben.p03_regeln;

import java.io.IOException;
import java.sql.SQLException;

public class Person {
  public void printInfo() throws IOException, SQLException { /*...*/ }

}

class Mitarbeiter extends Person {

  // 1. Sichtbarkeit darf nicht eingeschränkt werden (erweitern ja)
  // 2. "Checked" Exceptions wenn vorhanden müssen eine Untermenge der Super-Exceptions sein
  @Override
  public void printInfo() throws IOException /* , RemoteException */ { /*...*/}
}
