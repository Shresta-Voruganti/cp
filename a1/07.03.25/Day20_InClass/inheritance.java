class A 
{
	int i;
	A(int i) 
	{
		this.i = i;
	}
	void square() 
	{
		System.out.println("Square of " + i + " is "+ (i*i));
	}
	void display()
	{
		System.out.println("value of i is " +i);
	}
}

class B extends A 
{
	int i, j;
	B(int i,int j) 
	{
		super(i);  		// calls superclass constructor
		this.j = j;
	}

	void display()
	{
		super.i = 40;
		super.display();
		System.out.println(j + " " + super.i + " " + i);
	}
}

class Demo 
{
	public static void main(String []args) 
	{
		A aob = new A(10);
		aob.square();

		B bob = new B(20,30);
		bob.square();
		bob.display();
	}
}	
