package t05_objektorientierung.p03_interfaces.p02_default_static;

public interface MyInterface {
  /* public static final */ double FACTOR = 0.25;

  /* public abstract */ void m1();

  /* public abstract */ void m2();

  /* public abstract */ void m3();

  // Ab Java 8
  /* public */ default void defaultMethod() {
    System.out.println("defaultMethod() in action ...");
  }

  /* public */ static void staticMethod() {
    System.out.println("staticMethod() in action ...");
  }


}
