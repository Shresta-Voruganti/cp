class overloading1 {
  static void m1(int x) { System.out.print("int "); }
  static void m1(long x) { System.out.print("long "); }
  static void m1(double x) { System.out.print("double "); }
  public static void main(String [] args) 
  {
    byte b = 5;
    short s = 5;
    long l = 5;
    float f = 5.0f;
    m1(b);
    m1(s);
    m1(l);
    m1(f);
  }
}