package _test;

public class Test {
  
  public static void main( String[] args ) {
    System.out.println("main() ...");

    //doThis();  // wenn static
    
    Test myTest = new Test();
    myTest.doThis();

  }
  
  private void doThis() {
    System.out.println("doThis() ...");
  }
  
}
