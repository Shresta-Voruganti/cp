class overloading2 {
  static void m1(Integer x) { System.out.println("Integer"); }
  static void m1(long x) { System.out.println("long"); }
  public static void main(String [] args) {
    int i = 5;
    m1(i); 
  }
}