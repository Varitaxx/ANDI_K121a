package _test;

public /*abstract*/ interface Startable {
  
  public static final int MAX = 25;
  
  /*public abstract*/ void start();
  
  int summe( int a, int b ); // weitere abstrakte Methode
  
  default void defaultMethod1() { }
  default void defaultMethod2() { }
  //..
  
  static void staticMethod1() { }
  static void staticMethod2() { }
  // ...
  
  /*static*/ class InnerClass{ }
  /*static*/ interface InnerInterface{ }
  /*static*/ enum InnerEnum{ }
  /*static*/ @interface InnerAnnot{ }
  
  
  
}
