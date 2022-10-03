//When more than one constructor is defined in a class, then it is called constructor Overloading 
//or use of multiple constructor in a class.

//IN TERM OF PARAMETER
//->student(int a, int b);
//->student(double a, double b);
//->student(int a,float b);

//IN TERM OF NUMER OF PARAMATER
//->student(int a,int b);
//->student(int a, int b,int c);
//
//
//There is no destructor in java
package constructor;

public class ConstructorOverloading {

	public static void main(String[] args) {
		Example ex = new Example(10);
		Example ex1 = new Example(20.566f);
		Example ex2 = new Example(50, 50);

	}

}

	class Example
	{
		int x,y,z;
		float k;
	
		Example(int a)
		{
			x=a;
			System.out.println("X:= "+x);
		}
		
		Example(float a)
		{
			k = a;
			System.out.println("Y:= "+k);
		}
		
		Example(int a, int b)
		{
			y = a;
			z = b;
			System.out.println("Y:= "+y);
			System.out.println("Z: "+z);
		}
	}
