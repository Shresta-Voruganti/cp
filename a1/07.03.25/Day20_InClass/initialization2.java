class shape {
  shape() { System.out.println("shape no-arg const"); }
  static {System.out.println("shape 1st static init"); }
  { System.out.println("shape 1st instance init"); }
}

class circle extends shape {
  circle() { System.out.println("circle no-arg const"); }
  static { System.out.println("circle 1st static init"); }
  { System.out.println("circle 1st instance init"); }
  static { System.out.println("circle 2nd static init"); }

  public static void main(String [] args) {
    new circle();
  }
}