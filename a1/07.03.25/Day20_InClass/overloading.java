class overloading
{
 	public int add(int x, int y)
 	{
    return(x + y);
 	}
  public int add(int x, int y, int z)
 	{
    return(x + y + z);
 	}
   
  public static void main(String[] args)
  {
    overloading obj = new overloading();
    System.out.println(obj.add(2, 3));
    System.out.println(obj.add(2, 3, 4));
  }
}
