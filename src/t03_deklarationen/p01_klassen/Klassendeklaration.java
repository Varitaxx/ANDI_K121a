package t03_deklarationen.p01_klassen;

// Wenn eine Klasse (oder andere Typdekl.) "public" ist,
// muss sie den gleichen Namen tragen wie die Quelldatei

// [<access modifier>] [<non-access modifier>] class <Klassenname> extends … implements …,…,… { ... }
public class Klassendeklaration {
  // Instanziierung NICHT zulässig, da die Klasse "abstract" ist
  AbstractClass ac; // = new AbstractClass();
}

abstract class AbstractClass { }

enum Size { }


interface Startable { }

// ========================================================
final class FinalClass {}
// Unterklasse NICHT zulässig, da FinalClass "final" ist.
class SubClass /* extends FinalClass */ {}
// ========================================================
