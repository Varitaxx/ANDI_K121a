package t04_string_stringbuilder.p02_stringbuilder;

public class S02_StringBuilderMethods {

  public static void main(String[] args) {
    stringBuilderInfos();
//    stringBuilderManipulation();
//    plusOperator();
//    lengthVsCapacity();
  }

  private static void stringBuilderInfos() {
    StringBuilder sb = new StringBuilder("International");
    System.out.println("sb                : " + sb);
    System.out.println("sb.toString()     : " + sb.toString());
    System.out.println("sb.length()       : " + sb.length());
    System.out.println("sb.charAt(0)      : " + sb.charAt(0));
    System.out.println("sb.indexOf(nat)   : " + sb.indexOf("nat"));
    System.out.println("sb.substring(2)   : " + sb.substring(2));
    System.out.println("sb.substring(2, 7): " + sb.substring(2, 7));
    System.out.println("===========================================================");
    System.out.println("sb: " + sb);
    System.out.println("sb.equals(International): " + sb.equals("International")); // false (equal() bei StringBuilder NICHT überschrieben
    System.out.println("===========================================================");
  }

  private static void stringBuilderManipulation() {
    System.out.println("===========================================================");
    StringBuilder sb = new StringBuilder("International");
    System.out.println("sb                   : " + sb);
    System.out.println("===========================================================");
    System.out.println("sb.append(!!!)       : " + sb.append("!!!"));
    System.out.println("===========================================================");
    System.out.println("sb.insert(5, XXX)    : " + sb.insert(5, "XXX"));
    System.out.println("===========================================================");
    System.out.println("sb.deleteCharAt(5)   : " + sb.deleteCharAt(5));
    System.out.println("===========================================================");
    // Die letzten 3 Zeichen löschen
    int len = sb.length();
    sb.delete(len-3, len);
    System.out.println("sb.delete(len-3, len): " + sb.delete(len - 3, len));
    System.out.println("===========================================================");
    System.out.println("sb.reverse()         : " + sb.reverse());
    System.out.println("======================= ALL IN ONE ========================");
    StringBuilder result = new StringBuilder("t09_IO_NIO/abc")
                                    .append("123")
                                    .append("DEF")
                                    .reverse()
                                    .delete(1, 3);
    System.out.println("result: " + result);
  }

  private static void plusOperator() {
    StringBuilder sb = new StringBuilder("test");
    System.out.println(sb + " ... " + sb);
    // System.out.println(sb + sb); // Compiler-Error
    System.out.println(sb.toString() + sb);
  }

  private static void lengthVsCapacity() {
    StringBuilder sb1 = new StringBuilder();  // Der leere String
    System.out.println("sb1.capacity(): " + sb1.capacity());       // 16
    System.out.println("==================================================");
    StringBuilder sb2 = new StringBuilder(150);              // Interne Kapazität vom StringBuilder
    System.out.println("sb2.length()  : " + sb2.length());   // 0 (size)
    System.out.println("sb2.capacity(): " + sb2.capacity()); // 150
    System.out.println("==================================================");
    sb2.append("animal");
    System.out.println("sb2           : " + sb2);            // "Schmidt"
    System.out.println("sb2.length()  : " + sb2.length());   // 6
    System.out.println("sb2.capacity(): " + sb2.capacity()); // 150
  }

}
