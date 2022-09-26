package t03_deklarationen.p03_import.inner_types;

public class OuterClass {

  private int privateVar;

  public static final int COUNTER = 10;

  public class InnerClass {
    int innerVar = privateVar;

  }

  public static class StaticInnerClass { }

}
