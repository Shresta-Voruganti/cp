class overloading4 {
  static void m1(Byte x, Byte y) { System.out.println("Byte, Byte"); }

  static void m1(byte... x) { System.out.println("byte... "); }

  public static void main(String [] args) {
    byte b = 5;
    m1(b,b); 
    m1(b,b,b);
  }
}