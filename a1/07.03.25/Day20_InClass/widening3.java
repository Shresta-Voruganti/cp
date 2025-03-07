class widening3 {
  static void m1(Long x) { System.out.println("Long"); }

  static void m2(Object o) {
    System.out.println("Object"); 
    Byte b2 = (Byte) o; 
    System.out.println(b2);
  }

	public static void main(String[] args) 
	{
    byte b = 5;
    m1(b); 
    m2(b);
	}  
}

