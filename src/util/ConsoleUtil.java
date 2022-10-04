package util;


public class ConsoleUtil {

  private static final int TIMES = 100;
  private static final String ARROW = "=======> ";
  private static final String CR = "%n";

  // ################################# format #################################
  public static void format(String pattern, char decorationChar, Object... args) {
    print(String.format(pattern, args), decorationChar);
  }

  public static void format(String pattern, Object... args) {
    print(String.format(pattern, args));
  }
  // ##########################################################################

  // ################################# print ##################################
  public static void print(Object message) {
//    int margin = (80 - message.length() - 2) / 2;
//    String decoration = "";
//    for (int i = 0; i < margin; i++) {
//      decoration += '=';
//    }
//    System.out.format("=======> %s%n", message);
    System.out.format(ARROW + "%s" + CR, message);
  }

  public static void print(Object message, char decorationChar) {
//    System.out.format(decorationChar + " " + ARROW + "%s%n", message);
    System.out.format(decorationChar + " " + ARROW + "%s" + CR, message);
  }
  // ##########################################################################

  private static void printSeperator(char decorationChar, int lineWidth) {
    String seperator = "";
    for (int i = 0; i < lineWidth; i++) {
      seperator += decorationChar;
    }
//    seperator += "\n";
    System.out.println(seperator);
  }

  public static void formatTitle(String pattern, Object... args) {
    printTitle(String.format(pattern, args));
  }

  public static void formatTitle(String pattern, char decorationChar, int width, Object... args) {
    printTitle(String.format(pattern, args));
  }

  public static void formatTitle(char decorationChar, int lineWidth, String StringFormat, Object... objects) {
    printTitle(String.format(StringFormat, objects), decorationChar, lineWidth);
  }

  public static void formatTitle(char decorationChar, String StringFormat, Object... objects) {
    printTitle(String.format(StringFormat, objects), decorationChar, TIMES);
  }

  // ################################# printTitle #################################
  public static void printTitle(Object message) {
    printTitle(message, '#', TIMES);
  }

  public static void printTitle(Object message, char decorationChar, int lineWidth) {
    printTitle(message, decorationChar, lineWidth, true);
  }

  public static void printTitle(String pattern, boolean formattedLines, String... lines) {
    printTitle(pattern, '#', TIMES, false);
    if (formattedLines) {
      for (int i = 0; i < lines.length - 1; i = i + 2) {
        format(lines[i], '#', new Object[]{lines[i + 1]});
//        format(lines[i], '#', lines[i + 1]);
      }
    } else {
      for (int i = 0; i < lines.length - 1; i++) {
        print(lines[i], '#');
      }
    }
    printSeperator('#', TIMES);
    System.out.println("\n");
  }

  public static void printTitle(Object message, char decorationChar, int lineWidth, boolean withSeperator) {
    String msgAsString = message.toString();
//    if (message.toString().length() >= lineWidth)
//      lineWidth = message.toString().length() + 10;
//    System.out.println("====> message.length() " + message.length());
    if (msgAsString.length() > lineWidth - 4) {
      message = msgAsString.substring(0, lineWidth - 7) + "...";
    }
//    System.out.println("====> message.length() " + message.length());
    printSeperator(decorationChar, lineWidth);
    int leftMargin = (lineWidth - 2 + msgAsString.length()) / 2;
    int rightMargin = lineWidth - 1 - leftMargin;
    String titleFormat = decorationChar + "%" + leftMargin + "s" + "%" + rightMargin + "s";
//    System.out.println("====> titleFormat: " + titleFormat);
    System.out.println(String.format(titleFormat, message, decorationChar + ""));
    if (withSeperator) {
      printSeperator(decorationChar, lineWidth);
    }
  }
}
