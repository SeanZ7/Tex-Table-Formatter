import java.util.Scanner;

public class Table {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter num rows: ");
    int r = in.nextInt();

    System.out.println("Enter num cols: ");
    int c = in.nextInt();

    System.out.println("Enter string to be formatted: ");
    String s = in.next();

    String out = "";
    int k = 0;

    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        if (j != c - 1) {
        out += s.charAt(k++) + " & ";
        } else {
        out += s.charAt(k++);
        }
      }

      out += " \\\\\n";
    }

    System.out.println(out);
  }

}
