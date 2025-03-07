class overloading3 {
  static void m1(int x, int y) { System.out.println("int,int");}

  static void m1(byte... x) { System.out.println("byte... "); }

  public static void main(String[] args) {
    byte b = 5;
    m1(b,b); 
  }
}