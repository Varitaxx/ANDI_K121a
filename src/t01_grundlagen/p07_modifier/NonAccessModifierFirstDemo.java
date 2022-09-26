package t01_grundlagen.p07_modifier;

// "final" und "abstract" habe gegensätzliche Bedeutung,
// deswegen nicht zusammen anzuwenden

// Alle non-access modifier:
// static, final, abstract, transient, volatile, synchronized, strictfp, native

// Nicht-innere Typdeklarationen: abstract, final, strictfp
public strictfp class NonAccessModifierFirstDemo {
  // Variablen: static, final, transient, volatile
  private static final transient int ZAHL = 12;

  // Konstruktor: KEINE non-access modifier
  NonAccessModifierFirstDemo() { }

  // Methoden:  static, final, abstract, synchronized, strictfp, native
  public static final synchronized strictfp void myMethod() { }

  // Innere Typdeklarationen: static, final, abstract,  strictfp
  strictfp abstract class InnerClass { }
}

