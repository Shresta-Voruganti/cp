import static java.lang.Math.*;
import static java.lang.Integer.*;
import static java.lang.System.out;

public class staticimport {
  public static void main(String[] args) {
    double theta = 30;
    double r = Math.cos(Math.PI * theta);
    System.out.println(r);

    r = cos(PI * theta);
    System.out.println(r);

    out.println(MAX_VALUE);
    out.println(toHexString(42)); 
  }
}

